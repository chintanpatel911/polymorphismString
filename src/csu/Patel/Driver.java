package csu.Patel;

public class Driver {

	/*
	 * Author: Chintan Patel 
	 * Date: May - 20- 2015 
	 * Goal: Experiment with the String class
	 */

	public static void main(String[] args) {

		String s2 = new String("Hola mundo");

		s2 = s2 + "Adios";

		// Output will be "Hola mundoAdios"
		System.out.println(s2);

		/*
		 * Print s2 in reverse
		 * 
		 * so the string will reverse every word e.g. "soidAodnum aloH"
		 */

		String s3 = "";
		for (int i = s2.length() - 1; i >= 0; i--) {
			s3 = s3 + s2.charAt(i);

		}
		// Output will be "soidAodnum aloH"
		System.out.println(s3);

		// extract selected digits

		String s4 = "12345";

		s4 = s4 + 1;

		// output will be "123451" because of +1 interact with the string
		System.out.println(s4);

		// Print (s4) digits on odd positions

		String s5 = "";
		for (int i = 1; i < s4.length(); i += 2) {
			s5 += s4.charAt(i);
		}

		// output will be 241
		System.out.println(s5);

		// odd all digits in s4

		int solustion = 0;
		for (int i = 0; i < s4.length(); i++) {
			solustion += (s4.charAt(i) - '0');
		}
		// output will be 16
		System.out.println(solustion);

	}

}
