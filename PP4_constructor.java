package Phase1_assessment1;

class sak {
	// data members of the class.
	String name;
	int id;
	sak(String name, int id)
	{
		this.name = name;
		this.id = id;
	}
}

class s1{  
	//creating a default constructor  
	s1()
	{
		System.out.println("HI THIS IS MY PERSONAL INFORMATION");
		}  
	}


public class PP4_constructor {

	public static void main(String[] args) {
		s1 s=new s1(); 
		sak sak1 = new sak("Harshitha", 23);
		System.out.println("Name :" + sak1.name + " and Id :" + sak1.id);
		

	}

}