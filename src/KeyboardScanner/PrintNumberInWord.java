package KeyboardScanner;

import java.util.Scanner;

public class PrintNumberInWord {

	public static void main(String[] args) {
		Scanner abcde = new Scanner(System.in);
		int a,b = 0;
		String [] s = new String[10];
		s[0] = "zero"; 
		s[1] = "one";
		s[2] = "two";
		s[3] = "three";
		s[4] = "four";
		s[5] = "five";
		s[6] = "six";
		s[7] = "seven";
		s[8] = "eight";
		s[9] = "nine";
		a = abcde.nextInt();
		for(int i = 0;i<10;i++)
		{
			if(i==a)
			{
				System.out.println("The input integer is"+s[i]);
				b = 1;
			}
		}
		if(b==0)
		{
			System.out.println("The input integer is OTHER");
		}


	}

}
