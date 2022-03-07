package Com; 

public class AcessModifiers {

	public static void main(String[] args) {
		PrivateClass cls=new PrivateClass();
		cls.setName("Ipsita");
		System.out.println("The name is "+cls.getName());
		
		DefaultClass dft=new DefaultClass();
		dft.message();
		ProtectedClass pc=new ProtectedClass();
		pc.protectedmessage();
		
	}
	
	

}


		


	


