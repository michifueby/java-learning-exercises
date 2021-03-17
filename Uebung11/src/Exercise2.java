//	Autor:	Michael Füby
//	Datei:	Uebung11

public class Exercise2
{
  public static void main(String[] args)
  {
    String string1 = "Meier";
    String string2 = "Mayer";

    if(string1.compareTo(string2) <= 0)
    {
      System.out.println(string1.toLowerCase());
      System.out.println(string2.toLowerCase());
    }
    else
    {
      System.out.println(string2.toLowerCase());
      System.out.println(string1.toLowerCase());
    }
  }
}
