package Day2;

public class Arrayappend1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
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
