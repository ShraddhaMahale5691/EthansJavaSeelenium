package Operation;

public class Multiply {
int a,b,c,d,e;
public void max(int a,int b)
{
	System.out.println("Number 1 is "+a);
	System.out.println("Number 2 is "+b);
	
	if(a>b)
	{
		System.out.println("Maximum number is "+a);
	}
	else
	{
		System.out.println("Maximum number is "+b);	
	}
}


public void max2(int c,int d,int e)
{
	System.out.println("Number 1 is "+c);
	System.out.println("Number 2 is "+d);
	System.out.println("Number 3 is "+e);
	
	
	if(c>d && c>e)
	{
		System.out.println("Maximum number is "+c);
	}
		else if (d>e)
		{
			System.out.println("Maximum number is "+d);		
			
		}else
		{
			System.out.println("Maximum number is "+e);
		}
}
}
