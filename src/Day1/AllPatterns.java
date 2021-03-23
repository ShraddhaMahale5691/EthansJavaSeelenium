package Day1;

public class AllPatterns {

	public static void main(String[] args) {
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("********************************************");
		
		for(int i=1;i<=3;i++)
		{
			for(int j=3;j>=i;j--)
			{
				System.out.print("*");
				
			}
			System.out.println();
		}
		
		System.out.println("************************************************");
		
		for(int i=1;i<=3;i++)
		{
			for(int j=i;j<=3;j++)
			{
				System.out.print(" ");
			}
			//System.out.println();
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		System.out.println("************************************************");
		for(int i=1;i<=3;i++)
		{
			for(int j=3;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
			for(int k=1;k<=i;k++)
			{
				System.out.print(" ");
			}
		}
		
	}
	
	
	

}
