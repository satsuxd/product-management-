package com.productmanagement.product.management.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="users")
public class User {
	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generate the ID
	    private int id;

	    @Column(name = "first_name", nullable = false) // Column name in the DB and field settings
	    private String firstName;

	    @Column(name = "family_name", nullable = false)
	    private String familyName;

	    @Column(name = "email", unique = true, nullable = false)
	    private String email;
}
