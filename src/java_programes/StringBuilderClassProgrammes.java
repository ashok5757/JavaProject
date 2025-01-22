package java_programes;

public class StringBuilderClassProgrammes {

	public static void main(String[] args) {
		
		
		String abc= "sele123nium";
		//output =s#e#l#e#n#i#u#m
		
		StringBuilder sb=new StringBuilder();
		
		
		//sb.insert(1, 'A');
	   //sb.setCharAt(0, 'M');
		//sb.append("Gambhire");
		for(char  c: abc.toCharArray()) {
			sb.delete(4, 7);
			sb.append(c);
			sb.append('#');
		}
		System.out.println(sb);
	}

}
