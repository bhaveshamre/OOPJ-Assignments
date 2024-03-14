
package in.acts.cdac;

import java.util.Scanner;

public class Vovel {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        char in = sc.next().charAt(0);
        
        if (in == 'a' || in == 'e' || in == 'i' || in == 'o' || in == 'u' || in == 'A' || in == 'E' || in == 'I' || in == 'O' || in == 'U') 
        {
            System.out.print("Vowel");
        }
        else {
            System.out.print("Consonant");
        }
	}

}
