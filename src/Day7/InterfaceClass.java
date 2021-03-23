package Day7;

public class InterfaceClass implements InterfaceDemo,Demo {

	public void show()
	{
		System.out.println("In show");
	}

	@Override
	public void print(int a) {
		// TODO Auto-generated method stub
		System.out.println("In print "+a);
	}
	
  
}
