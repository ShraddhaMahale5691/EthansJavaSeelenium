package Daay6;

public class Employee11 extends Person{
int id,salary;
String name;

	@Override
	void getData11(int id,String name,int salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		
		
	}

	@Override
	void display11() {
		System.out.println("Id of Employee is : "+id);
		System.out.println("Name of Employee is : "+name);
		System.out.println("Salary of Employee is : "+salary);
		
	}
	

}
