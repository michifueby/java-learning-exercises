// 	Autor:	Michael Füby
//	Datei:	Uebung6
package Uebung6;

public class CircleExercise
{
  // Main Methode wird erstellt 
  public static void main(String[] args)
  {
	// Kreise werden definiert mit Radius
    circle firstCircle = new circle();
    firstCircle.radius = 2;
    circle secondCircle = new circle();
    secondCircle.radius = 8;
    circle thirdCircle = new circle();
    thirdCircle.radius = 3;
    
    // Ausgabe der einzelnen Kreise + Text mit printf
    System.out.printf("1. Kreis:%nRadius: %g%nUmfang: %g%nFlaeche: %g%n",
                      firstCircle.radius,
                      firstCircle.getCircumference(),
                      firstCircle.getArea());
    System.out.println();
    System.out.printf("2. Kreis:%nRadius: %g%nUmfang: %g%nFlaeche: %g%n",
                      secondCircle.radius,
                      secondCircle.getCircumference(),
                      secondCircle.getArea());
    System.out.println();
    System.out.printf("3. Kreis:%nRadius: %g%nUmfang: %g%nFlaeche: %g%n",
                      thirdCircle.radius,
                      thirdCircle.getCircumference(),
                      thirdCircle.getArea());
  }
}