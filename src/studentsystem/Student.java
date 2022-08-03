/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentsystem;

/**
 *
 * @author Kareem_29
 */
import java.util.ArrayList;

public class Student extends Person{
	// class student attributes
	private int student_ID;
	private String student_Name;
	private String student_Address;
	private String student_Mobile;
	// the array list that contains student courses
	private ArrayList<Course> student_Courses;
	
	// class student constructor
	public Student(int student_ID, String student_Name, String student_Address, String student_Mobile) {
		this.student_ID = student_ID;
		this.student_Name = student_Name;
		this.student_Address = student_Address;
		this.student_Mobile = student_Mobile;
		// create the courses Array List
		student_Courses = new ArrayList<>();
	}
	
	// methods to set and get the values

	public int getStudent_ID() {
		return student_ID;
	}

	public void setStudent_ID(int student_ID) {
		this.student_ID = student_ID;
	}

	public String getStudent_Name() {
		return student_Name;
	}

	public void setStudent_Name(String student_Name) {
		this.student_Name = student_Name;
	}

	public String getStudent_Address() {
		return student_Address;
	}

	public void setStudent_Address(String student_Address) {
		this.student_Address = student_Address;
	}

	public String getStudent_Mobile() {
		return student_Mobile;
	}

	public void setStudent_Mobile(String student_Mobile) {
		this.student_Mobile = student_Mobile;
	}

	public ArrayList<Course> getStudent_Courses() {
		return student_Courses;
	}

	public void setStudent_Courses(ArrayList<Course> student_Courses) {
		this.student_Courses = student_Courses;
	}
	
	// print
	@Override
	public String toString() {
		return "ID: " + student_ID + ", Name: " + student_Name + ", Address: " + student_Address + ", Mobile: " + student_Mobile;
	}
	
}
