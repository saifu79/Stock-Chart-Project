package com.saifullah.iposervice.dto;

import lombok.Data;

/**
 * POJO for holding Order related data
 */

public class IpoDTO {

    private long companyId;
    
	private String companyName;

    private String stockExchange;

    private float pricePerShare;

    private int totalShares;
    
    private String openDateTime;
    
    

	public IpoDTO() {
		// TODO Auto-generated constructor stub
	}

	public IpoDTO(long companyId, String companyName, String stockExchange, float pricePerShare, int totalShares,
			String openDateTime) {
		this.companyId = companyId;
		this.companyName = companyName;
		this.stockExchange = stockExchange;
		this.pricePerShare = pricePerShare;
		this.totalShares = totalShares;
		this.openDateTime = openDateTime;
	}

	public long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(long companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getStockExchange() {
		return stockExchange;
	}

	public void setStockExchange(String stockExchange) {
		this.stockExchange = stockExchange;
	}

	public float getPricePerShare() {
		return pricePerShare;
	}

	public void setPricePerShare(float pricePerShare) {
		this.pricePerShare = pricePerShare;
	}

	public int getTotalShares() {
		return totalShares;
	}

	public void setTotalShares(int totalShares) {
		this.totalShares = totalShares;
	}

	public String getOpenDateTime() {
		return openDateTime;
	}

	public void setOpenDateTime(String openDateTime) {
		this.openDateTime = openDateTime;
	}
	
	
}
