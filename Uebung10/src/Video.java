//	Autor:	Michael Füby
//	Datei:	Uebung10

class Video extends MediaAdapter
{

  public void display()
  {
    System.out.println(this.getClass() + ": Display video");
  }
 
  public void play()
  {
    System.out.println(this.getClass() + ": Play video");
  }

  public void stop()
  {
    System.out.println(this.getClass() + ": Video stopped");
  }
}