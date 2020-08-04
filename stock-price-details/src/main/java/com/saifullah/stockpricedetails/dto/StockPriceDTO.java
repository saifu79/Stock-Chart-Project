package com.saifullah.stockpricedetails.dto;

import java.sql.Date;
import java.sql.Time;

import lombok.Data;

@Data
public class StockPriceDTO {

	private Long companyCode;
	private String stockExchange;
	private Double currentPrice;
	private Date date;
	private String time;
}
