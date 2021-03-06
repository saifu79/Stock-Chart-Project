package com.saifullah.sectorservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CompanyDTO {

    private String companyName;
    private Double turnover;
    private String ceo;
    private String directors;
    private String stockExchange;
    private String sector;
    private String brief;
    private long companyStockCode;
}
