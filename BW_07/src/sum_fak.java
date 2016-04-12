import java.util.Scanner;

public class sum_fak {
	public static void main(String[] args) {
		int wahl;
		do {
			wahl = menu(); // Menüaufruf bis 6 / beenden ausgewählt wird
			if (wahl <= 0 || wahl > 6)
				System.out.println("Bitte Eingabe wiederholen!"); // Fehler
																	// Information
		} while (wahl != 4);

	}

	public static int menu() {
		int wahl;
		Scanner auswahl = new Scanner(System.in);
		System.out.println("(1) Summen Berechnung");
		System.out.println("(2) Fakultät Berechnung");
		System.out.println("(3) Arithmetisches Mittel Berechnung");
		System.out.println("(4) Beenden");
		System.out.println();
		System.out.println("Bitte Auswählen:");

		wahl = auswahl.nextInt();

		switch (wahl) {
		case 1: {
			ausgabe(verarbeitung(eingabe(wahl)));
			break;
		}
		case 2: {
			ausgabe(verarbeitung(eingabe(wahl)));
			break;
		}
		case 3: {
			ausgabe(verarbeitung(eingabe(wahl)));
			break;
		}
		}

		return wahl;
	}

	public static double[] eingabe(int wahl) {
		double erg = 0, counter = 0, temp = 0, arit = 0;
		double[] werte = new double[10];
		switch (wahl) {
		case 1: {
			System.out.println("Bitte Zahl eingeben für Summen Berechnung.");
			werte[1] = Tastatur.liesDouble();

			break;
		}
		case 2: {
			System.out.println("Bitte Zahl eingeben für Fakultät Berechnung.");
			werte[1] = Tastatur.liesDouble();

			break;
		}
		case 3: {
			System.out.print("Bitte geben Sie Zahlen für die Durchschnittsberechnung ein    : ");
			System.out.print("(0) Beendet weitere Eingabe.");
			for (;;) {
				counter++;
				temp = Tastatur.liesDouble();

				if (temp <= 0)
					break;
				werte[1] += temp;
				werte[2] = counter;
			}
		}
		}
		werte[9] = wahl;
		return werte;
	}

	public static double[] verarbeitung(double[] werteu) {
		double erg = 0, counter = 0, temp = 0, arit = 0, wahl = werteu[9];
		double[] werte = werteu;
		double sum = 0;
		switch ((int) wahl) {
		case 1: {
			for (int i = 1; i <= werte[1]; i++) { // Summen Berechnung
				sum = sum + i;
				werte[8] = sum;
			}
			break;
		}
		case 2: {
			double fak = 1;
			for (int i = 1; i < werte[1]; i++) { // Fakultät Berechnung
				fak += fak * i;

			}
			werte[8] = fak;
			break;
		}
		case 3: {
			werte[8] = werte[1] / (werte[2] - 1);
		}
		}
		return werte;
	}

	public static void ausgabe(double[] werteu) {
		double[] werte = werteu;

		double wahl = werte[9];

		switch ((int) wahl) {
		case 1: {
			System.out.println("Summe von 1 bis " + werte[1] + " = " + werte[8]);
			break;
		}
		case 2: {
			System.out.println("Fakultät von 1 bis " + werte[1] + " = " + werte[8]);
			break;
		}
		case 3: {

			break;
		}
		}

	}

}
