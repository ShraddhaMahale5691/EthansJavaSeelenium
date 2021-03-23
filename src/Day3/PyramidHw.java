package Day3;

public class PyramidHw {
	 void pattern88()
		{
			for(int i=1;i<=3;i++)
			{
				for(int j=2;j>=i;j--)
				{
					System.out.print(" ");
				}
				for(int k=1;k<=2*i-1;k++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
			//System.out.println();
			for(int i=2;i>=1;i--)
			{
				for(int j=2;j>=i;j--)
				{
					System.out.print(" ");
				}
				for(int k=1;k<=2*i-1;k++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
		}

}
