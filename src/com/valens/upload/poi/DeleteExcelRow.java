package com.valens.upload.poi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import org.apache.commons.lang.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;

public class DeleteExcelRow {
	
	private  static String FOLDER = "";
	
	public DeleteExcelRow() throws Exception{
		/*loadConfig();
		System.out.println("init successful");*/
	}
	
	public static void main(String[] args) throws Exception {
		loadConfig();
		
		String currentPath = "";
		if(args.length > 0 &&  StringUtils.isNotBlank(args[0])){
			 currentPath = args[0];
		}else {
			currentPath = FOLDER;
		}
		
		System.out.println("file folder:"+currentPath);
	
		
		 List<File> allFiles = FileUtil.listXlsFiles(currentPath);
		 
			for(File file :allFiles){
				
				String fileName = file.getName();
				String fileFullPath =  currentPath  + fileName;
				
				System.out.println("file path:" + fileFullPath);
			
				InputStream is = new FileInputStream(fileFullPath);
				HSSFWorkbook workbook = new HSSFWorkbook(is);
				HSSFSheet sheet = workbook.getSheetAt(0);
				
				System.out.println("sheet name:" + sheet.getSheetName());
				
				//sheet.setColumnHidden(1, true);
				DeleteExcelRow.removeColumn(sheet, 1, 0);
				DeleteExcelRow.removeColumn(sheet, 8, 0);
				
				/*HSSFWorkbook wb = new HSSFWorkbook();
				wb.createSheet();*/
				
				FileOutputStream fos = new FileOutputStream(fileFullPath);
				workbook.write(fos);
				fos.close();
				
			}
		
	}		
	
	private static void loadConfig() throws Exception {
		Properties config = new Properties();

		FileInputStream in = new FileInputStream("./sys.properties");
		config.load(in);
		FOLDER = config.getProperty("folder");
		in.close();
	}
	
	public static void removeColumn(HSSFSheet sheet, int removeColumnNum, int removeColumnTotal){
		  
		  if(sheet == null){
		   return;
		  }
		  for (Iterator<Row> rowIterator = sheet.rowIterator(); rowIterator.hasNext();) {
		          HSSFRow row = (HSSFRow)rowIterator.next();
		         HSSFCell cell = row.getCell(removeColumnNum);
		         if(cell == null){
		          continue;
		         }
		          row.removeCell(cell);
		         
		          for(int n = removeColumnNum; n < (removeColumnTotal + removeColumnNum); n ++){
		           int columnWidth = sheet.getColumnWidth(n + 1);
		           
		           HSSFCell cell2 = row.getCell(n + 1);
		           
		           if(cell2 == null){
		            break;
		           }
		           sheet.setColumnWidth(n, columnWidth);
		           row.moveCell(cell2, (short)n);
		          }
		  }
		 }
}
