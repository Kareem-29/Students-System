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

public class StudentCourseMark{
	
	// class StudentCourseMark attributes
	private int quiz;
	private int lab;
	private int homework;
	private int exam;
	private int finalMark;
	 
	// the constructor
	public StudentCourseMark(int quiz, int lab, int homework, int exam) {
		this.quiz = quiz;
		this.lab = lab;
		this.homework = homework;
		this.exam = exam;
	}
	// another constructor 
	public StudentCourseMark() {
		
	}
	
	// methods to set and get the values
	public int getExam() {
		return exam;
	}
	public int getFinalMark() {
		return finalMark;
	}
	public int getHomework() {
		return homework;
	}
	public int getLab() {
		return lab;
	}
	public int getQuiz() {
		return quiz;
	}
	public void setExam(int exam) {
		this.exam = exam;
	}
	public void setFinalMark(int finalMark) {
		this.finalMark = finalMark;
	}
	public void setLab(int lab) {
		this.lab = lab;
	}
	public void setHomework(int homework) {
		this.homework = homework;
	}
	public void setQuiz(int quiz) {
		this.quiz = quiz;
	}
	
	// the method used to set the marks
	public void setMarks(int quiz, int lab, int homework, int exam) {
		this.quiz = quiz;
		this.lab = lab;
		this.homework = homework;
		this.exam = exam;
	}
	
	public void computeFinalMark() {
		finalMark = quiz+exam+lab+homework;
	}
	
	// print
	@Override
	public String toString() {
		return "Quiz: " + quiz + ", Lab: " + lab + ", Homework: " + homework + ", Exam: " + exam
				+ ", Final: " + finalMark;
	}

}
