package Day2;

public class Numbertri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=1;
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" " +number);
				number++;

			}
			System.out.println();
		}
		
		
		
		System.out.println("***************************************");
	int number1=1;
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" " +number1);
				number1=number1+2;

			}
			System.out.println();
		}
	
	System.out.println("***************************************");
	
	
	int number2=1;
	for(int i=1;i<=5;i++)
	{
		for(int j=4;j>=i;j--)
		{
			System.out.print(" " +number2);
			number2++;

		}
		System.out.println();
	}

System.out.println("***************************************");
	
	
	}
}
