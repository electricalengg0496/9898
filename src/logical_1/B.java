package logical_1;

import java.util.Scanner;

public class B {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter upto series..");
		fibonacci(s.nextInt());
				
		}
	
	public static void fibonacci(int n) {
		int num1=0;
		int num2=1;
		int num3;
		
		for(int i= 0 ; i<n; i++) {
			
			System.out.println(num1);
				num3=num1+num2;
				num1=num2;
				num2=num3;
}
	

	}}

