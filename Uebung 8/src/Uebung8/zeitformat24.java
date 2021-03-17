//	Autor:	Michael Füby
//	Datei:	Uebung8
package Uebung8;

public class zeitformat24 extends  ZeitFormat
{
	  zeitformat24()
	  {
	    this(0, 0);
	  }
	  zeitformat24(int stunde, int minute)
	  {
	    super(stunde, minute);
	  }

	  void ausgabe()
	  {
	    int minute1 = getMinute() / 10;
	    int minute2 = getMinute() % 10;
	    int sekunde1 = getStunde() / 10;
	    int sekunde2 = getStunde() % 10;

	    System.out.printf("Uhrzeit: %d%d:%d%d%n",
	                      sekunde1, sekunde2, minute1, minute2);
	  }
	}