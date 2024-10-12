package com.crud.entity;

import jakarta.persistence.*;

@Entity
public class UserEntity {
	
	private String name;
	private String abc;
	@Id
	private Integer id;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAbc() {
		return abc;
	}
	public void setAbc(String abc) {
		this.abc = abc;
	}
	
}
