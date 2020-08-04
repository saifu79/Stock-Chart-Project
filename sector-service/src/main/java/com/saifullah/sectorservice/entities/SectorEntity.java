package com.saifullah.sectorservice.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Sector")
public class SectorEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Sector_Id")
	private Long sectorId;
	
	private String sector;
	
	@Column(name="Company_Name")
	private String comapnyName;
	
	@Column(name="Company_Id")
	private String companyId;

}
