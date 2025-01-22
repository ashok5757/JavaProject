package java_programes;

import java.util.LinkedHashSet;

public class Remove_duplicate {

	public static void main(String[] args) {
		int abc[]= {111,111,123,123,45,45,56,56,66,66,67,67,87,87,999,999};
		
		LinkedHashSet<Integer> h1=new LinkedHashSet<Integer> ();
		
		for(Integer c1:abc)
		{
			h1.add(c1);
		}
		System.out.println(h1);
	}

}
