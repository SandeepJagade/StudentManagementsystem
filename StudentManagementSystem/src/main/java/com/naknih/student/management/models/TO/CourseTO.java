package com.naknih.student.management.models.TO;

import java.time.LocalDate;

public class CourseTO {
	
	private int id;
	private String courseName;
	private LocalDate dateAdded;
	private LocalDate dateModified;
	
	public CourseTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CourseTO(int id, String courseName, LocalDate dateAdded, LocalDate dateModified) {
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
		return "CourseTO [id=" + id + ", courseName=" + courseName + ", dateAdded=" + dateAdded + ", dateModified="
				+ dateModified + "]";
	}
	
}
