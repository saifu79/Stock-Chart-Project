package com.saifullah.sectorservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.saifullah.sectorservice.dto.CompanyDTO;
import com.saifullah.sectorservice.service.SectorService;


@RestController
public class SectorController {
	
	@Autowired
	private SectorService sectorService;
	//private CompanyClient companyClient;
	
	@RequestMapping(value="/sector/{sector}",  method=RequestMethod.GET,  produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Iterable<CompanyDTO>> getCompanyDetailsBySector(@PathVariable(name = "sector") String sector){
		//System.out.println("Saifullah");
		//System.out.println("Saifullah Siddiqui" + companyClient.getCompanyDetailsBySector(sector));
		return ResponseEntity.status(HttpStatus.FOUND).body(sectorService.getCompanyDetailsBySector(sector));

		
	}

}
