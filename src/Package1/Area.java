package Package1;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k=4,l=5,area,perimeter;
		area=k*l;
		perimeter=2*(k+l);
		System.out.println("Area of Rectangle "+area);
		System.out.println("Perimeter of rectangle is "+perimeter);

		
		int radius=5;
		float area1;
		area1=3.14f*radius*radius;
		System.out.println("Area of circle is "+area1);
		
		
		int m=10,n=20,temp;
		temp=10;
		m=n;
		n=temp;
		System.out.println("\nSwapping with 3rd variable");
		System.out.println("Value of m is "+m);
		System.out.println("Value of n is "+n);
		
		
		
		int c=10,d=20;
		c=c+d;
		d=c-d;
		c=c-d;
		System.out.println("\nSwapping without 3rd variable");
		System.out.println("Value of c is "+c);
		System.out.println("Value of d is "+d);
		
		
		
		
		

		
		

	}

}
