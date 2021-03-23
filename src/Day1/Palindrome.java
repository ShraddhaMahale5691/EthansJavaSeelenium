package Day1;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=131231,rem=0,rev=0;
		int num1=num;
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			rev=(rev*10)+rem;
		}
System.out.println(rev); 
if(num1==rev)
{
System.out.println("Number is pallindrome");	
}
else
{
	System.out.println("Number is not pallindrome");	
	
}

	}

}
