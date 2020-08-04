package com.saifullah.stockpricedetails.entities;


import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "StockPrice")
public class StockPriceEntity {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Integer StockPriceId;

    //@Column(name = "Company_Id")
    //private long companyId;
    
    @Column(name = "Company_Code")
    private Long companyCode;

    @Column(name = "Stock_Exchange")
    private String stockExchange;

    @Column(name = "Current_Price")
    private Double currentPrice;
    
    @Column(name = "Date")
    private Date date;

    @Column(name = "Time")
    private String time;
}
