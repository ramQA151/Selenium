package practice;

public class ReverseString {

	public static void main(String[] args) {
			
		String str="Automation",Strev="";
		char ch;
		int strLength=str.length();
		for(int i=0; i<strLength; i++) {
			
			 ch=str.charAt(i);
			Strev = ch+Strev;
		}
		System.out.println(Strev);
		
	}	
}
