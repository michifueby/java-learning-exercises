
public class discount {
	public static void main(String[] args)	//Starten mit der Methode main
	{
		double rechnungsbetrag = 0.0;		//Rechnungsbetrag wird definiert 
		
		rechnungsbetrag = Double.parseDouble(args[0]);
		
		if (rechnungsbetrag > 1000 )
		{
			rechnungsbetrag -= rechnungsbetrag * 0.04;
		
		System.out.println("Es wurde ein Rabatt gewährt!");
		}
		System.out.printf("Ihr Gesamtbetrag beträgt %g%n",rechnungsbetrag);
	}
}
