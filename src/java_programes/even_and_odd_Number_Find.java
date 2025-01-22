package java_programes;

public class even_and_odd_Number_Find {

	public static void main(String[] args) {
		int [] a= {12,34,55,67,89,80,90,13,45,46};
		
		for(int i =0; i<=a.length-1;i++) {
			
			if(i%2==0) {
				System.out.println("even value :"+a[i]);
			}
			else if (i%2==1) {
				System.out.println("odd value :"+a[i]);
			}
		}

	}

}
