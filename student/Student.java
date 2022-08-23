package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("Divya");
	}

	public void studentDept() {
		System.out.println("Computer Science");
	}
	public void studentId() {
		System.out.println("7889");
	}

	public static void main(String[] args) {
		Student record=new Student();
		record.collegeCode();
		record.collegeName();
		record.collegeRank();
		record.deptName();
		record.studentName();
		record.studentDept();
		record.studentId();
	}
}
