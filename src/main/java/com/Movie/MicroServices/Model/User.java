package com.Movie.MicroServices.Model;

import javax.annotation.Generated;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
 
import lombok.Data;
 
@Data
@Document(collection = "users")
public class User {
 
 @Id
 @lombok.Generated
 private String id;
 private String name;
 private String address;
 private Double salary;
 public User() {
	super();
	// TODO Auto-generated constructor stub
}

 public User(String name, String address, Double salary) {
 this.name = name;
 this.address = address;
 this.salary = salary;
 }

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public Double getSalary() {
	return salary;
}

public void setSalary(Double salary) {
	this.salary = salary;
}

@Override
public String toString() {
	return "User [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
}
 
 
}