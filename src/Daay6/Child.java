package Daay6;

public class Child extends Parent {
	String fname;
	int age;
	String Qulification;
	void getData(String fname,int age,String Qulification)
	{
		this.fname=fname;
		this.age=age;
		this.Qulification=Qulification;
	}
	
	void show()
	{
		//System.out.println("Firstname "+super.fname+"\t Middlename "+mname+"\t Lastname "+lname+"\t age "+super.age+"\t Qualification "+super.Qualification);
		System.out.println("Firstname \t Middlename \t Lastname \t age \t Qualification");
		System.out.println(" "+super.fname+"\t  "+mname+"\t  "+lname+"\t  "+super.age+"\t  "+super.Qualification);
		System.out.println(" "+fname+"\t "+super.fname+"\t "+super.lname+"  \t  "+age+"  \t  "+Qulification);
	}
}
