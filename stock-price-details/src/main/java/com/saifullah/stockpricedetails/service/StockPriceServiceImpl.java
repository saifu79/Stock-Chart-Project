package com.saifullah.stockpricedetails.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
//import java.util.*;
import java.util.concurrent.TimeUnit;
import java.time.LocalDate;
import java.time.ZoneId;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.saifullah.stockpricedetails.dao.StockPriceRepository;
import com.saifullah.stockpricedetails.entities.StockPriceEntity;

@Service
@EnableTransactionManagement
public class StockPriceServiceImpl implements StockPriceService {
	
	@Autowired
	private StockPriceRepository stockPriceRepository;
	
	
	@Override
	public List<StockPriceEntity> addStockPrice(List<StockPriceEntity> list) {
		
		for(StockPriceEntity entity:list)
			stockPriceRepository.save(entity);
		
		return list;
			
	}
	
	@Override
    @Transactional 
    public List<Double> getCompanyStockPrice(Long companyCode, Date from, Date to, int periodicity)
    {
		long duration = to.getTime()-from.getTime();
		int days= (int)(TimeUnit.MILLISECONDS.toDays(duration)+1);
		List<Double> list =new ArrayList<>();
		Date date1 = from;
		Date date2 = from;
		int inc = days/periodicity;
		int mod = days%periodicity;
		for(int i=0; i<inc; i++)
		{
			from.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
			date2=addDays(date1,periodicity-1);
			list.add(stockPriceRepository.getCompanyStockPrice(companyCode, date1, date2));
			date1=addDays(date2,1);
		}
		if(mod!=0)
		{
			list.add(stockPriceRepository.getCompanyStockPrice(companyCode, date1, date2));
		}
		return list;
    }
	
	public static Date addDays(Date date,int days)
	{
		Calendar c=Calendar.getInstance();
		c.setTime(date);
		c.add(Calendar.DATE,days);
		return new Date(c.getTimeInMillis());
	}
	

}
