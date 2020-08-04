package com.saifullah.iposervice.service;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.saifullah.iposervice.dao.IpoRepository;
import com.saifullah.iposervice.dto.IpoDTO;
import com.saifullah.iposervice.entities.IpoEntity;

import java.util.Optional;
@Service
public class IpoServiceImpl implements IpoService {
    @Autowired
    private IpoRepository ipoRepository;

    private static final Logger LOGGER = LoggerFactory.getLogger(IpoServiceImpl.class);
    
    @Override
    public IpoDTO addIpoDetails(IpoDTO ipoDTO)
    {
        ModelMapper mapper=new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        IpoEntity ipoEntity=mapper.map(ipoDTO,IpoEntity.class);
        ipoRepository.save(ipoEntity);
		return ipoDTO;
 
    }

    @Override
    public IpoDTO getIpoDetails(long companyId) {
        LOGGER.info("Fetching IPO details for CompanyId: {}", companyId);
        IpoEntity ipoEntity = ipoRepository.findByCompanyId(companyId);
       
        ModelMapper mapper=new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        IpoDTO ipoDTO = mapper.map(ipoEntity, IpoDTO.class);

        return ipoDTO;
    }
}
