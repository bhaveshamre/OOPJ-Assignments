import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		if (a >= 90) {
			System.out.println("Grade : A");
		}
		else if (a >= 75) {
			System.out.println("Grade : B");
		}
		else if (a >= 60) {
			System.out.println("Grade : C");
		}
		else if (a >= 40) {
			System.out.println("Grade : D");
		}
		else  {
			System.out.println("Grade : F");
		}
		
	}

}
