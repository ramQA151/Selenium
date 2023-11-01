package practice;

public class ReverseaString {
public static void main(String[] args) {
	
	String str="Automation";
	String rev="";
	char ch;
	int strlength=str.length();
	
//	for(int i=0;i<strlength;i++) {
//		ch=str.charAt(i);
//		
//		rev=ch+rev;
//	}
//	System.out.println(rev);
//}
	
	
	for(int i=strlength-1;i>=0;i--) {
		rev=rev+str.charAt(i);		
	}
	System.out.println(rev);
}
}