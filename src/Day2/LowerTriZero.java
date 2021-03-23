package Day2;

public class LowerTriZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<=a.length-1;j++)
			{
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
			
		}
		
		System.out.println("**************************************");
		
		
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=a.length-1;j>=i;j--)
			{
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
			if(i!=2)
			{
				for(int k=0;k<=i;k++)
				{
					System.out.print(" 0");

				}
			}

		}

		System.out.println("**************************************");
		int c=0;
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=i;j<=a.length-1;j++)
			{
				
				System.out.print(" "+a[i][j]);
			
			}
			System.out.println();
			c++;
			if(i!=2 && c!=3)
			{
				for(int k=0;k<=i;k++)
				{
					System.out.print(" 0");

				}
			}

		}
		
		
	}

}
