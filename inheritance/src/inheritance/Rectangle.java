package inheritance;

public class Rectangle extends Shape 
{
	String sides;
	String length;
	String breadth;
	public Rectangle(String sides,String length, String breadth)
	{
		super();
		this.sides=sides;
		this.length=length;
		this.breadth=breadth;
	}
	public void value()
	{
		System.out.println("sides"+sides);
		System.out.println("length"+length);
		System.out.println("breadth"+breadth);
	}
}
