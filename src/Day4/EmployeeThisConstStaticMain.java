package Day4;

public class EmployeeThisConstStaticMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeThisConstStatic e1=new EmployeeThisConstStatic(1,"Sai",1000);
		EmployeeThisConstStatic e2=new EmployeeThisConstStatic(2,"Gau",2000);
		EmployeeThisConstStatic e3=new EmployeeThisConstStatic(3,"Manu",3000);
		EmployeeThisConstStatic e4=new EmployeeThisConstStatic(4,"Mahi",4000);
		
		e1.display();
		e2.display();
		e3.display();
		e4.display();
		System.out.println("**********************************************************");
		System.out.println("Total number of employees are :"+EmployeeThisConstStatic.counter);

		EmployeeThisConstStatic.display1();//static method called by classname.methodname
	}

}
