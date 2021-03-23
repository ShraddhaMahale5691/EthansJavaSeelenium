package Day1;

public class Sum1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=100,a=0,b=0,c=0;
do
{
	if(i%2==0)
	{
		a=a+i;
		i++;
	}
	else
	{
		b=b+i;
		i++;
	}
	
	
}while(i<=200);
System.out.println("Even "+a);
System.out.println("Odd "+b);
	}

}
