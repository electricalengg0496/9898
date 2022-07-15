package logical_1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Frequency2 {
	
	public static int elementFrequency(int N,int M,int A[]) {
		
		int sum=0;
		int count1=0;
		boolean visited[] = new boolean[N];
		Arrays.fill(visited, false);
		
		for(int i=0;i<N;i++) {
			if(visited[i]==true) {
				continue;
			}
				int count=1;
				for(int j=0;j<N;j++) {
					if(A[i]==A[j]) {
							visited[j]=true;
							count++;
							if(count<M) {
								count1=M-count;
								
							}
							
					}sum=sum+count1;
				}
			}return sum;
		}
		
	
	
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int M = s.nextInt();
		int A[] = {2,2,3,8,8,5,5,9,9,9,9,9};
//		for(int i =0;i<N;i++) {
//			A[i]=s.nextInt();
//		}
		
		System.out.println(elementFrequency(N, M, A));
		
	}

}
