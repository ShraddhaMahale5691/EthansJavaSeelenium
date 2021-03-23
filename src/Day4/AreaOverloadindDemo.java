package Day4;

public class AreaOverloadindDemo {

	public static void main(String[] args) {
		
		AreaOverloading a1=new AreaOverloading();
		a1.getData(2, 2);
		a1.area(3);
		a1.area(4.0f);
		a1.area(5, 5);
		a1.area(4.0f, 9.0f);;

	}

}
