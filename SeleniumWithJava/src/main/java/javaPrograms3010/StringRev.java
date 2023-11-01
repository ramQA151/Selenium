package javaPrograms3010;

public class StringRev {

	public static void main(String[] args) {
		String str="Automation";
		String rev="";
		
		for(int i=str.length()-1; i>=0;i--) {
			char ch=str.charAt(i);
			rev=rev+ch;
						
		}
		System.out.println(rev);
				
	}
}
