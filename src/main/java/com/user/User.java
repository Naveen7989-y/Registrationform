package com.user;

import jakarta.persistence.*;

@Entity
@Table(name = "user")  
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	
	private String firstname;
	private String lastname;
	private String email;
	private String dob;
	private  String contactno;
	
	private String createpassword;
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String firstname, String lastname, String email, String dob, String contactno, String createpassword,
			int id) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.dob = dob;
		this.contactno = contactno;
		this.createpassword = createpassword;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getContactno() {
		return contactno;
	}
	public void setContactno(String contactno) {
		this.contactno = contactno;
	}
	public String getCreatepassword() {
		return createpassword;
	}
	public void setCreatepassword(String createpassword) {
		this.createpassword = createpassword;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "User [firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + ", dob=" + dob
				+ ", contactno=" + contactno + ", createpassword=" + createpassword + ", id=" + id + "]";
	}

	

}
