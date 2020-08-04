package com.saifullah.sectorservice.service;

import com.saifullah.sectorservice.dto.CompanyDTO;

public interface SectorService {

	public Iterable<CompanyDTO> getCompanyDetailsBySector(String sector);
}
