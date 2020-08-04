package com.saifullah.stockpricedetails.dao;

import java.util.Date;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.saifullah.stockpricedetails.entities.StockPriceEntity;

@Repository
public interface StockPriceRepository extends CrudRepository<StockPriceEntity, Integer>{
	
	@Query(value="select Current_Price from Stock_Price where Company_Code=?1 and Date between ?2 and ?3 Order By date, time limit 1;" , nativeQuery=true)
	public Double getCompanyStockPrice(Long companyCode, Date from, Date to);

}
