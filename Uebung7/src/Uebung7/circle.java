//	Autor:	Michael Füby
//	Datei:	Uebung7
package Uebung7;

public class circle
{
	//Attribute
	private double radius;
	private boolean filled;

	//Getter und Setter-Methoden
	double getRadius()
	{
		return radius;
	}

	void setRadius(double radius)
	{
		this.radius = radius;
	}
		boolean isFilled()
		{
			return filled;
		}

	void setFilled(boolean filled)
	{
		this.filled = filled;
	}

	//Konstruktoren
	circle()
	{
		this(1,false);
	}

	circle(double radius)
	{
		this(radius, false);
	}

	circle(double radius, boolean filled)
	{
		setRadius(radius);
		setFilled(filled);
	}

	//Methoden
	double getCircumference()
	{
		return 2 * SomeMaths.pi * getRadius();
	}

	double getArea()
	{
		    
	if (isFilled())
		return SomeMaths.pi * SomeMaths.getSquare(getRadius());
	else
		return 0;
	}

}