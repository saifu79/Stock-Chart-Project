package com.saifullah.sectorservice.companyclient;

import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.saifullah.sectorservice.dto.CompanyDTO;

@FeignClient("company-service")
public interface CompanyClient {
	
	//@RequestMapping(value="company/sector/{sector}",  method=RequestMethod.GET,  produces=MediaType.APPLICATION_JSON_VALUE)
	@GetMapping(value= "/company/sector/{sector}")
	public Iterable<CompanyDTO> getCompanyDetailsBySector(@PathVariable (name = "sector") String sector);

}
