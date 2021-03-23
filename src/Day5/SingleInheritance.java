package Day5;

public class SingleInheritance {
	
	String name;
	int age;
	String Qualification;
	
	int id,basicsalary;
	
	
	void getdata(String name,int age,String Qualification)
	{
		this.name=name;
		this.age=age;
		this.Qualification=Qualification;
	}
	

}

class employee extends SingleInheritance
{
	
	void acceptData(int id,int basicsalary)
	{
		this.id=id;
		this.basicsalary=basicsalary;
	}
	
	void show()
	{
		System.out.println("Employee id is: "+id);
		System.out.println("Employee name  is: "+name);
		System.out.println("Employee age is: "+age);
		System.out.println("Employee qualification is: "+Qualification);
		System.out.println("Employee salary is: "+basicsalary);
	}
	
	
}

class admin extends employee
{
	int total_sal;
	int allowance;
	void getallowance(int allowance)
	{
		this.allowance=allowance;
	}
	
	void total_Sal()
	{
		total_sal=basicsalary + allowance;
		System.out.println("Total salary is "+total_sal);
	}
	
	void display()
	{
		show();
		System.out.println("Employee allowance is "+allowance);
		System.out.println("Employee total salary is "+total_sal);
	}
	
	}
