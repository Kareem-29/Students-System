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

public abstract class CourseCredits {
	
	// attribute
	private int creditHours;

	// constructors
	public CourseCredits(int creditHours) {
		this.creditHours = creditHours;
	}
	
	public CourseCredits() {

	}
	
	public int getCreditHours() {
		return creditHours;
	}
	
	public void setCreditHours(int creditHours) {
		this.creditHours = creditHours;
	}

	@Override
	public String toString() {
		return "UniversityCourse creditHours: " + creditHours;
	}
	
	

}
