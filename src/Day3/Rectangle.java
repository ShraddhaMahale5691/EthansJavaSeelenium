package Day3;

public class Rectangle {
	int lenght,bredth,area,peri;
    public void getData(int a,int b)
    {
    	lenght=a;
    	bredth=b;
    }
    public void areaRectangle()
    {
    	area=lenght*bredth;
     }
    public void perimeterRect()
    {
    	peri=2*(lenght+bredth);
    }
    public void display()
    {
    	System.out.println("Lenght of Rectangle is "+lenght);
    	System.out.println("Bredth of Rect is "+bredth);
    	System.out.println("Area of Rectangle is "+area);
    	System.out.println("Perimeter of Rectangle is "+peri);
    	
    }
}
