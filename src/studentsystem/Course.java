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
import java.util.Scanner;

public class Course extends CourseCredits implements Marks{
	
	Scanner in = new Scanner(System.in);
	// course class attributes
	private int code;
	private String description;
	// each course that a student register has a mark
	// we have studentMark object belongs to student course
	private StudentCourseMark studentMark;
	
	// the constructor 
	public Course(int code, String description) {
		this.code = code;
		this.description = description;
		// create the marks object
		studentMark =  new StudentCourseMark();
	}
	
	// getter .. 
	public int getCode() {
		return code;
	}
	
	// setter ...
	public void setCode(int code) {
		this.code = code;
	}
	
	
	// other getters and setters
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public StudentCourseMark getStudentMark() {
		return studentMark;
	}
	
	// print
	@Override
	public String toString() {
		return "Course code: " + code + ", description: " + description;
	}

	@Override
	public void addMarks() {
		
	}

	@Override
	public void updateMarks() {
		
	}

	@Override
	public void deleteMark() {
		studentMark.setExam(0);
		studentMark.setLab(0);
		studentMark.setQuiz(0);
		studentMark.setHomework(0);
		studentMark.setFinalMark(0);
		System.out.println("Marks have been deleted");
		
	}

}

