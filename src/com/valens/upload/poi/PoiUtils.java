package com.valens.upload.poi;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.hssf.util.CellRangeAddress;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class PoiUtils {
	
	public static final String[] ColIndex={"A","B"};
	/**
	 * 
	 * @param cell
	 * @return
	 */
	public static Object getCellValue(Cell cell) {
		Object value = "";
		if (cell != null) {
			int cellType = cell.getCellType();
			DateFormat dateFormat = new SimpleDateFormat(
			"yyyy-MM-dd");
			switch (cellType) {
			case Cell.CELL_TYPE_NUMERIC: // 数字
				if ( HSSFDateUtil.isCellDateFormatted(cell)) {
					
					Date date = cell.getDateCellValue();
					value = dateFormat.format(date);
				}else{
					value = cell.getNumericCellValue();// 获取原有的值
				}
				break;
			case Cell.CELL_TYPE_STRING: // 字符串
				value = cell.getStringCellValue();// 获取原有的值
				break;
			case Cell.CELL_TYPE_BOOLEAN: // Boolean
				value = cell.getBooleanCellValue();
				break;
			case Cell.CELL_TYPE_FORMULA: // 公式
				value = String.valueOf(cell
						.getCellFormula());
				break;
			case Cell.CELL_TYPE_BLANK: // 空值
				break;
			case Cell.CELL_TYPE_ERROR: // 故障
				break;
			default:
				value = cell.getNumericCellValue();// 获取原有的值
				break;
			}
		}
		return value;
	}

	/**
	 * 合并单元格 EG:addMergedRegion(sheet, 0, 0,
	 * sheet.getLastRowNum(),workBook);就是合并第一列的所有相同单元格。
	 * 
	 * @param sheet
	 *            要合并单元格的excel 的sheet
	 * @param cellLine
	 *            要合并的列
	 * @param startRow
	 *            要合并列的开始行
	 * @param endRow
	 *            要合并列的结束行
	 */
	public static void addMergedRegion(Sheet sheet,boolean firstIndex, int cellLine, int startRow,
			int endRow, Workbook workBook) {

		CellStyle style = workBook.createCellStyle(); // 样式对象

		style.setVerticalAlignment(CellStyle.VERTICAL_CENTER);// 垂直
		style.setAlignment(CellStyle.ALIGN_CENTER);// 水平
		// 获取第一行的数据,以便后面进行比较

		String s_will = ""+PoiUtils.getCellValue(sheet.getRow(startRow).getCell(cellLine));
		int index=1;
		CellStyle style2=sheet.getRow(startRow).getCell(cellLine).getCellStyle();
		style2.setVerticalAlignment(CellStyle.VERTICAL_CENTER);// 垂直
		style2.setAlignment(CellStyle.ALIGN_CENTER);// 水平
		CellStyle styleIndex=sheet.getRow(startRow).getCell(0).getCellStyle();
		styleIndex.setVerticalAlignment(CellStyle.VERTICAL_CENTER);// 垂直
		styleIndex.setAlignment(CellStyle.ALIGN_CENTER);// 水平
		for (int i = startRow; i <= endRow; i++) {//从起始行开始
			String s_current = ""+PoiUtils.getCellValue(sheet.getRow(i).getCell(cellLine));
			
				if (s_will.equals(s_current)) {
					;
					//startRow=i;
					//起始行,结束行,起始列结束列
					//sheet.addMergedRegion(new CellRangeAddress((short)startRow,(short)(sheetRowNum-startRow),0,(short)1)); 
				}else{
					s_will=s_current;
					
					sheet.addMergedRegion(new CellRangeAddress((short)startRow,(short)(i-1),cellLine,(short)cellLine)); 
					sheet.getRow(startRow).getCell(cellLine).setCellStyle(style2);
					if(firstIndex){
						sheet.addMergedRegion(new CellRangeAddress((short)startRow,(short)(i-1),0,(short)0)); 
						sheet.getRow(startRow).getCell(0).setCellValue(index++);
						sheet.getRow(startRow).getCell(0).setCellStyle(styleIndex);
					}
					startRow=i;
				}
				if((i)==endRow){
					sheet.addMergedRegion(new CellRangeAddress((short)startRow,(short)(i),cellLine,(short)cellLine)); 
					sheet.getRow(startRow).getCell(cellLine).setCellStyle(style2);
					
					if(firstIndex){
						sheet.addMergedRegion(new CellRangeAddress((short)startRow,(short)(i),0,(short)0)); 
						sheet.getRow(startRow).getCell(0).setCellValue(index++);
						sheet.getRow(startRow).getCell(0).setCellStyle(styleIndex);
					}
				}
				//sheet.addMergedRegion(new CellRangeAddress(0,(short)0,1,(short)0)); 
		}
	}
	public static void main(String args []){
		 	  
		String pointStr= PoiUtils.createPoiColIndex(1152);
		System.out.println(pointStr);
		 }
	
	public static String createPoiColIndex(int col){
		String poiCol="";
		int zs=col/26;//整
		int ys=col%26;//余数
		//System.out.println("整数: "+zs+",余数"+ys);
		  if(zs>0){
			  poiCol=createPoiColIndex(zs-1);
			 // System.out.println(poiCol);
		  }
		 for(int i=(int)'A';i<'A'+26;i++)
		   {
			 if(i==(ys+(int)'A')){
				 poiCol=poiCol+(char)i;
			 }
			
		   }
		return poiCol;
	}
}
