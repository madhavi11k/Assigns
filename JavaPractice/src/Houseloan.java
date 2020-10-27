

public class Houseloan {
	 int amount = 200000;
	 double interest =10.25;
	 
	public void h1(int amount,double interest) {
		 System.out.println("Housing loan for 10years : " + (amount*interest));
	 }
	 
	 public static void main(String args[]) {
		 Houseloan ob1=new Houseloan(); 
		 ob1.h1(20000,10.34);
	 }

}


