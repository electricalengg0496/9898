package logical_1;

import java.util.Scanner;

public class Temperature {

	public static int prod(int[] temp) {
		int answer=0;
		for(int i=0;i<temp.length;i++) {
			if(temp[i]<0) {
				answer++;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter user input");
		int temp_size = s.nextInt();
		int temp[]= new int[temp_size];
		for(int i=0;i<temp_size;i++) {
			temp[i] = s.nextInt();
		}
		
		int result = prod(temp);
		System.out.println(result);
	}

}

