//	Autor:	Michael Füby
//	Datei:	Uebung8
package Uebung8;

public class zeit 
{
	//Definieren der Variablen für Stunde und Minute 
	private int stunde;
	private int minute;

	//Funktion set Stunde
	void setStunde(int stunde)
	{    
	    if (stunde>=0)
	      this.stunde = stunde; 
	}
	//Funktion set Minute
	void setMinute(int minute)
	{
	    if (minute>=0 && minute<60)
	      this.minute = minute;
	}
	//Rückgabewert Stunde
	int getStunde()
	{
	    return stunde; 
	}
	//Rückgabewert Minute
	int getMinute()
	{
	    return minute;
	}
	
	zeit()
	{
	    this(0, 0);
	}

	zeit(int stunde, int minute)
	{
	    setStunde(stunde);
	    setMinute(minute);
	}
	//Mit dem Zugriffsmodifizierer protected ist der Zugriff nicht nur auf Klassen aus dem selben Package (wie "default"), 
	//sondern auch Subklassen der Klasse erlaubt
    protected Object clone()				
	{
	    zeit om = new zeit(getStunde(), getMinute());
	    return om;
	}
    //Überprüfung der Werte
	public boolean equals(Object obj)
	{
	    if (this == obj)
	      return true;
	    if ((obj == null) || (this.getClass() != obj.getClass()))
	      return false;
	    if (  (this.getStunde() == ((zeit)obj).getStunde())
	       && (this.getMinute() == ((zeit)obj).getMinute()))
	      return true;
	    else
	      return false;
	 }
}
