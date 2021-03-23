package Day1;

public class EvenPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=500;
		while(i<=1000)
		{ 
			int a=i%2;
			if(a==0)
			{
				System.out.println("This is even number "+i);
			}
			i++;
		}

	}

}
