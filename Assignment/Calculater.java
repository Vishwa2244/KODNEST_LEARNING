package Java_Program;

import java.util.Scanner;

public class Calculater {
	
	
	public static void add(int a, int b)
	{
		int sum;
		 sum=a+b;
		System.out.println("total addition is: "+sum);
	}
	
	public static void sub(int a, int b)
	{
		int sub=a-b;
		System.out.println("total sub is: "+sub);
	}
	public static void mul(int a, int b)
	{
		int mul=a*b;
		System.out.println("total mul is: "+mul);
	}
	public static void div(int a, int b)
	{
		int div=a/b;
		System.out.println("total div is: "+div);
	}


	public static void main(String[] args) {
		
		System.out.println("enter number here");
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();		
			
		add(num1,num2);
			
		

	}

}
