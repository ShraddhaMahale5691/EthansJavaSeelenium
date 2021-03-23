package Day9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EmployeeMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		InputStreamReader test=new InputStreamReader(System.in);
		BufferedReader br1= new BufferedReader(test);
		int id22;
		/*
  Employee E1=new Employee();
E1.acceptData();
E1.show();
*/

Employee e[]=new Employee[2];

for(int i=0;i<e.length;i++)
{
	e[i]=new Employee();
	e[i].acceptData();
	
}

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
	/*
	 * 
	 * if we write else here it gives output as I entered 2
	for 1st -->  Record not found
	for 2nd-->
Id of employee is :2
Name of employee is :saish
Age of employee is :32
Salary of employee is :24000

	else
	{
		System.out.println("Record not found");
	}
	*/
}

if(flag==0)
{
	System.out.println("Record not found");
}






	}

}
