package inheritance;

public class Triangle extends Shape
{
	String sides;
	String height;
	String base;
	public Triangle(String sides,String height, String base)
	{
		super();
		this.sides=sides;
		this.height=height;
		this.base=base;
	}
	public void value()
	{
		System.out.println("sides"+sides);
		System.out.println("height"+height);
		System.out.println("base"+base);
	}

}
