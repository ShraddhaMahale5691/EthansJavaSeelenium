package Day9;

import java.util.Scanner;

public class ScannerDemo {
	int id,age,salary;
	String name;
	void accept()
	{
		Scanner s=new Scanner(System.in);

		System.out.println("Enter Id");
		id=s.nextInt();
		s.nextLine();
		
		System.out.println("Enter name");
		name=s.nextLine();

				
		System.out.println("Enter Age");
		age=s.nextInt();
		
		
		System.out.println("Enter salary");
		salary=s.nextInt();

		s.close();
	}

	void display()
	{
		System.out.println("Id of employee is :"+id);
		System.out.println("Name of employee is :"+name);
		System.out.println("Age of employee is :"+age);
		System.out.println("Salary of employee is :"+salary);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScannerDemo d=new ScannerDemo();
		d.accept();
		d.display();

	}

}
