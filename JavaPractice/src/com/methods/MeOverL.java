package com.methods;

public class MeOverL {
	
   // First method with 2 prameters with different datatatypes.
	  public void homeloan(long principal,double interest)
	  {
		  System.out.println("Homeloan for 10years "+ (principal+principal*interest));
	  }
	// Second method with 3 prameters.
	  public void homeloan(int principal, int interest,int taxx)
	  {
		  System.out.println("Homeloan monthly payment for 10years "+(principal+interest+taxx));
	  }
	// Third method with 3 prameters with different datataypes.
	  public void homeloan(int principal, double interest, double Mtax)
	  {
		  System.out.println("Homeloan monthly payment for 15years  "+(principal+interest+Mtax));
	  }
	  
	  //Main method.
	  public static void main(String[] args)
	  {
		  MeOverL X=new MeOverL();
		  X.homeloan(100000,10);
		  X.homeloan(1000,200,100);
		  X.homeloan(900,100.50,90.25);
	  }

}
