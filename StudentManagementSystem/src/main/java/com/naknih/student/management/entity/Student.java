package com.naknih.student.management.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "student")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "email")
	private String email;

	@Column(name = "address")
	private String address;

	@Column(name = "city")
	private String city;

	@Column(name = "state")
	private String state;

	@Column(name = "mobile_number")
	private String mobileNumber;

	@Column(name = "date_of_birth")
	private LocalDate dateOfBirth;

	@Column(name = "college")
	private String college;

	@Column(name = "passout_year")
	private LocalDate passoutYear;

	@Column(name = "branch")
	private String branch;

	@Column(name = "enrolled_course")
	private boolean isCourseEnrolled;

	@Column(name = "enquiry_date")
	private LocalDateTime enquiryDate;

	@Column(name = "status")
	private boolean status;

	public Student() {
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
		this.enquiryDate = enquiryDate;
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

	public LocalDateTime getEnquiryDate() {
		return enquiryDate;
	}

	public void setEnquiryDate(LocalDateTime enquiryDate) {
		this.enquiryDate = enquiryDate;
	}


	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", address=" + address + ", city=" + city + ", state=" + state + ", mobileNumber=" + mobileNumber
				+ ", dateOfBirth=" + dateOfBirth + ", college=" + college + ", passoutYear=" + passoutYear + ", branch="
				+ branch + ", isCourseEnrolled=" + isCourseEnrolled + ", enquiryDate=" + enquiryDate + ", stauts="
				+ status + "]";
	}
	
}
