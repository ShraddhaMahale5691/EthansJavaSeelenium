package Day8;

public class Registration {
	int id,age;
	String name,password;
void getdata(int id,String name,int age,String password)
{
	this.id=id;
	this.name=name;
	this.age=age;
	this.password=password;
	
	int lenght=password.length();
	if(lenght>12)
	{
		try 
		{
			throw new Pass_to_Long();
		} 
		catch (Pass_to_Long e)
		{
			
		System.out.println("Password to long exception");	
		}
		
	}
	else if(lenght<8)
	{
		try {
			throw new Pass_to_short();
		} catch (Pass_to_short e) {
			
			System.out.println("Password to short exception");	
		}
		
		
	}
	else
	{
		System.out.println("Allowed");
	}
}

void display()
{
	System.out.println("Id of user is "+id);
	System.out.println("Name of user is "+name);
	System.out.println("Age of user is "+age);
	System.out.println("Password of user is "+password);
}
}
