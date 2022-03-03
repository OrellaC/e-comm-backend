package com.orella.capstone.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orella.capstone.exceptions.ResourceNotFoundException;
import com.orella.capstone.models.HelpModel;
import com.orella.capstone.models.WishlistModel;
import com.orella.capstone.repository.HelpRepository;

@RestController
@RequestMapping("/api/v1")
public class HelpController {

	@Autowired
	private HelpRepository helpRepo;
	
	// Get request that brings ups all issues that are on help table. Fulfills Read requirement in CRUD
		@GetMapping ("/checkallissues")
		public List<HelpModel> getAllHelpIssues() {
			return helpRepo.findAll();
		}
		
		
		//Get request that finds issues on help table by their id number 
		@GetMapping("/findissuebyid/{id}")
		public ResponseEntity<HelpModel> getIssueById(@PathVariable int id){
			HelpModel issue = helpRepo.findById(id)
					.orElseThrow(() -> new ResourceNotFoundException ("Issue type not found."));
					return ResponseEntity.ok(issue);
		}
		
//		Get request that finds issues by their name 
		@GetMapping("/findissuebytype/{issuetype}")
		public List<HelpModel> getIssueByIssuetype (@PathVariable String issuetype){
			List<HelpModel> issue = helpRepo.findByIssuetype(issuetype);
			if(issue.isEmpty()) {
				System.out.println(new ResourceNotFoundException("Issue type with the name " + issuetype + " not found"));
			}
			return helpRepo.findByIssuetype(issuetype);
		}
		
		
//		Post request that allows user to add new issue to help table. Fulfills the Create requirement in CRUD
		@PostMapping("/addissue")
		public HelpModel newItem(@RequestBody HelpModel issue) {
			return helpRepo.save(issue);
	}
		
}
