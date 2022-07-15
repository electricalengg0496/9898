package logical_1;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		
		int A[] = {11,6,8,3,5,9};
		int B[]= new int [A.length];
		for(int i =0 ;i<B.length;i++) {
			B[i]=A[i];
		}
		Arrays.sort(A);
		for(int j=0;j<A.length;j++) {
			if(A[j]!=B[j]) {
				System.out.println(j);
			}
		}
//		for(int i=0;i<A.length;i++) {
//		System.out.println(A[i]);
	}
	}
