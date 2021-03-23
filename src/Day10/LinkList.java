package Day10;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   LinkedList<String> a6=new LinkedList<String>();
		   a6.add("Red");
		   a6.add("Green");
		   a6.add("Blue");
		   System.out.println("OUR MAIN LIST IS "+a6);
		   
		   
		   a6.addFirst("Black");
		   System.out.println("Added Black at 1st "+a6);
		   
		   a6.addLast("White");
		   System.out.println("Added White at last "+a6);
		   
		   String a=a6.getFirst();
		   System.out.println("First element is "+a);
		   
		   String b=a6.getLast();
		   System.out.println("last element is "+b);
		   
		   a6.removeFirst();
		   System.out.println("Removed Black at 1st "+a6);
		   
		   a6.removeLast();
		   System.out.println("Removed white at last "+a6);

	}

}
