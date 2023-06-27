package Phase1_assessment1;

class Addition
{
	//call by value
	static void add(int a)
	{
		System.out.println(a+a);
	}
	
	//call by reference
	
	int a=30;
	static void demo(Addition A2)
	{
		System.out.println(A2.a);
	}
}

public class PP3_Methods {

	public static void main(String[] args) {
		Addition addition=new Addition();
		//calling by value
		Addition.add(10);
		//calling by reference
		addition.demo(addition);
	}


}	