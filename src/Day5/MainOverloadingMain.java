package Day5;

public class MainOverloadingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.out.println("This is main");
//main(2);
B b1=new B();
b1.main(null);
	}
	public static void main(int a)
	{
		System.out.println("This is overloaded main method "+a);
	}

}


