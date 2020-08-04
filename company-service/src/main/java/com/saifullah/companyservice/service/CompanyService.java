package com.saifullah.companyservice.service;

import java.util.Date;
import java.util.List;

import com.saifullah.companyservice.dto.CompanyDTO;
import com.saifullah.companyservice.dto.IpoDTO;

public interface CompanyService {

	public CompanyDTO addCompany(CompanyDTO companyDTO);
	
	public List<Double> getCompanyStockPrice(Long companyCode, Date from, Date to, int periodicity);
	public Iterable<CompanyDTO> getMatchingCompanies(String pattern);
	public CompanyDTO getCompanyDetails(String companyName);
	public IpoDTO getIpoDetails(long companyId);
	
	public Iterable<CompanyDTO> getCompanyDetailsBySector(String sector);
	public Iterable<Double> getSectorStockPrice(String sector, Date from, Date to, int period);
	
	public Iterable<CompanyDTO> getCompaniesList(String stockExchange);
}
