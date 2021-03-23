package Day2;

public class reversepattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<=4;i++)//first row
		{
			for(int j=4;j>=i;j--)//first row 4 columns
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
	}

	
	/*
	 Or you can also use
	 for(int i=4;i>=1;i--)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
	}

	 
	 */
	
}
