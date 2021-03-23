package Day2;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1634,rev=0,rem=1,final1=0,Count=0;
		int num1=num;
		int num2=num;
		
		 while(num2 > 0)
		  {
		     num2 = num2 / 10;
		     Count = Count + 1;  
		  }
		 System.out.println("Power is "+Count);
		
		 
		 
		while(num>0)
		{
			rev=num%10;
			num=num/10;
			for(int i=1;i<=Count;i++)
			{
				rem=rem*rev;
			}
			System.out.println("Power of "+rev+" is "+rem);
			final1=final1+rem;
			rem=1;
		}
		System.out.println("Number after addition is "+final1);
	


	if(final1==num1)
	{
		System.out.println("Number is  an armstrong number");
	}
	else
	{
		System.out.println("Number is not an armstrong number");
	}
}
}