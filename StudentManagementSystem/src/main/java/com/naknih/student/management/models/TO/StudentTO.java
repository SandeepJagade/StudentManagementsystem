package com.naknih.student.management.models.TO;

import java.time.LocalDate;

public class StudentTO {

	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String address;
	private String city;
	private String state;
	private String mobileNumber;
	private LocalDate dateOfBirth;
	private String college;
	private LocalDate passoutYear;
	private String branch;
	private boolean isCourseEnrolled;
	
	
	
	
	

	public StudentTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public StudentTO(int id, String firstName, String lastName, String email, String address, String city,
			String state, String mobileNumber, LocalDate dateOfBirth, String college, LocalDate passoutYear,
			String branch, boolean isCourseEnrolled) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.address = address;
		this.city = city;
		this.state = state;
		this.mobileNumber = mobileNumber;
		this.dateOfBirth = dateOfBirth;
		this.college = college;
		this.passoutYear = passoutYear;
		this.branch = branch;
		this.isCourseEnrolled = isCourseEnrolled;
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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public String getCollege() {
		return college;
	}


	public void setCollege(String college) {
		this.college = college;
	}


	public LocalDate getPassoutYear() {
		return passoutYear;
	}


	public void setPassoutYear(LocalDate passoutYear) {
		this.passoutYear = passoutYear;
	}


	public String getBranch() {
		return branch;
	}


	public void setBranch(String branch) {
		this.branch = branch;
	}


	public boolean isCourseEnrolled() {
		return isCourseEnrolled;
	}


	public void setCourseEnrolled(boolean isCourseEnrolled) {
		this.isCourseEnrolled = isCourseEnrolled;
	}


	@Override
	public String toString() {
		return "StudentTO [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", address=" + address + ", city=" + city + ", state=" + state + ", mobileNumber=" + mobileNumber
				+ ", dateOfBirth=" + dateOfBirth + ", college=" + college + ", passoutYear=" + passoutYear + ", branch="
				+ branch + ", isCourseEnrolled=" + isCourseEnrolled + "]";
	}

	
	
}
