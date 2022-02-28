package com.orella.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orella.models.WishlistModel;
import com.orella.repositories.WishlistRepository;

@RestController
@RequestMapping("/api/v1/")
 public class WishlistController {
	
	@Autowired
	private WishlistRepository wishlistRepo;
	
	@GetMapping ("/allwishlistitems")
	public List<WishlistModel> getAllWishlistItems() {
		return wishlistRepo.findAll();
	}
}
