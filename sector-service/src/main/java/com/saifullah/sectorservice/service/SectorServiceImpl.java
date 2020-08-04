package com.saifullah.sectorservice.service;

import java.util.ArrayList;
//import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saifullah.sectorservice.companyclient.CompanyClient;
import com.saifullah.sectorservice.dto.CompanyDTO;

@Service
public class SectorServiceImpl implements SectorService{
	
	@Autowired
	private CompanyClient companyClient;
	
	@Override
	public Iterable<CompanyDTO> getCompanyDetailsBySector(String sector)
	{
		Iterable<CompanyDTO> companyDTO=companyClient.getCompanyDetailsBySector(sector);
		List<CompanyDTO> list = new ArrayList<>();
        ModelMapper mapper=new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        for(CompanyDTO entity: companyDTO)
        {
        	list.add(mapper.map(entity, CompanyDTO.class));
        }
        System.out.println("Saifullah");
		System.out.println(list);
		return companyClient.getCompanyDetailsBySector(sector);
	}

}
