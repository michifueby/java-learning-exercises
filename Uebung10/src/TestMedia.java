//	Autor:	Michael Füby
//	Datei:	Uebung10

class TestMedia
{
  public static void main(String[] args)
  {
	//Es werden die einzelnen Mediums definiert wie dann ausgegeben werden 
    Media media1 = new Picture();
    Media media2 = new Video();
    Media media3 = new Audio();

    // Ausgabe des Medium 1
    System.out.println("Medium 1:");
    media1.display();
    media1.play();
    media1.stop();
    // Ausgabe des Medium 2
    System.out.println("Medium 2:");
    media2.display();
    media2.play();
    media2.stop();
    // Ausgabe des Medium 3
    System.out.println("Medium 3:");
    media3.display();
    media3.play();
    media3.stop();
 }
}

