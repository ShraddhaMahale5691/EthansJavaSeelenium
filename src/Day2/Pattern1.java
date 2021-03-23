package Day2;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=3;i++)
		{	
			for(int j=i;j<3;j++)
			{
				System.out.print(" ");
			}

			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}

			System.out.println("");
		}
		System.out.println("__________________________________");
	
		for(int m=1;m<=4;m++)
		{	
			for(int l=4;l>m;l--)
			{
				System.out.print("*");
			}
			for(int n=m;n<3;n++)
			{
				System.out.print("0");
			}

			
			System.out.println("");
		}
	}
	
}

