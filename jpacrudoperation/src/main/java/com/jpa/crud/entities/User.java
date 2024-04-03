package com.jpa.crud.entities;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String jobrole;

	public User() {
		super();
	}

	public User(String name, String jobrole) {
		super();
		this.name = name;
		this.jobrole = jobrole;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJobrole() {
		return jobrole;
	}

	public void setJobrole(String jobrole) {
		this.jobrole = jobrole;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", jobrole=" + jobrole + "]";
	}

}
