package Day4;

public class AreaOverloading {
int new1,new2;

void getData(int a,int b)
{
	new1=a;
	new2=b;
}

void area(int radius)
{
	float area=3.14f*radius*radius;
	System.out.println("Area of circle "+area);
}

void area(int lenght,int breadth)
{
	int area=lenght*breadth;
	System.out.println("Area of rectangle "+area);
}


void area(float ht,float br)
{
	float area=0.5f*ht*br;
	System.out.println("Area of triangle "+area);
}

void area(float side)
{
	float area=side*side;
	System.out.println("Area of square "+area);
}
}
