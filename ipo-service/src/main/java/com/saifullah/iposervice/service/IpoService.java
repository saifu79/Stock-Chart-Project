package com.saifullah.iposervice.service;

import java.util.Optional;

import com.saifullah.iposervice.dto.IpoDTO;
import com.saifullah.iposervice.entities.IpoEntity;

public interface IpoService {

	public IpoDTO addIpoDetails(IpoDTO ipoDTO);
	public IpoDTO getIpoDetails(long companyId);
    
}
