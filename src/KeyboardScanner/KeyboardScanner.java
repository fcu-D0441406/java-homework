package KeyboardScanner;

import java.util.Scanner;

public class KeyboardScanner {

	public static void main(String[] args) {
		int a;
		String b;
		float c;
		Scanner abcde = new Scanner(System.in);
		System.out.println("Enter a integer");
		a = abcde.nextInt();
		System.out.println("Enter a float point number");
		c = abcde.nextFloat();
		System.out.println("Enter a your name");
		b = abcde.next();
		System.out.println("Hi "+b+", the multiplication of "+a+ " and "+c+" is ");
		System.out.printf("%.2e", a*c);
	}

}
