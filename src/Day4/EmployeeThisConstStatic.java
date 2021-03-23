package Day4;

public class EmployeeThisConstStatic {
	int id,salary;
	String name;
	static String companyname="Payu";
	static int counter=0;//static variable can be accessed in static and non static method
	EmployeeThisConstStatic(int id,String name,int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		counter++;					
	}
	static void display1()
	{
		int x;
		//local variables can ne used in static methods
		System.out.println("Static variable Companyname accessed in static method "+companyname);//-------static variable is allowed to called in static method
		//System.out.println("Nonstatic variable"+id);----------nonstatic variable cant be called in static method.
	}
	void display()
	{
		System.out.println("______________________________________________________________");
		System.out.println("Id of student is "+id);
		System.out.println("Name of student is "+name);
		System.out.println("Salary of student is "+salary);
		System.out.println("Companyname of student is "+companyname);
		
	}

}
