package Day1;

public class Count1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=1234500;int rem=0,even=0,odd=0,zer=0;
do
{
	rem=num%10;
	num=num/10;
	if(rem==0)
	{
		zer=zer+1;
	}
	else if(rem%2==0)
	{
		even=even+1;
	}
	else
	{
		odd=odd+1;
	}	
	
	
	
}while(num>0);
System.out.println("Even "+even);
System.out.println("Odd "+odd);
System.out.println("Zeros "+zer);
	}

}
