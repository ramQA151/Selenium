package javaPrograms0611;

public class StringRev {

	public static void main(String[] args) {
		String s="Automation";
		String rev="";
		System.out.println(s.length());
		for(int i=s.length()-1; i>=0;i--) {
			char ch=s.charAt(i);
			rev=rev+ch;
			
		}
		System.out.println(rev);
	}
}
