package Phase1_assessment1;

public class PP1_TypeCasting {

	public static void main(String[] args) {
		//implicit type casting
		int a=18;
		double b=a;
		System.out.println("Before implicit type casting the value: "+a);
		System.out.println("After implicit type casting the value: "+b);
		System.out.println("\n");
		
		float c=a;
		System.out.println("Before implicit type casting the value: "+a);
		System.out.println("After implicit type casting the value: "+c);
		System.out.println("\n");
		
		int d=a;
		System.out.println("Before implicit type casting the value: "+a);
		System.out.println("After implicit type casting the value: "+d);
		System.out.println("\n");
		
		
		char e='a';
		System.out.println("Before implicit type casting the value: "+a);
		System.out.println("After implicit type casting the value: "+e);
		System.out.println("\n");
		
		
		//explicit type casting
		double x=30.4;
		int y=(int)x;
		System.out.println("Before explicit type casting the value: "+x);
		System.out.println("Before explicit type casting the value: "+y);

	}

}
