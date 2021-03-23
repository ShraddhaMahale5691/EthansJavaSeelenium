package Daay6;

public class PerEmlWorMain {

	public static void main(String[] args) {
		//Creating reference variable of parent class
		Person p1;
		
		//Assign object of new class to that reference variable
		p1=new Employee11();
		p1.getData11(1, "Amol", 10000);
        p1.display11();
        
        
        System.out.println("***************************************************************");
        
        p1=new Worker();
        p1.getData11(2, "Atul", 5);
        p1.display11();
	}

}
