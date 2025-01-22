package java_programes;

public class Pelindrome {

	public static void main(String[] args) {

		String abc = "madafgjm";

		String rev = "";
		for (int i = abc.length() - 1; i >= 0; i--) {

			rev = rev + abc.charAt(i);
		}
		if(abc.equals(rev)) {
		System.out.println("String is  pelindrome");}
		else {
			System.out.println("String is not pelindrome");
		}
	}

}
