package Day3;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee E1=new Employee();
		Employee E2=new Employee();
		Employee E3=new Employee();

		E1.getdata("Sai", 1, 20, 1000);
		E1.display();
		E2.getdata("Shravani", 2, 30, 20000);
		E2.display();
		E3.getdata("Gauri", 3, 25, 3000);
		E3.display();
		
		if(E1.salary>E2.salary)
		{
			if(E1.salary>E3.salary)
			{
				System.out.println("Salary of E1 is highest");
			}
			else
			{
				System.out.println("Salary of E3 is highest");
			}
		}
		else if(E2.salary>E3.salary)
		{		
				System.out.println("Salary of E2 is highest");
		}
	    else
			{
				System.out.println("Salary of E3 is highest");
			}

		}
		

	}








