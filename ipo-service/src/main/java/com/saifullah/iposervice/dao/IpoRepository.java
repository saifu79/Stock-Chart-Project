package com.saifullah.iposervice.dao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.saifullah.iposervice.entities.IpoEntity;

@Repository
public interface IpoRepository extends CrudRepository<IpoEntity, Integer>{
	
	public IpoEntity findByCompanyId(long companyId);

}
