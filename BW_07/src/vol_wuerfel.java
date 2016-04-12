import java.util.Scanner;

public class vol_wuerfel {

	public static void main(String[] args) {
		int wahl;
		do {
			wahl = menu(); // Menüaufruf bis 5 / beenden ausgewählt wird
			if (wahl <= 0 || wahl > 5)
				System.out.println("Bitte Eingabe wiederholen!"); // Fehler
																	// Information
		} while (wahl != 5);

	}

	public static int menu() {
		int wahl;
		Scanner auswahl = new Scanner(System.in);
		System.out.println("(1) Würfel Berechnung");
		System.out.println("(2) Quader Berechnung");
		System.out.println("(3) Zylinder Berechnung");
		System.out.println("(4) Pyramide Berechnung");
		System.out.println("(5) Beenden");
		System.out.println();
		System.out.println("Bitte Auswählen:");

		wahl = auswahl.nextInt();

		switch (wahl) {
		case 1: {
			ausgabe(eingabe(wahl), "Würfel");
			break;
		}
		case 2: {
			ausgabe(eingabe(wahl), "Quader");
			break;
		}
		case 3: {
			ausgabe(eingabe(wahl), "Zylinder");
			break;
		}
		case 4: {
			ausgabe(eingabe(wahl), "Pyramide");
			break;
		}

		}

		return wahl;
	}

	public static double wuerfel(double[] werte) {
		double erg = werte[1] * werte[1] * werte[1];
		return erg;
	}

	public static double quader(double[] werte) {
		double erg = 0;
		double[] quad = werte;
		return erg = quad[1] * quad[2] * quad[3];

	}

	public static double zylinder(double[] werte) {
		double[] zylin = werte;
		double erg = 0;

		return erg = zylin[1] * zylin[1] * 3.14 * zylin[2] / 4;
	}

	public static double pyramide(double[] werte) {
		double[] pyra = werte;
		double erg = 0;
		return erg = pyra[1] * pyra[1] * pyra[2] / 3;
	}

	public static double eingabe(int wahl) {
		double erg = 0;
		double[] werte = new double[10];
		switch (wahl) {
		case 1: {
			System.out.println("Bitte Kantenlänge eingeben.");
			werte[1] = Tastatur.liesDouble();
			erg = wuerfel(werte);
			break;
		}
		case 2: {
			for (int i = 1; i < 4; i++) {
				System.out.println("Bitte " + i + ". Seitenlängen eingeben.");
				werte[i] = Tastatur.liesDouble();
			}
			erg = quader(werte);
			break;
		}
		case 3: {
			System.out.println("Bitte Zylinder Durchmesser eingeben: ");
			werte[1] = Tastatur.liesDouble();
			System.out.println("Bitte Zylinder Höhe eingeben: ");
			werte[2] = Tastatur.liesDouble();
			erg = zylinder(werte);
			break;
		}
		case 4: {
			System.out.println("Bitte Pyramiden Kantenlängen eingeben: ");
			werte[1] = Tastatur.liesDouble();
			System.out.println("Bitte Pyramiden Höhe eingeben: ");
			werte[2] = Tastatur.liesDouble();
			break;
		}

		}
		return erg;
	}

	public static void ausgabe(double erg, String rechnung) {
		System.out.println(rechnung + " Volumen: " + erg +"\n");
	}

}
