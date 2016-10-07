package KeyboardScanner;
import java.util.Scanner;
public class CheckOddEven {

	public static void main(String[] args) {
		Scanner abcde = new Scanner(System.in);
		System.out.println("块计");
		int a = abcde.nextInt();
		if(a%2==0)
		{
			System.out.println("案计");
		}
		else
		{
			System.out.println("计");
		}

	}

}
