package Day1;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=4;
		int fact=1;
		while(num>0)
		{
			fact=fact*num;
			num--;
		}
		System.out.println(fact);
		
	}

}
