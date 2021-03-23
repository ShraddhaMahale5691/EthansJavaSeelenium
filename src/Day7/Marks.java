package Day7;

public class Marks extends Students{
	int m1,m2,m3;
	void getMarks(int m1,int m2,int m3)
	{
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}
	
	void showAll()
	{
		System.out.println("Id "+super.id);
		System.out.println("Id "+super.name);
		System.out.println("Id "+super.age);
		System.out.println("Marks of subject 1 is "+m1);
		System.out.println("Marks of subject 2 is "+m2);
		System.out.println("Marks of subject 3 is "+m3);
	}
	

}
