package in.acts.cdac;

import java.util.Scanner;

public class Bmi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Height :");
        double h = sc.nextDouble();
        System.out.println("Enter Weight :");
        double w = sc.nextDouble();
        
        double bmi = w/(h*h);
        if (bmi>=40) {
        	System.out.println("Obeseweight");
        
        }
        else if (bmi>=25) {
        	System.out.println("Overweight");
        
        }
        else if (bmi>=18.5) {
        	System.out.println("normalweight");
        
        }
        else  {
        	System.out.println("underweight");
        
        }
	}

}
