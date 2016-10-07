package KeyboardScanner;

import java.util.Scanner;

public class StringComparator {

	public static void main(String[] args) {
		String a , b;
		Scanner abcde = new Scanner(System.in);
		a = abcde.next();
		b = abcde.next();
		if(a.equalsIgnoreCase(b)){
		    System.out.println("The two strings are the same.");
		}
		else
		{
			System.out.println("The two strings are not the same.");
		}

	}

}
