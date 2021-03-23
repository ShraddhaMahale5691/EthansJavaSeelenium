package Day9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EmployeeSwitchMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader test=new InputStreamReader(System.in);
		BufferedReader br1= new BufferedReader(test);
		int id22;

		Employee e[]=new Employee[2];

		for(int i=0;i<e.length;i++)
		{
			e[i]=new Employee();
			e[i].acceptData();

		}
		
		System.out.println("1.Display\n2.CheckSalary\n3.Searchbyid");
		String ch=br1.readLine();
		int ch1=Integer.parseInt(ch);

		switch(ch1)
		{
		case 1:
			for(int i=0;i<e.length;i++)
			{
				e[i]=new Employee();
				e[i].show();

			}
			break;


		case 2:
			for(int i=0;i<e.length;i++)
			{
				//e[i]=new Employee();
				if(e[i].salary>=20000 && e[i].salary<30000)
				{
					e[i].show();
				}
				else
				{
					System.out.println("Employee Salary is less of thisone emp"+e[i]);
				}
			}
			break;

		case 3:
			System.out.println("Enter the Id to be search");
			String id221=br1.readLine();
			id22=Integer.parseInt(id221);
			int flag=0;
			for(int i=0;i<e.length;i++)
			{

				if(e[i].id==id22)
				{
					e[i].show();
					flag++;
					break;
				}
			}

			if(flag==0)
			{
				System.out.println("Record not found");
			}
			break;
	
		
		
default:
	System.out.println("No case matched");
	
		}
	


	}
}
