package logical_1;

import java.util.Scanner;

public class KequalsN {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of N:");
		int N = s.nextInt();
		System.out.println(minNum(N));
	}
	
	public static int minNum(int n) {
		
		int k=0;
		int count=0;
		
		while(n!=k) {
			if(n>0) {
				for(int i=n-k;i>0;i--) {
					if(pow2(i)||pow3(i)) {
						k=k+i;
						count++;
						break;
					}
				}
			}else {
				for(int i=n-k;i<0;i++) {
					if(pow2(i)||pow3(i)) {
						k=k+i;
						count++;
					}
				}
			}
		
		}if(n==k) {
			return count;
		}return -1;
		}
	private static boolean pow3(int n) {
		if(n<0) {
			n=n*(-1);
			
		}while(n!=1) {
			if(n%3!=0) {
				return false;
				
			}n=n/3;
			
		}return true;
		}
		
	private static boolean pow2(int n) {
		if(n<0) {
			n=n*(-1);
			
		}while(n!=1) {
			if(n%2!=0) {
				return false;
			}n=n/2;
		}return true;
	}

}
