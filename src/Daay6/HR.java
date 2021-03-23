package Daay6;

public class HR extends Employee{
int salary1,incentives=500;
	void calSal()
	{
		
		this.salary1=super.basicsalary+incentives;
		System.out.println("This is HR salary is :"+salary1);
	}
}
