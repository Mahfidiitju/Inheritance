package Polymorphism;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s[]=new Shape[3];
		s[0]=new Shape();
		s[1]=new Rectangle(3,4);
		s[2]=new Triangle(4,7);
		
		for(int i=0;i<3;i++)
		{
			System.out.println(s[i].area());
		}

	}

}
