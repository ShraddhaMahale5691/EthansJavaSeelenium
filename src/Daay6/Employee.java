package Daay6;

abstract public class Employee {
int id,age,basicsalary;
String name;

void getData(int id,String name,int age,int basicsalary)
{
	this.id=id;
	this.name=name;
	this.age=age;
	this.basicsalary=basicsalary;
}

abstract void calSal();
/*
{
	System.out.println("This is just calculation of salary");
}*/
}
