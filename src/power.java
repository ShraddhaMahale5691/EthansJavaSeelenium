
public class power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=2;
		int rem=1;
		int power=10,value=0;
		for(int i=0;i<power;i++)
		{
			rem=num*rem;
		}
		System.out.println("Power Value is "+rem);
	}

}
