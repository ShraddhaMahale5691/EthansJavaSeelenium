package Package1;

public class Nestedifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=100,b=60,c=400;
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("A with value "+a+" is largest");
			}
			else
			{
				System.out.println("C with value "+c+" is largest");

			}

		}
		else
		{
			if(b>c)
			{
				System.out.println("B with value "+b+" is largest");
			}
			else
			{
				System.out.println("C with value "+c+" is largest");

			}
		}
	}

}


