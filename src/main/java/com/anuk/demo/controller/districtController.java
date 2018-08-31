package com.anuk.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anuk.demo.dao.districtDao;
import com.anuk.demo.model.District;

@RestController
public class districtController {

	@Autowired
	districtDao disService;

	
	@GetMapping("/districts")
	public List<District> getDistricts()
	{
		List<District> empDistrict= new ArrayList<>();

	disService.findAll().forEach(empDistrict::add);
	return empDistrict;
		
	}
	
	
	
	
}
