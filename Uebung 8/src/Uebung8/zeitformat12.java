//	Autor:	Michael Füby
//	Datei:	Uebung8
package Uebung8;

public class zeitformat12 extends ZeitFormat
	{
		  zeitformat12()
		  {
		    this(0,0);
		  }
		  zeitformat12(int stunde, int minute)
		  {
		    super(stunde, minute);
		  }
		  // Funktion zur Ausgabe der Zeiten
		  void ausgabe()
		  {
		    int sekunde = getStunde();
		    boolean pm = sekunde >= 12;
		    int m = getMinute();
		    if (pm)
		      sekunde -= 12;
		    if (sekunde == 0)
		      sekunde = 12;
		    int sekunde1 = sekunde / 10;
		    int sekunde2 = sekunde % 10;
		    int minute1 = m / 10;
		    int minute2 = m % 10;

		    if (pm)
		      System.out.printf("Uhrzeit: %d%d:%d%d PM%n",
		                      sekunde1, sekunde2, minute1, minute2);
		    else
		      System.out.printf("Uhrzeit: %d%d:%d%d AM%n",
		                      sekunde1, sekunde2, minute1, minute2);
		  }
		}
