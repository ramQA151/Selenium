package javaPrograms2310;

public class UpperCaseandLowerCase {

	public static void main(String[] args) {
		String str = "India is my Country";
		String str1 = " I love my country";
//		System.out.println(str.toLowerCase());
//		System.out.println(str.toUpperCase());
//		System.out.println(str + str1);

		str = str.toLowerCase();
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i = i + 2) {
			ch[i] = Character.toUpperCase(ch[i]);
		}
		System.out.println(new String(ch));

	}
}