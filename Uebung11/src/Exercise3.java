//	Autor:	Michael Füby
//	Datei:	Uebung11
public class Exercise3
{
  private String string1 = "Meier";
  private String string2 = "Mayer";

  public Exercise3()
  {
    printLetter(string1);
    printLetter(string2);
  }

  public static void main(String[] args)
  {
    new Exercise3();
  }

  public void printLetter(String name)
  {
    StringBuffer string_buffer = new StringBuffer();
    string_buffer.append("Sehr geehrte(r) Frau/Herr ");
    string_buffer.append(name);
    string_buffer.append("\nwir gratulieren Ihnen zur erfolgreichen Lösung der Übungsaufgabe.");
    System.out.println(string_buffer.toString());
  }
}
