package Day1;

public class SumEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1,b=0,c=0;
		while(i<=100)
		{
			int a=i % 2;
			if(a==0)
			{
				c=i+b;
				b=c;
			}
			i++;
			
		}
		System.out.println(c);

	}

}
