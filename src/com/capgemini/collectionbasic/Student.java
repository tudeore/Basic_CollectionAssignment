package com.capgemini.collectionbasic;

public class Student {

	private String studentName;
	private int studentId;

	public Student(String studentName, int studentId) {
		super();
		this.studentName = studentName;
		this.studentId = studentId;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentId="
				+ studentId + "]";
	}

}
