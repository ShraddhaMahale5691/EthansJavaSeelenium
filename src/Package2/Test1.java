package Package2;
import Operation.Addition;
import Operation.Multiply;

public class Test1 {

	
	void Show()
	{
		System.out.println("This is in Package 2");
		Addition A1=new Addition();
		A1.addition(2, 3);
		A1.substraction(4.0f, 3.0f);
		
		Multiply M1=new Multiply();
		M1.max(2, 3);
		M1.max2(8, 7, 5);
	}
}
