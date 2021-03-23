package Day5;

public class Mainverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This main of Mainveriding");
	}

}
class B extends Mainverriding
{
	public static void main(String[] args) {
		System.out.println("This main of B");
	}

}