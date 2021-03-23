package Day1;

public class SumofDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=243;
		int c=0;
		while(num>0)
		{
		int num1=num % 10;
		c=c+num1;
		num=num/10;
		}
System.out.println(c);
}
}
