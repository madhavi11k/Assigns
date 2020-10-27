
public class HouseloanOne extends Houseloan {
	
	public void h1(int amount,double interest,int total) {
		 System.out.println("Housing loan for 10years : " + (amount*interest/total));
	 }
	 
	 public static void main(String args[]) {
		 HouseloanOne ob1=new HouseloanOne(); 
		 ob1.h1(2000000,4.56,12);
	 }

}
