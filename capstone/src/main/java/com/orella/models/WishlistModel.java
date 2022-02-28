package com.orella.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="wishlist")
public class WishlistModel {
	@Column
	private String itemname;
	@Column
	private String itemdescription;
	
	
	public String getItemname() {
		return itemname;
	}
	
	public void setItemName(String itemname) {
		this.itemname = itemname;
	}
	
	public String getItemdescription() {
		return itemdescription;
	}
	
	public void setItemdescription(String itemdescription) {
		this.itemdescription = itemdescription;
	}
	
	
}
