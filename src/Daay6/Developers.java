package Daay6;

public class Developers extends Employee{
int extra_working_hrs=10,Pay_per_day=10,salary1;
	void calSal()
	{
		
		this.salary1=super.basicsalary+(extra_working_hrs*Pay_per_day);
		System.out.println("This is Developer salary is :"+salary1);
	}
}
