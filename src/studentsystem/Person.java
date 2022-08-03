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

public class Person {
	
	// attribute
	private String birthdate;

	// constructors 
	public Person(String birthdate) {
		this.birthdate = birthdate;
	}
	
	public Person() {
		
	}

	// print
	@Override
	public String toString() {
		return "Person [birthdate=" + birthdate + "]";
	}

	
	
}

