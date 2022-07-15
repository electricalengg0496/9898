package logical_1;

import java.util.Scanner;

public class KN {
public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of N:");
		int N = s.nextInt();
		System.out.println(minNum(N));
	}
public static int minNum(int n) {
	
	int k=0;
	int count=0;
	if(n<0) {
		n=n*(-1);
	}else {
		n=n*1;}
	
	while(n!=k) {
		
			for(int i=n-k;i>0;i--) {
				if(pow2(i)||pow3(i)) {
					k=k+i;
					count++;
					break;
			
				}
			}
	}
	if(n==k) {
		return count;
	}return -1;
}

private static boolean pow3(int n) {
	
		while(n!=1) {
			if(n%3!=0) {
			return false;
			
		}n=n/3;
		
	}return true;
	}
	
private static boolean pow2(int n) {
	while(n!=1) {
		if(n%2!=0) {
			return false;
		}n=n/2;
	}return true;
}

}




