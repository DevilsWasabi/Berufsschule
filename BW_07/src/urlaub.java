import java.util.Scanner;

public class urlaub {

	public static void main(String[] args) {
		final int ANZ = 10;
		String werte[] = new String[ANZ]; //Feld0=Kasse
		System.out.println("Budget eingeben."); // Einmalig Reisekasse anlegen
		werte[0] = Tastatur.liesString();

		do {
			
			int landwahl;

			werte = eingabeland(werte);
			wechseln(kasse[], landwahl);
			verarbeitung();
			ausgabe();

			if (Double.valueOf(werte[0]) <= 100) {
				System.out.println("Heimreise antreten, 100€ Restbudget.");
				break;
			}

		} while (Double.valueOf(werte[0]) >= 100);
	}

	private static double wechseln(String werte[], int land) {
		String[] werteu = werte;
		double kurs=0;
		
		if (land == 0 || land == 1) {
		kurs = 0.9750;	
		}

		if (land == 2 || land == 3) {
			kurs = 0.6485;
		}
		if (land == 4 || land == 5) {
			kurs = 118.2900;
		}
		
		if (land == 6 || land == 7) {
			kurs = 7.6292;
		}
		return kurs;
	}

	public static String[] eingabeland(String[] werte) {
		String[] werteu = werte;
		String[] laender = { "USA", "usa", "GB", "gb", "JP", "jp", "HK", "hk" };
		String land;
		System.out.println("Gastland eingeben.");
		land = Tastatur.liesString();
		int i;
		for (i = 0; i < laender.length; i++) {
			if (land.equals(laender[i])) {
				werte[6]=Integer.toString(i);
				break;
			}
		}
		
		return werteu;

	}

	private static void verarbeitung() {
		// TODO Auto-generated method stub

	}

	private static void ausgabe() {
		// TODO Auto-generated method stub

	}

}
