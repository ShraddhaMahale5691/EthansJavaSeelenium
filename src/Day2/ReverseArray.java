package Day2;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {20,30,40};
for(int i=a.length-1;i>=0;i--)
{
	System.out.println(" "+a[i]);
}

	
	int b[]= {20,30,50};
	int num=0;
	for(int j=0;j<b.length;j++)
	{
		num=num+b[j];
	}
	System.out.println("Addition of array element is "+num);


	
	
	int c[]= {40,30,60,80,35};
	int num1,num3=0;
	for(int k=0;k<c.length;k++)
	{
		num=c[k];
		num3=num%2;
		if(num3==0)
		{
			System.out.println("even no is "+c[k]);
		}
		
		else
		{
			System.out.println("Odd no is "+c[k]);
		}
	}
	
}
}