package java_programes;

import java.util.Arrays;

public class Anagram_programe {

	public static void main(String[] args) {
		
		
		String abc="ashok";
		String xyz="ashok";
		
		char[] a=abc.toCharArray();
		
		char[] b=xyz.toCharArray();
		
		
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		if(Arrays.equals(a, b)) {
			System.out.println("String is Anagram");
		}
		else {
			System.out.println("String is  not Anagram");
		}
	}

}
