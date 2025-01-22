package java_programes;

public class Occurance {

	public static void main(String[] args) {
		
		 String demo = "INDIA1234";
	        StringBuilder result = new StringBuilder();

	        for (char ch : demo.toCharArray()) {
	            if (Character.isDigit(ch)) {
	                break;
	            }
	            result.append(ch);
	        }

	        System.out.println(result.toString()); // Output: INDIA
	
}
}