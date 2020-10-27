package com.methods;

public class MeOVerR {
	// This is Super class with method m1.

	// First method with 2 parameters.
	void math(int salary,int months) {
		System.out.println("Total salary received in one year " + (salary * months));
	}

	// This is Sub class with one method math.
	public static class one extends MeOVerR {
		// second method with 3 parameters
		void math(int salary,int month,int year) {
			System.out.println("Total salary received in 5years  " +(salary * month*year));
		}
		//Main method
		public static void main(String args[]) {

			MeOVerR obj1 = new MeOVerR();
			obj1.math(50000,12);

			one obj2 = new one();
			obj2.math(50000,12,5);

		}
	}
}
