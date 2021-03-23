package Daay6;

public class Admin extends Employee{
	int salary1,allowance=1000;
	void calSal()
	{
		
		this.salary1=super.basicsalary+allowance;
		System.out.println("This is Admin salary is :"+salary1);
	}
}
