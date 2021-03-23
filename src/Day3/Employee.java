package Day3;

public class Employee {
String name;
int id,age,salary;

void getdata(String name1,int id1,int age1,int salary1)
{
	name=name1;
	id=id1;
	age=age1;
	salary=salary1;
}
void display()
{
	System.out.println("Employee details");
	System.out.println("Name is "+name+" Id is "+id+" age is "+age+" salary is "+salary);
}


}
