package java_programes;

public class Fabinnacci_series {

	public static void main(String[] args) {
		
		int n1=0 ,n2=1,sum=0;
		
		for(int i=1;i<=10;i++){
			
			sum=n1+n2;
			System.out.println(sum);
			n1=n2;
			n2=sum;
		}
		

	}

}
