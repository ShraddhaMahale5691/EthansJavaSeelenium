package Day2;

public class NestedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=1;i<=4;i++)//first row
{
	for(int j=1;j<=i;j++)//first row contains 1 column,2nd r=2coul,so cond is j<=i
	{
		System.out.print(" * ");
	}
	System.out.println();
}
		
	}

}
