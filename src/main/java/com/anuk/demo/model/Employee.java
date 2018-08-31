package com.anuk.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class Employee {

@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int id;

private String fullname;

private String address;

@OneToOne
private District district;
	
public Employee() {}


public Employee(int id, String fullname, String address, District district) {
	super();
	this.id = id;
	this.fullname = fullname;
	this.address = address;
	this.district = district;
}





public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getFullname() {
	return fullname;
}

public void setFullname(String fullname) {
	this.fullname = fullname;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public District getDistrict() {
	return district;
}

public void setDistrict(District district) {
	this.district = district;
}

@Override
public String toString() {
	return "Employee [id=" + id + ", fullname=" + fullname + ", address=" + address + ", district=" + district + "]";
}





}
