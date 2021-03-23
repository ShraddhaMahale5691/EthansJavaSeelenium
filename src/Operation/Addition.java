package Operation;

public class Addition {
	
	int a,b,add;
	float c,d,sub; 
	public void addition(int a,int b)
	{
		int add=a+b;
		this.add=add;
		
		System.out.println("Number 1 for addition is "+a);
		System.out.println("Number 2 for addition is "+b);
		System.out.println("Addition is "+add);
	}
	
	public float substraction(float c,float d)
	{
		float sub=c-d;
		this.sub=sub;
		System.out.println("Number 1 for Substraction is "+c);
		System.out.println("Number 2 for Substraction is "+d);
		System.out.println("Substraction is "+sub);
		return sub;
	}

}
