package com.greatLearning.customer.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor

public class Customer {
	@Id
	private int id;
	private String firstName;
	private String lastName;
	private String emailAddress;
	public Customer(String firstName, String lastName, String emailAddress) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
	}
	

}
