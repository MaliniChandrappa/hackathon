package com.xworkz.hackathon.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.xworkz.hackathon.dto.ReadDTO;

public class ReadController {
	
	
	public ReadController() {
		System.out.println("invoked "+this.getClass().getSimpleName());
	}
	
	@RequestMapping("/upload")
	public String excelFileRead(@RequestParam("uploadfile" )MultipartFile file,Model model)
	{
try {
	System.out.println(file.isEmpty());

			Workbook workbook=new XSSFWorkbook(file.getInputStream()); 
			Sheet datatypeSheet=workbook.getSheetAt(0);
			
}
catch(IOException e) {
	e.printStackTrace();
}

return "index.jsp";
	
	}

}

