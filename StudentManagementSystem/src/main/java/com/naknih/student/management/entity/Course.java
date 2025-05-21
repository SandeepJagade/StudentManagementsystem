package com.naknih.student.management.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "course")
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "course_name")
	private String courseName;
	
	@Column(name ="date_added")
	private LocalDate dateAdded;
	
	@Column(name ="date_modified")
	private LocalDate dateModified;
	
	
	
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(int id, String courseName, LocalDate dateAdded, LocalDate dateModified) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.dateAdded = dateAdded;
		this.dateModified = dateModified;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public LocalDate getDateAdded() {
		return dateAdded;
	}

	public void setDateAdded(LocalDate dateAdded) {
		this.dateAdded = dateAdded;
	}

	public LocalDate getDateModified() {
		return dateModified;
	}

	public void setDateModified(LocalDate dateModified) {
		this.dateModified = dateModified;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", courseName=" + courseName + ", dateAdded=" + dateAdded + ", dateModified="
				+ dateModified + "]";
	}
	
}
