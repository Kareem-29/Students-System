package studentsystem;
import java.util.Scanner;
import java.util.ArrayList;

public class StudentSystem {
	
	public static void main(String[] args) {
		// scanner to take input
		Scanner in = new Scanner(System.in);
		// students Array LiST
		ArrayList<Student> studentsArrayList = new ArrayList<>();
		System.out.println("Welcome To The System ....");
		int userInput=1;
		while(userInput!=16) {
			// user choice
			System.out.println("");
			System.out.println("Enter 1:  To add a new student");
			System.out.println("Enter 2:  To add a course to student");
			System.out.println("Enter 3:  To add course marks for a student");
			System.out.println("Enter 4:  To Search for a student");
			System.out.println("Enter 5:  To Search for a student course");
			System.out.println("Enter 6:  To update student information");
			System.out.println("Enter 7:  To update course for a student");
			System.out.println("Enter 8:  To update course marks for a student");
			System.out.println("Enter 9:  To delete a student");
			System.out.println("Enter 10: To delete a course for a student");
			System.out.println("Enter 11: To delete course marks for a student");
			System.out.println("Enter 12: To view all students");
			System.out.println("Enter 13: To view all students enrroled in particular course");
			System.out.println("Enter 14: To view all students enrroled in particular course with the final mark");
			System.out.println("Enter 15: To view student information with all courses and marks");
			System.out.println("Enter 16: To terminate the program");
			System.out.println("Input Choice: ");
			userInput = in.nextInt();
			
			// switch userInput
			switch (userInput) {
			case 1:
			{
				// the user will input the information
				// then we will create new object and store it in the Array List
				System.out.print("Enter Student ID Number: ");
				int id = in.nextInt();
				System.out.print("Enter Student Name: ");
				String studetName = in.next();
				System.out.print("Enter Student Address: ");
				String studentAddress = in.next();
				System.out.print("Enter Student Mobile number: ");
				String studetMobile = in.next();
				// store the new student to the array list
				studentsArrayList.add(new Student(id, studetName, studentAddress, studetMobile));
				System.out.println("\nThe new student has been added");
				break;
			}
			case 2:
			{
				// ask the user for the student id
				System.out.print("Enter Student ID: ");
				int foundTheStudent=0;
				int id = in.nextInt();
				for(Student student: studentsArrayList) {
					// search for that id number
					if(student.getStudent_ID() == id) {
						// same id
						foundTheStudent=1;
						System.out.print("Enter Course Code: ");
						int courseCode = in.nextInt();
						System.out.print("Enter Course Description: ");
						String courseDescription = in.next();
						// add the new course to the student's courses
						student.getStudent_Courses().add(new Course(courseCode, courseDescription));
						System.out.println("\nThe new course has been added");
					}
				}
				// if the value is 0, it means that no student has that id 
				if(foundTheStudent == 0) {
					System.out.println("Sorry, no student with the id: " + id);
				}
				break;
			}
			case 3:
			{
				// ask the user for the student id
				System.out.print("Enter Student ID: ");
				int foundTheStudent=0;
				int id = in.nextInt();
				int course = 0;
				for(Student student: studentsArrayList) {
					// search for that id number
					if(student.getStudent_ID() == id) {
						// same id
						foundTheStudent=1;
						// ask the user for the course code
						System.out.print("Enter Course Code: ");
						int courseCode = in.nextInt();
						for (Course studentCourse: student.getStudent_Courses()) {
							if(studentCourse.getCode() == courseCode) {
								course=1;
								// call add marks method
								System.out.print("\nEnter The Quiz marks: ");
								int quiz = in.nextInt();
								studentCourse.getStudentMark().setQuiz(quiz);
								System.out.print("Enter The Lab marks: ");
								int lab = in.nextInt();
								studentCourse.getStudentMark().setLab(lab);
								System.out.print("Enter The Homework marks: ");
								int homework = in.nextInt();
								studentCourse.getStudentMark().setHomework(homework);
								System.out.print("Enter The Exam marks: ");
								int exam = in.nextInt();
								studentCourse.getStudentMark().setExam(exam);
								studentCourse.getStudentMark().computeFinalMark();
								System.out.println("The marks have been addedd");
							}
						}
						if(course == 0) {
							System.out.println("The student did not register this course");
						}
						
					}
				}
				// if the value is 0, it means that no student has that id 
				if(foundTheStudent == 0) {
					System.out.println("Sorry, no student with the id: " + id);
				}
				break;
			}
			case 4:
			{
				// ask the user for the student id
				System.out.print("Enter Student ID: ");
				int foundTheStudent=0;
				int id = in.nextInt();
				for(Student student: studentsArrayList) {
					// search for that id number
					if(student.getStudent_ID() == id) {
						// same id
						foundTheStudent=1;
						// display student 
						System.out.println(student.toString());
					}
				}
				// if the value is 0, it means that no student has that id 
				if(foundTheStudent == 0) {
					System.out.println("Sorry, no student with the id: " + id);
				}
				break;
			}
			case 5:
			{
				// ask the user for the student id
				System.out.print("Enter Student ID: ");
				int foundTheStudent=0;
				int id = in.nextInt();
				for(Student student: studentsArrayList) {
					if(student.getStudent_ID() == id) {
						foundTheStudent=1;
						// ask the user for the course code
						System.out.print("Enter Course Code: ");
						int courseCode = in.nextInt();
						int course=0;
						for (Course studentCourse: student.getStudent_Courses()) {
							// search for course
							if(studentCourse.getCode() == courseCode) {
								course=1;
								System.out.println(studentCourse.toString());
							}
						}
						// if the value is 0, it means that no courses has that code
						if(course == 0) {
							System.out.println("The student did not register this course");
						}
						
					}
				}
				// if the value is 0, it means that no student has that id 
				if(foundTheStudent == 0) {
					System.out.println("Sorry, no student with the id: " + id);
				}
				break;
			}
			case 6:
			{
				// ask the user for the student id
				System.out.print("Enter Student ID: ");
				int foundTheStudent=0;
				int id = in.nextInt();
				for(Student student: studentsArrayList) {
					if(student.getStudent_ID() == id) {
						foundTheStudent=1;
						// choices for the user
						System.out.println("Enter 1 To Update The Name");
						System.out.println("Enter 2 To Update The Address");
						System.out.println("Enter 3 To Update The Mobile Number");
						System.out.print("User Choice: ");
						int userEditInput = in.nextInt();
						if(userEditInput == 1) {
							// update the name
							System.out.print("Enter The New Name: ");
							String studentName = in.next();
							student.setStudent_Name(studentName);
							System.out.println("You have updated the name");
						}
						else if(userEditInput == 2) {
							// update the address
							System.out.print("Enter The New Address: ");
							String studentAddress = in.next();
							student.setStudent_Address(studentAddress);
							System.out.println("You have updated the address");
						}
						else if(userEditInput == 3) {
							// update the mobile number
							System.out.print("Enter The New Mobile Number: ");
							String studentMobile = in.next();
							student.setStudent_Mobile(studentMobile);
							System.out.println("You have updated the mobile number");
						}
						else {
							System.out.println("Incorrect Choice Number");
						}
					}
				}
				// if the value is 0, it means that no student has that id 
				if(foundTheStudent == 0) {
					System.out.println("Sorry, no student with the id: " + id);
				}
				break;
			}
			case 7:
			{
				// ask the user for the student id
				System.out.print("Enter Student ID: ");
				int foundTheStudent=0;
				int id = in.nextInt();
				int course = 0;
				for(Student student: studentsArrayList) {
					// search for student
					if(student.getStudent_ID() == id) {
						foundTheStudent=1;
						// ask the user for the course code
						System.out.print("Enter Course Code: ");
						int courseCode = in.nextInt();
						for (Course studentCourse: student.getStudent_Courses()) {
							// search for course
							if(studentCourse.getCode() == courseCode) {
								course=1;
								System.out.print("Enter new course description: ");
								String courseDescription = in.next();
								studentCourse.setDescription(courseDescription);
							}
						}
						// if the value is 0, it means that no courses has that code
						if(course == 0) {
							System.out.println("The student did not register this course");
						}
						
					}
				}
				// if the value is 0, it means that no student has that id 
				if(foundTheStudent == 0) {
					System.out.println("Sorry, no student with the id: " + id);
				}
				break;
			}
			case 8:
			{
				// ask the user for the student id
				System.out.print("Enter Student ID: ");
				int foundTheStudent=0;
				int id = in.nextInt();
				int course = 0;
				for(Student student: studentsArrayList) {
					// search for student
					if(student.getStudent_ID() == id) {
						foundTheStudent=1;
						// ask the user for the course code
						System.out.print("Enter Course Code: ");
						int courseCode = in.nextInt();
						for (Course studentCourse: student.getStudent_Courses()) {
							if(studentCourse.getCode() == courseCode) {
								course=1;
								System.out.print("\nEnter The New Quiz marks: ");
								int quiz = in.nextInt();
								studentCourse.getStudentMark().setQuiz(quiz);
								System.out.print("Enter The New Lab marks: ");
								int lab = in.nextInt();
								studentCourse.getStudentMark().setLab(lab);
								System.out.print("Enter The New Homework marks: ");
								int homework = in.nextInt();
								studentCourse.getStudentMark().setHomework(homework);
								System.out.print("Enter The New Exam marks: ");
								int exam = in.nextInt();
								studentCourse.getStudentMark().setExam(exam);
								studentCourse.getStudentMark().computeFinalMark();
								System.out.println("The marks have been updated");
							}
						}
						// if the value is 0, it means that no courses has that code
						if(course == 0) {
							System.out.println("The student did not register this course");
						}
						
					}
				}
				// if the value is 0, it means that no student has that id 
				if(foundTheStudent == 0) {
					System.out.println("Sorry, no student with the id: " + id);
				}
				break;
			}
			case 9:
			{
				// the object to be removed
				Student s = null;
				// ask the user for the student id
				System.out.print("Enter Student ID: ");
				int foundTheStudent=0;
				int id = in.nextInt();
				for(Student student: studentsArrayList) {
					// search for student
					if(student.getStudent_ID() == id) {
						foundTheStudent=1;
						s = student;
						System.out.println("The student has been deleted");
					}
				}
				// if the value is 0 it means that no student has that id
				if(foundTheStudent == 0) {
					System.out.println("Sorry, no student with the id: " + id);
				}
				// removed the object
				studentsArrayList.remove(s);
				break;
			}
			case 10:
			{
				// object to be removed
				Course c = null;
				// ask the user for the student id
				System.out.print("Enter Student ID: ");
				int foundTheStudent=0;
				int id = in.nextInt();
				int course = 0;
				for(Student student: studentsArrayList) {
					// search for student
					if(student.getStudent_ID() == id) {
						foundTheStudent=1;
						// ask the user for the course code
						System.out.print("Enter Course Code: ");
						int courseCode = in.nextInt();
						for (Course studentCourse: student.getStudent_Courses()) {
							// search for the course
							if(studentCourse.getCode() == courseCode) {
								course=1;
								// object to be removed is the this course
								c = studentCourse;
								System.out.println("The course has been deleted");
								
							}
						}
						// remove the object
						student.getStudent_Courses().remove(c);
						// if the value is 0, it means that no courses has that code
						if(course == 0) {
							System.out.println("The student did not register this course");
						}
						
					}
				}
				// if the value is 0, it means that no student has that id 
				if(foundTheStudent == 0) {
					System.out.println("Sorry, no student with the id: " + id);
				}
				break;
			}
			case 11:
			{
				// ask the user for the student id
				System.out.print("Enter Student ID: ");
				int foundTheStudent=0;
				int id = in.nextInt();
				int course = 0;
				for(Student student: studentsArrayList) {
					// search for student
					if(student.getStudent_ID() == id) {
						foundTheStudent=1;
						// ask the user for the course code
						System.out.print("Enter Course Code: ");
						int courseCode = in.nextInt();
						for (Course studentCourse: student.getStudent_Courses()) {
							if(studentCourse.getCode() == courseCode) {
								course=1;
								studentCourse.deleteMark();
							}
						}
						// if the value is 0, it means that no courses has that code
						if(course == 0) {
							System.out.println("The student did not register this course");
						}
						
					}
				}
				// if the value is 0, it means that no student has that id 
				if(foundTheStudent == 0) {
					System.out.println("Sorry, no student with the id: " + id);
				}
				break;
			}
			case 12:
			{
				int foundTheStudent=0;
				System.out.println("All Students");
				for(Student student: studentsArrayList) {
					foundTheStudent=1;
					System.out.println("######### Student Information #########");
					System.out.println(student.toString());
					System.out.println("######### Student Information #########");
				}
				// if the value is 0, it means that no student has that id 
				if(foundTheStudent == 0) {
					System.out.println("Sorry there are no students");
				}
				break;
			}
			case 13:
			{
				// ask the user for the course code
				System.out.print("Enter Course Code: ");
				int courseCode = in.nextInt();
				int course = 0;
				System.out.println("Student's enrolled in this course");
				for(Student student: studentsArrayList) {
					// search for students
						for (Course studentCourse: student.getStudent_Courses()) {
							// search for course
							if(studentCourse.getCode() == courseCode) {
								course=1;
								System.out.println("######### Student Information #########");
								System.out.println(student.toString());
								System.out.println("######### Student Information #########");
							}
						}
						
				}
				// if the value is 0, it means that no courses has that code
				if(course == 0) {
					System.out.println("Sorry, no student enrroled in this course");
				}
				break;
			}
			case 14:
			{
				// ask the user for the course code
				System.out.print("Enter Course Code: ");
				int courseCode = in.nextInt();
				int course = 0;
				System.out.println("Student's enrolled in this course with their final mark");
				for(Student student: studentsArrayList) {
					// search for student
						for (Course studentCourse: student.getStudent_Courses()) {
							// search for course
							if(studentCourse.getCode() == courseCode) {
								course=1;
								System.out.println("######### Student Information #########");
								System.out.println(student.toString());
								System.out.println("Final Mark: " + studentCourse.getStudentMark().getFinalMark());
								System.out.println("######### Student Information #########");
							}
						}
						
				}
				// if the value is 0, it means that no courses has that code
				if(course == 0) {
					System.out.println("Sorry, no student enrroled in this course");
				}
				break;
			}
			case 15:
			{
				// ask the user for the student id
				System.out.print("Enter Student ID: ");
				int foundTheStudent=0;
				int id = in.nextInt();
				for(Student student: studentsArrayList) {
					// search for student
					if(student.getStudent_ID() == id) {
						foundTheStudent=1;
						System.out.println("######### Student Information #########");
						System.out.println(student.toString());
						for(Course course : student.getStudent_Courses()) {
							// search for course
							System.out.println(course.toString());
							System.out.println(course.getStudentMark().toString());
						}
						System.out.println("######### Student Information #########");
					}
				}
				if(foundTheStudent == 0) {
					// if the value is 0, it means that no student has that id 
					System.out.println("Sorry, no student with the id: " + id);
				}
				break;
			}
			case 16:
			{
				// terminate the program
				break;
			}
			
			default:
				System.out.println("Incorrect input");
				break;
			}
		}
	}

}
