package Day8;

public class RegistrationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Registration r=new Registration();
		
		r.getdata(1, "Sai", 20, "ShraddhaShravani");
		r.display();
		
		
		System.out.println("*************************");
		
		r.getdata(2, "Shau", 15, "Sai");
		r.display();
	}

}
