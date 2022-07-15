package logical_1;

import java.util.Iterator;

public class Rev_String {
	
	public static void main(String[] args) {
		
		String s = "aabbaa";
		char ch;
		String rev="";
		
		for(int i=0;i<s.length();i++) {
			
			ch=s.charAt(i);
			rev=ch+rev;
		}
		
		System.out.println("original String is:"+s);
		System.out.println("reverse string is:"+rev);
		if(s.equals(rev)) {
			System.out.println("This is palindrome series");
		}else {
			System.out.println("This is not palindrome series");
	}
	}
	
}
