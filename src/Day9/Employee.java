package Day9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Employee {
	InputStreamReader is=new InputStreamReader(System.in);
	BufferedReader br= new BufferedReader(is);
	int id,age,salary;
	String name;
	void acceptData()
	{
		try
		{
			System.out.println("Enter Id of Employee :");
			String id1=br.readLine();
			id=Integer.parseInt(id1);

			System.out.println("Enter name of Employee :");
			name=br.readLine();

			System.out.println("Enter age of Employee :");
			String age1=br.readLine();
			age=Integer.parseInt(age1);

			System.out.println("Enter Salary of Employee :");
			String salary1=br.readLine();
			salary=Integer.parseInt(salary1);
		}
		catch(IOException e)
		{
			System.out.println("IO Exception occured");
		}

		finally
		{
			if(br==null)
			{
			try {
				br.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
		}
	}

	void show()
	{
		System.out.println("Id of employee is :"+id);
		System.out.println("Name of employee is :"+name);
		System.out.println("Age of employee is :"+age);
		System.out.println("Salary of employee is :"+salary);
	}
	
	
		
	
}
