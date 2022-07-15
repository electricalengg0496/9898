package logical_1;

import java.util.HashMap;
import java.util.Scanner;

public class Frequency {
	
	public static int elementFrequency(int N,int M,int A[]) {
		HashMap<Integer, Integer> hm = new HashMap<Integer,Integer>();
		for(int i=0;i<N;i++) {
			if(hm.containsKey(A[i])) {
				int fr = hm.get(A[i]);
				hm.put(A[i], fr+1);
				
			}else {
				hm.put(A[i],1);
			}
		}
		int ans = 0;
		for(int X : hm.keySet()) {
			int value=hm.get(X);
			if(value<M) {
				ans+=M - value;
			}
		}
		return ans;
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int M = s.nextInt();
		int A[] = {2,2,3,3,8,8,5,5,5,9,9,9,9,9};
//		for(int i =0;i<N;i++) {
//			A[i]=s.nextInt();
//		}
		
		System.out.println(elementFrequency(N, M, A));
		
	}

}
