package Package1;

public class MaleFemale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char gender='M';
		int age=31,height=166;
		if(gender=='F'||gender=='f')
		{
			if(age>25 && height>155)
			{
				System.out.println("This Female is recruited for Job");
			}
			else
			{
				System.out.println("This Female is not recruited for Job");
			}
		}
		
		else if(gender=='M'||gender=='m')
			{
				if(age>30 && height>165)
				{
					System.out.println("This Male is recruited for Job");
				}
				else
				{
					System.out.println("This Male is not recruited for Job");
				}
			}

		else
			System.out.println("You have entered wrong data");
	}

}
