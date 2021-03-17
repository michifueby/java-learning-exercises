//	Autor:	Michael Füby	
//  Datei:	Uebung8
package Uebung8;

//Abstrakte Klasse ZeitFormat
abstract class ZeitFormat extends zeit
{
  ZeitFormat()
  {
    this(0, 0);
  }
  // Methode ZeitFormat mit den Parameter stunde und minute
  ZeitFormat(int stunde, int minute)
  {
    super(stunde, minute);
  }
  // Die Ausgabe der abstrakten Klasse wird ausgegeben
  abstract void ausgabe();
}
