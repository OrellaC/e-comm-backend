package com.orella.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="help")
public class HelpModel {
	@Column
	private String issuetype;
	@Column
	private String issuedescription;
	
	public String getIssuetype() {
		return issuetype;
	}
	
	public void setIssuetype(String issuetype) {
		this.issuetype = issuetype;
	}
	
	public String getIssuedescription() {
		return issuedescription;
	}
	
	public void setIssuedescription(String issuedescription) {
		this.issuedescription = issuedescription;
	} 
	
}
