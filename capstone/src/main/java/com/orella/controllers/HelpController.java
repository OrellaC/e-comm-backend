package com.orella.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orella.models.HelpModel;
import com.orella.repositories.HelpRepository;

@RestController
@RequestMapping("api/v1/")
public class HelpController {
	
	@Autowired
	private HelpRepository helpRepo;
	
	@GetMapping("/allhelprequests")
	public List<HelpModel>getAllHelpRequests(){
		return helpRepo.findAll();
	}
}
