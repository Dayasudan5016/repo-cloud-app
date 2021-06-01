package com.cloudapp.entity;

public class ManagerRegistrationDetails {
	
	private int id;
	private String firstName;
	private String lastName;
	private int age ;
	private String phoneNumber;
	private String address;
	private String gender;
	private String email;
	private String password;
	private String approval;
	
	public ManagerRegistrationDetails() {
		super();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getphoneNumber() {
		return phoneNumber;
	}
	public void setphoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}	
	public String getApproval() {
		return approval;
	}
	public void setApproval(String approval) {
		this.approval = approval;
	}

	@Override
	public String toString() {
		return "ManagerRegistrationDetails [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age="
				+ age + ", phoneNumber=" + phoneNumber + ", address=" + address + ", gender=" + gender + ", email="
				+ email + ", password=" + password + ", approval=" + approval + "]";
	}
	
}