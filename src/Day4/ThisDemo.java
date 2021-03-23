package Day4;

public class ThisDemo {
int new1,new2;

ThisDemo(int new1,int new2)
{
	this.new1=new1;
	this.new2=new2;
	System.out.println("Value of new1 is "+new1+" and new2 is "+new2);
}
void display()
{
	System.out.println("This is display method");
	this.msg();
	Test t3=new Test();
	t3.txt();
}

void msg()
{
	System.out.println("This is msg method");
}
}
