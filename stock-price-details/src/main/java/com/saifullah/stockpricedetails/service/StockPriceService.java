package com.saifullah.stockpricedetails.service;

import java.util.Date;
import java.util.List;

import com.saifullah.stockpricedetails.entities.StockPriceEntity;

public interface StockPriceService {
	
	
	public List<StockPriceEntity> addStockPrice(List<StockPriceEntity> list);
	public List<Double> getCompanyStockPrice(Long companyCode, Date from, Date to, int periodicity);

}
