package Java_Program;

import java.util.Scanner;

public class switch_statement {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number b/w 1-7");
		
		int num=sc.nextInt();
		
		switch(num)
		{
		case 1: 
			System.out.println("Sun");
			break;
		case 2:
			System.out.println("mon");
			break;
		case 3:
			System.out.println("tue");
			break;
		case 4:
			System.out.println("wed");
			break;
		case 5:
			System.out.println("thu");
			break;
		case 6:
			System.out.println("fri");
			break;
		case 7:
			System.out.println("sat");
			break;
			
		default:
			System.out.println("please enter number correctly");
			
		}
		
	}

}
