package com.saifullah.stockpricedetails.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.*;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.saifullah.stockpricedetails.entities.StockPriceEntity;
import com.saifullah.stockpricedetails.service.StockPriceService;

@RestController
public class StockPriceController {
	
	@Autowired
	private StockPriceService stockPriceService;
	
	
	@PostMapping("/stockPrice/import")
	public List<StockPriceEntity> mapReapExcelDatatoDB(@RequestParam("file") MultipartFile reapExcelDataFile) throws IOException {
	    
	    List< StockPriceEntity> list = new ArrayList<>();
	    
	    XSSFWorkbook workbook = new XSSFWorkbook(reapExcelDataFile.getInputStream());
	    XSSFSheet worksheet = workbook.getSheetAt(0);
	    
	    for(int i=1;i<worksheet.getPhysicalNumberOfRows() ;i++) {
	        StockPriceEntity temp = new StockPriceEntity();
	            
	        XSSFRow row = worksheet.getRow(i);
	         
	        if(row==null)
	        	break;
	       
            temp.setCompanyCode((long) row.getCell(0).getNumericCellValue());
	        temp.setStockExchange(row.getCell(1).getStringCellValue());
            temp.setCurrentPrice((double)row.getCell(2).getNumericCellValue());
            temp.setDate(row.getCell(3).getDateCellValue());
            temp.setTime(row.getCell(4).getStringCellValue());
            list.add(temp);
	        
	    }
	    
	    

	    
	    return stockPriceService.addStockPrice(list);
	}
	
	
	@RequestMapping(value="stockPrice/getCompanyStockPrice/{companyCode}/{from}/{to}/{periodicity}",  method=RequestMethod.GET,  produces=MediaType.APPLICATION_JSON_VALUE)
	public  List<Double> getCompanyStockPrice(@PathVariable("companyCode") Long companyCode, @PathVariable("from")  Date from, @PathVariable("to")  Date to, @PathVariable("periodicity")  int periodicity)
	{
		return stockPriceService.getCompanyStockPrice(companyCode, from, to, periodicity);
	}

}
