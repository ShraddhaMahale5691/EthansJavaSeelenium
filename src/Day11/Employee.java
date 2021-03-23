package Day11;

import java.util.ArrayList;

public class Employee {
	
	int id,age,salary;
	String name;

	public Employee(int id, int age, int salary, String name) {
		super();
		this.id = id;
		this.age = age;
		this.salary = salary;
		this.name = name;
	}
	public String toString()
	{
		return "\nId :"+id+" name :"+name+" age :"+age+" salary :"+salary;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int counter=0;
		Employee e1=new Employee(1,22,1000,"sai");
		Employee e2=new Employee(2,33,2000,"Gau");
		Employee e3=new Employee(3,44,3000,"Manu");
		ArrayList<Employee> a1=new ArrayList<>();
		a1.add(e1);
		a1.add(e2);
		a1.add(e3);
		System.out.println(a1);
		
		
		
		

	}
	
}
