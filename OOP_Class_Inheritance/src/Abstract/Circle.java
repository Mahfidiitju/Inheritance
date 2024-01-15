package Abstract;

public class Circle extends Shape{
	Circle(double r)
	{
		super(r,r);
	}
	void area()
	{
		System.out.println("Circle area: " +Math.PI*dim1*dim2);
	}
}
