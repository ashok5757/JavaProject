package java_programes;

public class revString {

	public static void main(String[] args) {
	 
			    String a="selenium java cucmber testng bdd postman sql";
			   String []abc= a.split(a);
			    String rev="";
			    for(int i=abc.length-1;i>=0;i--)
			    {
			    rev=rev+ abc[i];
			    }
			   System.out.println(rev);
			  }
			


	}


