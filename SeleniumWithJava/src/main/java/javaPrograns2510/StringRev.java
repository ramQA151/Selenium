package javaPrograns2510;

public class StringRev {

	public static void main(String[] args) {
		String st="Austrelia";
		String rev="";
		int length=st.length();
		for(int i=length-1; i>=0; i--) {
			char ch=st.charAt(i);
			rev=rev+ch;
		}
		System.out.println(rev);
	}
}
