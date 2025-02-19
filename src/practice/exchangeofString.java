package practice;

public class exchangeofString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "java";
		String s2 = "program";

		s1 = s1 + s2;

		System.out.println(s1); // javaprogram
		s2 = s1.substring(0, s1.length() - s2.length());
		System.out.println(s2);

		s1 = s1.substring(s2.length());
		System.out.println(s1);
	}

}
