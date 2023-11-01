package javaPrograms2310;

public class StringRevrese {

	public static void main(String[] args) {
		String st = "Automation";
		String rev = "";
		for (int i = st.length() - 1; i >= 0; i--) {

			char ch = st.charAt(i);
			rev = rev + ch;

		}
		System.out.println(rev);
	}
}
