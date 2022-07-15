package logical_1;

import java.util.Arrays;
import java.util.Scanner;

public class AssemblyLine1 {
	
	public static void assemblyLine(int N,int A[]) {
		
		int B[]=Arrays.copyOf(A, N);
		Arrays.sort(B);
		for(int i=0;i<N;i++) {
			if(A[i]!=B[i]) {
			System.out.println(i);
		}
		}
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter no of students:");
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		
		int A[] = new int[N];
		for(int i=0;i<N;i++) {
			
			A[i] = s.nextInt();
			//assemblyLine(N, A);
		}
		assemblyLine(N, A);
	}

}
