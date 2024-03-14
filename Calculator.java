package in.acts.cdac;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 no. to perform calculation");
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("Choose any one Calculation of following 1.Addition(+) 2.Subtraction(-) 3.Multiplication(*) 4.Division(/)");
		
		int a = sc.nextInt();
		switch(a) {
		case 1: 
			System.out.println(x+y);
			break;
		case 2: 
			System.out.println(x-y);
			break;
		case 3: 
			System.out.println(x*y);
			break;
		case 4: 
			System.out.println(x/y);
			break;
		default: 
			System.out.println("Invalid entry");
			break;	
		}

	}

}
