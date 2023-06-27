package Phase1_assessment1;

public class PP8_Strings {

	public static void main(String[] args) {

		//StringBuilder
		System.out.println("\n");
		System.out.println("Creating StringBuilder");
		StringBuilder builder=new StringBuilder("Hello");
		builder.append(" World");
		System.out.println(builder);
		System.out.println(builder.deleteCharAt(2));
		System.out.println(builder.insert(2, "l"));
		System.out.println(builder.insert(0, "Java "));
		System.out.println(builder.reverse());
		
		
		//conversion	
		System.out.println("\n");
		System.out.println("Conversion of Strings to StringBuffer and StringBuilder");

		String str = "Harshitha"; 

		// conversion from String object to StringBuffer 
		StringBuffer buffer = new StringBuffer(str); 
		buffer.reverse(); 
		System.out.println("String to StringBuffer");
		System.out.println(buffer); 

		// conversion from String object to StringBuilder 
		StringBuilder builder1 = new StringBuilder(str); 
		builder1.append("world"); 
		System.out.println("String to StringBuilder");
		System.out.println(builder1);        


	}

}

