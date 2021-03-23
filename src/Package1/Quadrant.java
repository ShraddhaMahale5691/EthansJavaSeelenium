package Package1;

import java.util.Scanner;

public class Quadrant {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		//int a=-1;
		//int b=0;
		 Scanner scanner = new Scanner( System.in );
   	     System.out.print( "Please Enter value of a: " );
         String a1 = scanner.nextLine();
         int a = Integer.parseInt( a1 );
         System.out.print( "Please Enter value of b: " );
         String b1 = scanner.nextLine();
         int b = Integer.parseInt( b1 );
		 
		if(a>0 && b >0)
		{
			System.out.println("Point is in 1st quadrant");	

		}
		else if(a<0 && b>0)
		{

			System.out.println("Point is in 2nd Quadrant");

		}
		else if(a<0 && b<0)
		{
			System.out.println("Point is in 3rd Quadrant");

		}
		else if(a>0 && b<0)
		{

			System.out.println("Point is in 4rth quadrant");

		}

		else if(a==0)
		{
			System.out.println("Point is on Y axis");
		}

		else if(b==0)
		{
			System.out.println("Point is on X axis");
		}
		
	}
}



