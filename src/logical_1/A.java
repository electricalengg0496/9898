package logical_1;

public class A {
	
	public static void main(String[] args) {
		
		char ch1;
		
		
		String s1 = "aabaa1";
		 String s2="";
		 for(int i = s1.length()-1;i>=0;i--) {
			  ch1 = s1.charAt(i);
			 System.out.println(ch1);
			 s2=s2+ch1;
		 }
		 		 System.out.println(s2);
		
		 		 if(s1.equals(s2)) {
		 			 System.out.println("P");
		 		 }else {
		 			 System.out.println("NP");
		 		 }
	}

}
