//	Autor:	Michael Füby
//	Datei:	Uebung11
public class Exercise1
{
  // Main Methode wird definiert 
  public static void main(String[] args)
  {
	 // string1 und string2 werden als String definiert
    String string1 = "Meier";
    String string2 = "Mayer";

    // Namen werden mit Hilfe von compareTo sortiert 
    if(string1.compareTo(string2) <= 0)
    {
      System.out.println(string1);
      System.out.println(string2);
    }
    else
    {
      System.out.println(string2);
      System.out.println(string1);
    }
  }
}