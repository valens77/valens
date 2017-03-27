package com.valens.upload.poi;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PushbackInputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.poi.POIXMLDocument;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * 基于POI的excel工具
 * 
 * @author Administrator
 * 
 */
public class PoiExcelUtils {
	// private static Logger
	// logger=LoggerFactory.getLogger(PoiExcelUtils.class);
	private static Logger logger = Logger.getLogger(PoiExcelUtils.class
			.getName());

	private static String TIP_MSG = "POI EXCEL:";
	private static int ROW_MAX = 65535;

	/**
	 * 
	 * @param out
	 * @param header
	 * @param data
	 *            单属性数据对象
	 * @param sheetName
	 * @param cellstyle
	 *            样式
	 * @param compareKey
	 *            数据中排序的列
	 * @param totalKey
	 *            需要统计的列
	 * @throws Exception
	 * 	response.setHeader("Content-disposition",
						"attachment; filename=" + fileName + ".xls");// 设定输出文件头
				response.setContentType("application/msexcel");// 定义输出类型
	 */
	public static Workbook writeExcel2003( List<PoiHeader> header,
			List<Map> data, String sheetName, CellStyle cellstyle,
			String compareKey, List<String> totalKey) throws Exception {
		//HSSFWorkbook workbook = null;
		Workbook workbook = null;
		Sheet sheet = null;
		if (  header == null || header.size() < 1) {
			return null;
		}
		workbook = new HSSFWorkbook();
		Row row = null;
		int sheetRowNum = 0;
		int sheetAt = 1;

		CellStyle cellStyle = cellstyle;
		if (cellStyle == null) {
			cellStyle = workbook.createCellStyle(); // 创建一个样式
			 
			cellStyle.setFillForegroundColor(HSSFColor.GREEN.index); // 设置颜色
			cellStyle.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
		}
		String sheetname = "sheet";
		if (sheetName != null && !sheetName.equals("")) {
			sheetname = sheetName;
		}

		boolean isTotal = compareKey != null && totalKey != null
				&& totalKey.size() > 0;// 合计列是否存在
		// 排序列是否存在
		Map<String, Double> totalValue = null;
		if (isTotal) {
			isTotal = false;
			totalValue = new HashMap<String, Double>();// 合计值存储
			for (PoiHeader head : header) {
				if (compareKey.equals(head.getHeaderKey())) {
					isTotal = true;
					break;
				}
			}
		}
		String compareValue = "";
		for (int i = 0; i < data.size(); i++) {
			Map map = data.get(i);
			if (map == null) {
				continue;
			}
			if (i == 0 || sheetRowNum > ROW_MAX) {
				sheetRowNum = 0;
				sheetAt=workbook.getNumberOfSheets();
				sheet = workbook.createSheet(++sheetAt + "." + sheetname);
				//sheet = workbook.createSheet(sheetname + "_" + sheetAt);
				setSheetHead(header, sheet, cellStyle);
				sheetRowNum++;
				sheetAt++;
			}
			row = sheet.createRow(sheetRowNum);//
			if (isTotal) {// 需要合计的列
				if (compareValue.equals("")
						|| compareValue.equals(map.get(compareKey))) {
					compareValue = map.get(compareKey).toString();// 新列
					// 加添统计值
				} else {
					compareValue = map.get(compareKey).toString();// 新列
					createTotalRow(header, row, totalValue);
					sheetRowNum++;
					row = sheet.createRow(sheetRowNum);
				}
				for (int k = 0; k < totalKey.size(); k++) {
					String key = totalKey.get(k);
					Object rowValue = map.get(key);
					if (rowValue != null) {
						Double totoalA = totalValue.get(key) == null ? 0d
								: totalValue.get(key);
						totoalA += Double.parseDouble(rowValue.toString());
						totalValue.put(totalKey.get(k), totoalA);
					}
				}
			}
			setRowValue(header, row, map);
			sheetRowNum++;
		}

		if (isTotal) {// 最后统计
			row = sheet.createRow(sheetRowNum);
			createTotalRow(header, row, totalValue);
		}
		//bookWrite(workbook, out);
		return workbook;
	}

	/**
	 * 
	 * @param header
	 * @param row
	 * @param map
	 *            ObjectDataMap
	 */
	private static void setRowValue(List<PoiHeader> header, Row row, Map map) {
		Cell cell = null;
		short cellJ = 0;
		for (PoiHeader exl : header) {
			Object value = map.get(exl.getHeaderKey());
			if (value != null) {
				cell = row.createCell(cellJ);
				// sheet.setColumnWidth(cellJ, (short) 4500);
				cell.setCellType(Cell.CELL_TYPE_BOOLEAN);
				cell.setCellValue(value.toString());
			}
			cellJ++;
		}
	}
	/**
	 * 
	 * @param header
	 * @param row
	 * @param map
	 *            ObjectDataMap
	 */
	private static void setRowValue(List<PoiHeader> header, Row row, List list) {
		Cell cell = null;
		short cellJ = 0;
		 int header_size=header.size();
		 for(int i=0;i<header_size;i++){
			 Object value=list.get(i);
			 if (value != null) {
					cell = row.createCell(cellJ);
					// sheet.setColumnWidth(cellJ, (short) 4500);
					cell.setCellType(Cell.CELL_TYPE_BOOLEAN);
					cell.setCellValue(value.toString());
				}
				cellJ++;
		 }
	}

	/**
	 * 
	 * @param header
	 * @param totalRow
	 * @param totalValue
	 */
	private static void createTotalRow(List<PoiHeader> header,
			Row totalRow, Map<String, Double> totalValue) {
		int cellJ = 0;
		Cell cell = null;
		for (PoiHeader exl : header) {
			if (cellJ == 0) {
				cell = totalRow.createCell(cellJ);
				cell.setCellValue("小计:");
			} else {
				Double value = totalValue.get(exl.getHeaderKey());
				cell = totalRow.createCell(cellJ);
				// sheet.setColumnWidth(cellJ, (short) 4500);
				cell.setCellType(Cell.CELL_TYPE_BOOLEAN);
				if (value != null) {
					cell.setCellValue(value.intValue());
					cell.setCellValue(value.intValue()+ "");
					totalValue.put(exl.getHeaderKey().toString(), 0d);// 合计后清O
				} else {
					//cell.setCellValue(new HSSFRichTextString(""));
					 cell.setCellValue("");
				}
			}
			cellJ++;
		}
	}

	/**
	 * 
	 * @param out
	 * @param header
	 * @param data
	 *            单属性数据对象
	 * @param sheetName
	 * @throws Exception
	 */
	public static Workbook writeExcel2003(List<PoiHeader> header,
			List<Map> data, String sheetName, CellStyle cellstyle)
			throws Exception {
		return writeExcel2003( header, data, sheetName, cellstyle, null, null);
	}

	/**
	 * 生成excel
	 * @param out
	 * @param header 一个sheet一个List<PoiHeader>
	 * @param data
	 *            单属性数据对象
	 * @param sheetName
	 * @throws Exception
	 */
	public static void writeExcelMore2003(OutputStream out,
			List<List<PoiHeader>> header, List<List<Map>> data,
			List<String> sheetName, HSSFCellStyle cellstyle) throws Exception {
		HSSFWorkbook workbook = null;
		HSSFSheet sheet = null;
		if (out == null) {// ||header == null || header.size() < 1
			return;
		}
		workbook = new HSSFWorkbook();
		HSSFRow row = null;
		HSSFCell cell = null;
		int sheetRowNum = 0;

		HSSFCellStyle cellStyle = cellstyle;
		if (cellStyle == null) {
			cellStyle = workbook.createCellStyle(); // 创建一个样式
			cellStyle.setFillForegroundColor(HSSFColor.GREEN.index); // 设置颜色
			cellStyle.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
		}
		String sheetname = "sheet";

		for (int i = 0; i < data.size(); i++) {// sheet
			int sheetAt = 1;
			List<Map> list = data.get(i);
			if (sheetName != null && i < sheetName.size()) {
				sheetname = sheetName.get(i);
			}
			if (list == null) {
				continue;
			}
			for (int j = 0; j < list.size(); j++) {
				Map map = list.get(j);
				if (map == null) {
					continue;
				}
				int header_index=i>(header.size()-1)?header.size()-1:i;
				if (j == 0 || sheetRowNum > ROW_MAX) {// row ROW数据太多会生成新SHEET
					sheetRowNum = 0;
					sheet = workbook.createSheet(sheetname + "_" + sheetAt);
					
					setSheetHead(header.get(header_index), sheet, cellStyle);
					sheetRowNum++;
					sheetAt++;
				}
				row = sheet.createRow(sheetRowNum);
				setRowValue(header.get(header_index), row, map);
				sheetRowNum++;
			}
		}
		bookWrite(workbook, out);
	}
	/**
	 * 
	 * @param out
	 * @param header
	 * @param data
	 *            单属性数据对象
	 * @param sheetName
	 * @throws Exception
	 */
	public static void writeExcelList2003(OutputStream out,
			List<List<PoiHeader>> header, List<List<List>> data,
			List<String> sheetName, HSSFCellStyle cellstyle) throws Exception {
		HSSFWorkbook workbook = null;
		HSSFSheet sheet = null;
		if (out == null) {// ||header == null || header.size() < 1
			return;
		}
		workbook = new HSSFWorkbook();
		HSSFRow row = null;
		HSSFCell cell = null;
		int sheetRowNum = 0;
		
		HSSFCellStyle cellStyle = cellstyle;
		if (cellStyle == null) {
			cellStyle = workbook.createCellStyle(); // 创建一个样式
			cellStyle.setFillForegroundColor(HSSFColor.GREEN.index); // 设置颜色
			cellStyle.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
		}
		String sheetname = "sheet";
		
		for (int i = 0; i < data.size(); i++) {// sheet
			int sheetAt = 1;
			List<List> list = data.get(i);
			if (sheetName != null && i < sheetName.size()) {
				sheetname = sheetName.get(i);
			}
			if (list == null) {
				continue;
			}
			for (int j = 0; j < list.size(); j++) {
				List map = list.get(j);
				if (map == null) {
					continue;
				}
				if (j == 0 || sheetRowNum > ROW_MAX) {// row ROW数据太多会生成新SHEET
					sheetRowNum = 0;
					sheet = workbook.createSheet(sheetname + "_" + sheetAt);
					setSheetHead(header.get(i), sheet, cellStyle);
					sheetRowNum++;
					sheetAt++;
				}
				row = sheet.createRow(sheetRowNum);
				setRowValue(header.get(i), row, map);
				sheetRowNum++;
			}
		}
		bookWrite(workbook, out);
	}

	/**
	 * 输出
	 * 
	 * @param workbook
	 * @param out
	 * @throws IOException
	 */
	private static void bookWrite(Workbook workbook, OutputStream out)
			throws IOException {
		if (workbook != null) {
			workbook.write(out);
			if (out != null) {
				out.flush();
				if (out != null) {
					out.close();
				}
			}
		}
	}

	/**
	 * 设置EXCEL头
	 * 
	 * @param header
	 * @param sheet
	 * @param style
	 *            样式
	 */
	private static void setSheetHead(List<PoiHeader> header, Sheet sheet,
			CellStyle style) {
		if (header != null && header.size() > 0) {
			Row row = sheet.createRow(0);
			short i = 0;
			for (PoiHeader head : header) {
				Cell cell = row.createCell(i);
				cell.setCellValue(head.getHeaderDesc());
				cell.setCellStyle(style);
				i++;
			}
		}
	}

	/**
	 * 读取excel的内容并返回。
	 * 
	 * @param filePath
	 *            文件路径
	 * @param colCount
	 *            列数 EXCEL数据的列数
	 * @param titleCount
	 *            标题行数,,读取数据时跳过标题行
	 * @return 返回二维数组
	 * @throws Exception
	 */
	public static ArrayList excuteXlsFile2003(String filePath, int colCount,
			int titleCount) throws Exception {
		ArrayList rowList = new ArrayList();
		File file = new File(filePath);
		if (file.exists()) {
			// 打开EXCEL文件
			HSSFWorkbook workbook;
			
			try {
				workbook = new HSSFWorkbook(new FileInputStream(file));
			} catch (Exception e) {
				throw e;// NotXlsException();
			}
			int sheetSum = workbook.getNumberOfSheets();
			// 取SHEET
			try {
				for (int sheetAt = 0; sheetAt < sheetSum; sheetAt++) {
					try {
						HSSFSheet sheet = workbook.getSheetAt(sheetAt);// 从第0个开始读
						// workbook.gets
						// 取行迭代器
						Iterator iter = sheet.rowIterator();
						int count = 0;
						while (iter.hasNext()) {
							try {
								// 跳过标题行
								if (count < titleCount) {
									count++;
									iter.next();
									continue;
								}
								count++;
								// 取一行
								HSSFRow row = (HSSFRow) iter.next();
								int cellType = -1;
								Date date = null;
								DateFormat dateFormat = new SimpleDateFormat(
										"yyyy-MM-dd");
								Object cellValue;
								ArrayList colList = new ArrayList();
								for (int i = 0; i < colCount; i++) {
							//for (int i = 0; i < row.getPhysicalNumberOfCells(); i++) {cell之间有空行将会解析不到
									HSSFCell cell = row.getCell((short) i);
									if (cell == null) {
										cellValue = "";
										colList.add(cellValue);
										continue;
									}
									cellType = cell.getCellType();

									// 单元格为数字类型并且是日期格式,非数字类型会转型错误
									if (cellType == Cell.CELL_TYPE_NUMERIC
											&& HSSFDateUtil
													.isCellDateFormatted(cell)) {
										date = cell.getDateCellValue();
										cellValue = dateFormat.format(date);
									} else {
										switch (cellType) {
										
										case Cell.CELL_TYPE_BOOLEAN:
											cellValue = String.valueOf(cell
													.getBooleanCellValue());
											break;
										case Cell.CELL_TYPE_ERROR:
											cellValue = String.valueOf(cell
													.getErrorCellValue());
											break;
										case Cell.CELL_TYPE_FORMULA:////公式  
											cellValue = String.valueOf(cell
													.getCellFormula());
											break;
										case Cell.CELL_TYPE_NUMERIC:////数值类型  
											cellValue = exclude(cell
													.getNumericCellValue());
											break;
										case Cell.CELL_TYPE_STRING:
											cellValue = cell
													.getRichStringCellValue()
													.getString();
											break;
										default:
											cellValue = cell
													.getRichStringCellValue()
													.getString();
										}
									}
									colList.add(cellValue);
								}
								rowList.add(colList);

							} catch (Exception e) {
								logger.warning("读取SHEET" + (sheetAt + 1)
										+ "中的第" + (count + 1) + "ROW发生异常!");
							}
						}
					} catch (Exception e) {
						logger.warning("读取SHEET" + (sheetAt + 1) + "发生异常!");
					}
				}

			} finally {
				workbook = null;
			}
		} else {
			logger.warning("文件不存在:" + filePath);
		}
		return rowList;
	}

	private static Workbook create(InputStream inp) throws IOException,
			org.apache.poi.openxml4j.exceptions.InvalidFormatException {
		if (!inp.markSupported()) {
			inp = new PushbackInputStream(inp, 8);
		}
		if (POIFSFileSystem.hasPOIFSHeader(inp)) {
			logger.log(Level.INFO, "HSSFWorkbook parse");
			return new HSSFWorkbook(inp);
		}
		if (POIXMLDocument.hasOOXMLHeader(inp)) {
			logger.log(Level.INFO, "XSSFWorkbook parse");
			return new XSSFWorkbook(OPCPackage.open(inp));
			//return new XSSFWorkbook(inp);
		}
		throw new IllegalArgumentException("你的excel版本目前poi解析不了");
	}

	/**
	 * 读取excel的内容并返回。
	 * 
	 * @param filePath
	 *            文件路径
	 * @param colCount
	 *            列数 EXCEL数据的列数
	 * @param titleCount
	 *            标题行数,,读取数据时跳过标题行
	 * @return 返回二维数组
	 * @throws Exception
	 */
	public static ArrayList excuteXlsFile(InputStream input, int colCount,
			int titleCount) throws Exception {
		ArrayList rowList = new ArrayList();
		Workbook workbook = create(input);
		int sheetSum = workbook.getNumberOfSheets();
		// int sheetSum =workbook.getNumSheets();
		// 取SHEET
		try {
			for (int sheetAt = 0; sheetAt < sheetSum; sheetAt++) {
				try {
					Sheet xsheet = workbook.getSheetAt(sheetAt);// 从第0个开始读
					// 取行迭代器
					Iterator iter = xsheet.rowIterator();
					int count = 0;
					while (iter.hasNext()) {
						try {
							// 跳过标题行
							if (count < titleCount) {
								count++;
								iter.next();
								continue;
							}
							count++;
							// 取一行
							Row row = (Row) iter.next();
							int cellType = -1;
							Date date = null;
							DateFormat dateFormat = new SimpleDateFormat(
									"yyyy-MM-dd");
							Object cellValue="";
							FormulaEvaluator evaluator = workbook.getCreationHelper().createFormulaEvaluator();
							ArrayList colList = new ArrayList();
							for (int i = 0; i < colCount; i++) {
							//for (int i = 0; i < row.getPhysicalNumberOfCells(); i++) {cell之间有空行将会解析不到
								Cell cell = row.getCell(i);
								if (cell == null) {
									cellValue = "";
									colList.add(cellValue);
									continue;
								}
								cellType = cell.getCellType();
								// 单元格为数字类型并且是日期格式,非数字类型会转型错误
								if (cellType == 0
										&& DateUtil
												.isCellInternalDateFormatted(cell)) {
									date = cell.getDateCellValue();
									cellValue = dateFormat.format(date);
								} else {
									switch (cellType) {
									case Cell.CELL_TYPE_BOOLEAN:
										cellValue = String.valueOf(cell
												.getBooleanCellValue());
										break;
									case Cell.CELL_TYPE_ERROR:
										cellValue = String.valueOf(cell
												.getErrorCellValue());
										break;
									case Cell.CELL_TYPE_FORMULA:
										/*cellValue = String.valueOf(cell
												.getCellFormula());*/
										cellValue = exclude(evaluator.evaluate(cell).getNumberValue());
										break;
									case Cell.CELL_TYPE_NUMERIC:
										cellValue = exclude(cell
												.getNumericCellValue());
										break;
									case Cell.CELL_TYPE_STRING:
										cellValue = cell
												.getRichStringCellValue()
												.getString();
										break;
									case Cell.CELL_TYPE_BLANK:
										//TODO
										break;
									default:
										cellValue = cell
												.getRichStringCellValue()
												.getString();
									}
								}
								colList.add(cellValue);
							}
							rowList.add(colList);

						} catch (Exception e) {
							logger.warning("读取SHEET" + (sheetAt + 1) + "中的第"
									+ (count + 1) + "ROW发生异常!");
						}
					}
				} catch (Exception e) {
					logger.warning("读取SHEET" + (sheetAt + 1) + "发生异常!");
				}
			}
		} finally {
			workbook = null;
		}
		return rowList;
	}

	/**
	 * 
	 * @param d
	 * @return
	 */
	private static String exclude(double d) {
		String ret = "";
		String tmp = "";
		String str = String.valueOf(d);
		int indexE = str.indexOf("E");
		if (indexE > -1) {
			tmp = str.substring(0, indexE);
			int idx = tmp.indexOf(".");
			tmp = tmp.substring(0, idx) + tmp.substring(idx + 1);
			String ePoint=str.substring(indexE+1, str.length());//小数点后位数
			tmp = formatStr(tmp, Integer.parseInt(ePoint)+1, '0', false);
		} else {
			tmp = str;
		}
		int index = tmp.indexOf(".");
		if (index > -1) {
			String str2 = tmp.substring(0, index);
			if (Double.parseDouble(str2) == Double.parseDouble(tmp)) {
				ret = str2;
			} else {
				ret = tmp;
			}
		} else {
			ret = tmp;
		}
		return ret;
	}

	/**
	 * 
	 * @param srcStr
	 * @param objLength 科学记数位数
	 * @param toChar
	 * @param preOrPost 替换的字符向前补或向后补
	 * @return
	 */
	private static String formatStr(String srcStr, int objLength, char toChar,
			boolean preOrPost) {
		srcStr = srcStr == null ? "" : srcStr;
		int count = objLength - srcStr.length();
		char[] tempArr = { toChar };
		if (count > 0) {
			if (preOrPost)
				srcStr = getStrByCount(new String(tempArr), count) + srcStr;
			else {
				srcStr = srcStr + getStrByCount(new String(tempArr), count);
			}
		}else if(count<0){
			srcStr=srcStr.substring(0,srcStr.length()+count)+"."+srcStr.substring(srcStr.length()+count);
		}else {
			;
		}
		return srcStr;
	}

	/**
	 * 
	 * @param srcStr
	 * @param count
	 * @return
	 */
	private static String getStrByCount(String srcStr, int count) {
		return getStrByCount(srcStr, "", count);
	}

	/**
	 * 
	 * @param srcStr
	 * @param splitStr
	 * @param count
	 * @return
	 */
	private static String getStrByCount(String srcStr, String splitStr,
			int count) {
		StringBuffer strBuff = new StringBuffer("");
		if ((!isEmpty(srcStr)) && (splitStr != null) && (count > 0)) {
			while (count-- > 0) {
				strBuff.append(srcStr);
				strBuff.append(splitStr);
			}
		}
		String retStr = strBuff.toString();
		if (!isEmpty(retStr)) {
			retStr = retStr.substring(0, retStr.length() - splitStr.length());
		}
		return retStr;
	}

	/**
	 * 判断是无数据NULL或"
	 * 
	 * @param obj
	 * @return boolean
	 */
	public static boolean isEmpty(Object obj) {
		return (obj == null) || (obj.toString().trim().equals(""));
	}

	public static void main(String[] arg) throws Exception {
		File file=new File("D:/testExls/统一门户省分业务订单明细汇总表（2013年2月）.xlsx");
		//File file=new File("D:/testExls/excel.xls");
		List list = PoiExcelUtils.excuteXlsFile(new FileInputStream(file), 10, 1);
		System.out.println(list);
	}
}
