//	Autor:	Michael Füby
//	Datei:	Uebung10

class Picture extends MediaAdapter
{
  // die Klasse Picture benötigt die Methode display()
  // Es werden play() und stop() nicht benötigt

  public void display()
  {
    System.out.println(this.getClass() + ": Display Picture");
  }
  //getClass() wird der Namen der Klasse ermittelt 
}