//	Autor:	Michael Füby
//	Datei:	Uebung6
package Uebung6;

// Klasse circle wird erstellt 
public class circle
{
  // Der Radius wird als Datentyp double definiert 
  double radius;

  double getCircumference()   //Rückgabewert: Kreisumfang
  {
    return 2 * SomeMaths.pi * radius;
  }

  double getArea()            //Rückgabewert: Kreisflaeche
  {
    return SomeMaths.pi * SomeMaths.getSquare(radius);
  }

}