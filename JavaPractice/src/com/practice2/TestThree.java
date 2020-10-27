package com.practice2;

import com.practice1.*;

 public class TestThree extends TestTwo {
	
	public static void main(String args[]) {
		
	TestThree M=new TestThree();
//	TestOne O=new TestOne();   
	System.out.println(M.agrade);
	System.out.println(M.cgrade);	
	// System.out.println(O.mathtest);  The TestOne class is not accessible as the class is not public.
		//The variable with private Access modifier cannot be accessed in another package and class.
	   
	}
}