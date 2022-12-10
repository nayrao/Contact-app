package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "CONTACT_TBL")
@Data
public class Contact {
	@Id
	@GeneratedValue
	private Integer contactId;
	private String contactName;
	private String contactEmail;
	private Long phno;
	
	
	

}
