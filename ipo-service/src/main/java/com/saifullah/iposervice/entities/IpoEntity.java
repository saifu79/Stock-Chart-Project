package com.saifullah.iposervice.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entity that maps the ORDER table.
 */
@Data
@Entity
@Table(name = "IpoDetails")
public class IpoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Ipo_Id")
    private Integer Id;
    
    @Column(name = "Company_Id")
    private long companyId;

    @Column(name = "Company_Name")
    private String companyName;

    @Column(name = "Stock_Exchange")
    private String stockExchange;

    @Column(name = "Price_Per_Share")
    private float pricePerShare;

    @Column(name = "Total_Share")
    private int totalShares;
    
    @Column(name = "Open_Date_Time")
    private String openDateTime;
}
