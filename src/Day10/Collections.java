package Day10;

import java.util.ArrayList;

public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String>a1=new ArrayList<String>();
a1.add("Orange");
a1.add("white");
a1.add("green");
System.out.println(a1);


ArrayList<String>a2=new ArrayList<String>();
a2.add("Red");
a2.add("Purple");
a2.add("Blue");
System.out.println(a2);
System.out.println("_________________________________________");

a1.add("addTest");
System.out.println(a1);
System.out.println("***********************");

a1.addAll(a2);
System.out.println(a1);
System.out.println("***********************");

boolean b=a1.contains("Test");
System.out.println("Returns boolean 1 ");
System.out.println(b);


boolean b1=a1.contains("white");
System.out.println("Returns boolean 2 ");
System.out.println(b1);


boolean b2=a1.containsAll(a2);
System.out.println("Returns boolean 3 ");
System.out.println(b2);


a1.add("green");
System.out.println(a1);
System.out.println("***********************");

a1.remove("green");
System.out.println(a1);
System.out.println("***********************");

a1.add("Red");
System.out.println(a1);
System.out.println("***********************");

a1.removeAll(a2);
System.out.println(a1);
System.out.println("***********************");

int size=a2.size();
System.out.println("size is ");
System.out.println(size);



boolean b4=a2.isEmpty();
System.out.println("Isempty?->");
System.out.println(b4);


a2.clear();
System.out.println(a2);
System.out.println("***********************");

String a=a1.get(0);
System.out.println(a);

System.out.println("+++++++++++++++++++++++++++++++++++++++");
System.out.println(a1);

a1.set(1, "Test");
System.out.println(a1);

a1.add("Orange");
System.out.println(a1);

int c1=a1.indexOf("Orange");
System.out.println(c1);

int c=a1.lastIndexOf("Orange");
System.out.println(c);


System.out.println("Our List is"+a1);
ArrayList<String>a3=new ArrayList<String>();
a3.addAll(a1.subList(1, 4));
System.out.println(a3);

	}

}
