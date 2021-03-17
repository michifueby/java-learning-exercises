//	Autor:	Michael Füby
//	Datei:	Uebung10

// Die Klasse Audio erbt von der Klasse MediaAdapter
class Audio extends MediaAdapter
{
  // die Klasse Audio wird benötigt die Methoden play() und stop()

  public void play()
  {
    System.out.println(this.getClass() + ": Play audio");
  }

  public void stop()
  {
    System.out.println(this.getClass() + ": Audio stopped");
  }
}