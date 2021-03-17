//	Autor:	Michael Füby
//	Datei:	Uebung11

// Klasse mit dem Namen Excercise4 wird erstellt
public class Exercise4
{
  private String string1 = "Meier";
  private String string2 = "Mayer";

  public Exercise4()
  {
    printLetter(string1);
    printLetter1(string2);
  }

  // Main Methode wird erstellt
  public static void main(String[] args)
  {
    new Exercise4();
  }
  // Methode printLetter wird erstellt
  public void printLetter(String name)
  {
	// String Buffer wird erstellt für die Ausgabe der einzelnen Daten
    StringBuffer sb = new StringBuffer();
    sb.append("Sehr geehrte(r) Frau/Herr ");
    sb.append(name);

    sb.append("\nwir gratulieren Ihnen zur erfolgreichen Lösung der Übungsaufgabe.");
    System.out.println(sb.toString());
  }
  public void printLetter1(String name)
  {
    StringBuilder sb = new StringBuilder();
    sb.append("Sehr geehrte(r) Frau/Herr ");
    sb.append("\nwir gratulieren Ihnen zur erfolgreichen Lösung der Übungsaufgabe.");
    sb.insert(26, name);
    System.out.println(sb.toString());
  }
}
