import java.util.Scanner;

public class Addition {

	
	public static void main (String[] args){
		final int zahlenlength = 2;
		double erg = 0.0;
		double [] zahlen = new double[zahlenlength];
		
		hinweis();
		zahlen = eingabe();
		erg = verarbeitung(zahlen[0],zahlen[1]);
		ausgabe(zahlen[0],zahlen[1],erg);
		
	}
	
	public static void hinweis(){
		System.out.println("Hinweis: ");
		System.out.println("Das Programm addiert zwei eingegebene Zahlen ");
	}
	
	public static void ausgabe (double zahl1,double zahl2,double erg){
		System.out.println("Ergebnis der Addition");
		System.out.println(erg + " = " + zahl1 + " + " +zahl2);
	}
	
	public static double verarbeitung (double zahl1,double zahl2){
		double erg = zahl1 + zahl2;
		return erg;
	}
	
	public static double[] eingabe(){
		double[] zahlen = new double[2];
		System.out.println(" 1. Zahl:");
		zahlen[0]=Tastatur.liesDouble();
		System.out.println(" 2. Zahl:");
		zahlen[1]=Tastatur.liesDouble();		
		return zahlen;
	}
	
	
	
}
