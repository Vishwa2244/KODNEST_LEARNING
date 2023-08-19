package Java_Program;

import java.util.Scanner;

public class Discount_applicability {
	
	
	public static void chechDiscount(double purchaseAmount) {
	 if(purchaseAmount>100)
	{
		System.out.println("Discount Applicable");
	}
	 else 
	{
		System.out.println("Discount Not Applicable");
	}
	}

	public static void main(String[] args) {
		
		System.out.println("Enter purchase amount");
		Scanner s=new Scanner(System.in);
		double amt=s.nextInt();
		
		chechDiscount(amt);
	}

}
