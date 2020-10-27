package com.practice2;

public class ConstructorEx {

	String greet = "hi";
	
	//Declared a Constructor without args.
	ConstructorEx(){  
		System.out.println(greet);
	}

	
	//Declared a Constructor with args.	 
	ConstructorEx(String greeting) {
		this.greet = greeting;
	}

	//Declaring the main method.
	public static void main(String args[]) {

		ConstructorEx obj1 = new ConstructorEx();
		//System.out.println(obj1.greet);
		ConstructorEx obj2 = new ConstructorEx("Hi, I am parameterized!!!")	;
		System.out.println(obj2.greet);

//		print();
//		print("Helloooooo");
//		print("Hiiiiiiiiiiii");

	}
	
	public static void print() {
		System.out.println("I don't have anything to print");
	}
	
	public static void print(String greeting) {
		System.out.println("I am printing the greeting and the greeting is " + greeting);
	}

}



