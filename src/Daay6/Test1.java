package Daay6;

public class Test1 {

	Employee Salary()
	{
		int ch=3;
		
		System.out.println("1.Admin\n2.HR\n3.Developer");
		System.out.println("You have entered value of object as "+ch);
		if(ch==1)
		{
			Admin a=new Admin();
			return a;
		}
		else if(ch==2)
		{
			HR h=new HR();
			return h;
			
		}
		else 
		{
			Developers d=new Developers();
			return d;
		}
		
	}
}
