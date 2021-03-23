package Day5;

public class Student {

	int id,age,marks;
	String name;
	Student(int id,String name,int age,int marks)
	{
		this.id=id;
		this.name=name;
		this.age=age;
		this.marks=marks;
	}
	
	/*Overriding toString Method of inbulid Object class which is parent of all classes in java*/
	public String toString()
	{
		return "\nId "+id+"\nName "+name+"\nAge "+age+"\nMarks "+marks;
	}
	
	
}
