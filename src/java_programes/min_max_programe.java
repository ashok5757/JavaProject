package java_programes;

public class min_max_programe {

	public static void main(String[] args) {
		int []a= {34,35,555,555,555555,5342345,665,6777,90909009};
		int max=a[0];
		int min=a[0];
		
		for(int i =0; i<=a.length-1;i++) {
			
			
			if(a[i]>max) {
				
				max=a[i];
			}
			else if (a[i]<min) {
				
				min=a[i];
			}
		}
		
		System.out.println(min);
		System.out.println(max);
	}

}
