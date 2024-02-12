package com.example.demo.exportexcel;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsView;

import com.example.demo.model.Product;

public class ExcelExport extends AbstractXlsView{

	@Override
	protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		
		// define excel file name to be exported
		response.addHeader("Content-Disposition", "attachment; fileName=ProductList.xlsx");
		
		 // read data provided by controller
		@SuppressWarnings("unchecked")
		List<Product> list = (List<Product>) model.get("list");
		
		
		// create one sheet
		Sheet sheet = workbook.createSheet("Product");
		
		 // create row0 as a header
		Row row = sheet.createRow(0);
		
		row.createCell(0).setCellValue("Sr No.");
		row.createCell(1).setCellValue("Product Name");
		row.createCell(2).setCellValue("Price");
		row.createCell(3).setCellValue("HSN");
		
		// create row1 onwards from List<T>
	       int rowNum = 1;
	       for(Product plist : list )
	       {
	    	   Row row0 = sheet.createRow(rowNum++);
	    	   row0.createCell(0).setCellValue(plist.getPid());
	    	   row0.createCell(1).setCellValue(plist.getProd_name());
	    	   row0.createCell(2).setCellValue(plist.getProd_price());
	    	   row0.createCell(3).setCellValue(plist.getProd_hsn());
	       }
		
		
	}

}
