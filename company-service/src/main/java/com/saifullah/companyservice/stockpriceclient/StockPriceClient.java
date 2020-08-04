package com.saifullah.companyservice.stockpriceclient;

import java.util.Date;
import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("stock-price-service")
public interface StockPriceClient {
	
	@GetMapping(value= "stockPrice/getCompanyStockPrice/{companyCode}/{from}/{to}/{periodicity}")
	public  List<Double> getCompanyStockPrice(@PathVariable("companyCode") Long companyCode, @PathVariable("from")  Date from, @PathVariable("to")  Date to, @PathVariable("periodicity")  int periodicity);

}