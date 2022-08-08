package com.globallogic.model;

public class Employee {
	
	
	public Employee(int id, String firstname, String lastname, String username, String password, String address,
			int contactnum) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.password = password;
		this.address = address;
		this.contactnum = contactnum;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getContactnum() {
		return contactnum;
	}
	public void setContactnum(int contactnum) {
		this.contactnum = contactnum;
	}
	private int id;
	private String firstname;
	private String lastname;
	private String username;
	private String password;
	private String address;
	private int contactnum;
	

}
