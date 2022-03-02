package com.orella.capstone.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orella.capstone.models.WishlistModel;
import com.orella.capstone.repository.WishlistRepository;


@RestController
//@CrossOrigin
@RequestMapping("/api/v1")
 public class WishlistController {
	
	@Autowired
	private WishlistRepository wishlistRepo;
	
	@GetMapping ("/allwishlistitems")
	public List<WishlistModel> getAllWishlistItems() {
		System.out.println("hello");
		return wishlistRepo.findAll();
	}
}
