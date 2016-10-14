package KeyboardScanner;

import java.util.Scanner;

public class StringComparator {

	public static void main(String[] args) {
		int flag = 1;
		String a , b;
		Scanner abcde = new Scanner(System.in);
		a = abcde.next();
		b = abcde.next();
		if(a.equalsIgnoreCase(b))
		{
			System.out.println("this is same");
			flag = 0;
		}
		while(flag==1)
		{
			a = abcde.next();
			b = abcde.next();
			if(a.equalsIgnoreCase(b))
			{
				System.out.println("this is same");
				flag = 0;
			}
		}

	}

}
