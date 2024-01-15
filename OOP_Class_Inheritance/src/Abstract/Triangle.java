package Abstract;

public class Triangle extends Shape{
	Triangle(double h,double w)
	{
		super(h,w);
	}
	void area()
	{
		System.out.println("Triangle area: " +dim1*dim2*0.5);
	}
}
