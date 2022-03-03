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
		return wishlistRepo.findAll();
	}
	
	@GetMapping("item/{id}")
	public ResponseEntity<WishlistModel> getItemById(@PathVariable int id){
		WishlistModel item = wishlistRepo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException ("Item not found."));
				return ResponseEntity.ok(item);
	}
	
	@GetMapping("allitems/{itemname}")
	public List<WishlistModel> getItemByItemname (@PathVariable String itemname){
		List<WishlistModel> items = wishlistRepo.findByItemname(itemname);
		if(items.isEmpty()) {
			System.out.println(new ResourceNotFoundException("Wishlist item(s) with the name " + itemname + " not found"));
		}
		return wishlistRepo.findByItemname(itemname);
	}
	
	@PostMapping("additem")
	public WishlistModel newItem(@RequestBody WishlistModel item) {
		return wishlistRepo.save(item);
//}
//
//	@PutMapping("item/{id}")
//	public ResponseEntity<Student> updateStudent(@PathVairable int id, @RequestBody WishlistModel newItem){
//		WishlistModel = wishlistRepo.findById(id)
//				.orElseThrow(() -> new ResourceNotFoundException("Item not found."));
//		foundWishlistModel.setIssuename(newIssue.getIssuename());
//		foundWishlistModel.setIssuedescription(newIssue.getIssuedescription());
//		
//		WishlistModel updatedIssue = wishlistRepo.save(foundIssue);
//		
//		return ResponseEntity.ok(updatedIssue);
//	
}
}