package Day5;

public class StaticmethodMain {
	
	static
	{
		
		//Real life use of static block is to execute certain things before calling main
		System.out.println(System.getenv("OS"));
		String Operating_System=System.getenv("OS");
		if(Operating_System.equals("Windows_NT"))
		{
			System.out.println("Your OS is correct you can move further..");
		}
		else
		{
			System.out.println("Your OS is not correct so need to exit here..");
			System.exit(0);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
Staticmethod s1=new Staticmethod();
System.out.println("In main method");


	}

}
