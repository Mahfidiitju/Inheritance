package Polymorphism;

public class Rectangle extends Shape{
	double length,width;
	Rectangle(double l,double w)
	{
		length=l;
		width=w;
	}
	double area()
	{
		 System.out.print("Rectangle area: ");
		return length*width;
	}
}
