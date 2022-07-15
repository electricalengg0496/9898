package logical_1;

import java.util.Scanner;

public class EvenOdd {

	public static void evenOdd(int n) {
		
		int a;
		a=(n/2)*2;
		if(a==n) {
			System.out.println("It is even number");
		}else
		{System.out.println("It is a odd number");}
		
	}
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number:");
		evenOdd(s.nextInt());
	}
}
