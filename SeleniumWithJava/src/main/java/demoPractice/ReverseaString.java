package demoPractice;

public class ReverseaString {

public static void main(String[] args) {
	String str="Automation";
	String rev="";
	int length=str.length();
	
	for(int i=length-1;i>=0;i--) {
		char ch=str.charAt(i);
		rev=rev+ch;
				
	}
	System.out.println(rev);
}
}
