package com.saifullah.iposervice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.saifullah.iposervice.dto.IpoDTO;
import com.saifullah.iposervice.entities.IpoEntity;
import com.saifullah.iposervice.service.IpoService;

@RestController
public class IpoController {

    @Autowired
    private IpoService ipoService;

    @RequestMapping(value = "/ipoDetails/{companyId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public IpoDTO getIpoDetails(@PathVariable (name= "companyId") long companyId){
    	
    	return ipoService.getIpoDetails(companyId);
    }
    
    @RequestMapping(value = "/ipoDetails", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public IpoDTO addIpoDetails(@RequestBody IpoDTO ipoDTO){
        return ipoService.addIpoDetails(ipoDTO);
    }
}
