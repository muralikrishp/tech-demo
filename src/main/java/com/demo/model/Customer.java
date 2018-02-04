package com.demo.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="customer")
@Data
public class Customer {

	@Id
	@GeneratedValue
	private Long id;
	
	@Column
	private String name;
	
	@Column	
	private String address;
	
	@Column
	private String phone;

	@Column
	private Timestamp createdOn;
	
	@Column
	private Timestamp modifiedOn;
	
}