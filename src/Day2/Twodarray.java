package Day2;

public class Twodarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
for(int i=0;i<3;i++)
{
	for(int j=0;j<3;j++)
	{
		System.out.print(" "+a[i][j]);
	}
	System.out.println();
}
int num1=0,num2=0,num3=0,sum=0;


int b[][]= {{1,2,3},{4,5,6},{7,8,9}};
for(int k=0;k<3;k++)
{
	for(int l=0;l<3;l++)
	{
		if(k==l)
		{
			num1=b[k][l];
			sum=sum+num1;
			
		}
		
	}
		
}
System.out.println("Addition of Diagonal element is "+sum);
	}

}
