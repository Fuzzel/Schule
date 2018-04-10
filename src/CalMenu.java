

import java.util.Scanner;

public class CalMenu {

	/*
	 * Gruppenmitglieder: Felix Bernhardt Jan Schlagowsky Lukas Feldbusch
	 * 
	 */

	static Scanner sc = new Scanner(System.in);

	// Addition Zahlenraum bis 10 ohne Zehneruebergang
	public static void add10() {
		System.out.println("Bitte geben Sie eine Zahl ein: ");
		int x = sc.nextInt();
		System.out.println("Bitte geben Sie eine weitere Zahl ein: ");
		int y = sc.nextInt();
		int erg;
		erg = x + y;

		if (erg > 10) {
			System.out.println("Das Ergebnis darf 10 nicht überschreiten");
			add10();
		} else {
			System.out.println("Ergebnis: " + erg);
		}
	}

	// Addition Zahlenraum bis 10 mit Zehneruebergang
	public static void addover10() {
		System.out.println("Bitte geben Sie eine Zahl ein: ");
		int x = sc.nextInt();
		System.out.println("Bitte geben Sie eine weitere Zahl ein: ");
		int y = sc.nextInt();
		int erg;
 
		while (x > 9 || y > 9) {
			System.out.println("Bitte eine Zahl <10 eingeben: ");
			x = sc.nextInt();
			System.out.println("Bitte eine weitere Zahl <10 eingeben: ");
			y = sc.nextInt();
		}
		erg = x + y;
		System.out.println(erg);
	}

	// Addition im Zahlenraum bis 100
	public static void add100() {
		System.out.println("Bitte geben Sie eine Zahl ein: ");
		int x = sc.nextInt();
		System.out.println("Bitte geben Sie eine weitere Zahl ein: ");
		int y = sc.nextInt();
		int erg;

		while (x > 99 || y > 99) {
			System.out.println("Bitte eine Zahl <100 eingeben: ");
			x = sc.nextInt();
			System.out.println("Bitte eine weitere Zahl <100 eingeben: ");
			y = sc.nextInt();
		}
		erg = x + y;
		System.out.println(erg);
	}

	// Addition im Zahlenraum bis 1000
	public static void add1000() {
		System.out.println("Bitte geben Sie eine Zahl ein: ");
		int x = sc.nextInt();
		System.out.println("Bitte geben Sie eine weitere Zahl ein: ");
		int y = sc.nextInt();
		int erg;

		while (x > 999 || y > 999) {
			System.out.println("Bitte eine Zahl <1000 eingeben: ");
			x = sc.nextInt();
			System.out.println("Bitte eine weitere Zahl <1000 eingeben: ");
			y = sc.nextInt();
		}
		erg = x + y;
		System.out.println(erg);
	}

	// Addition im Zahlenraum bis 1MIO
	public static void add1MIO() {
		System.out.println("Bitte geben Sie eine Zahl ein: ");
		int x = sc.nextInt();
		System.out.println("Bitte geben Sie eine weitere Zahl ein: ");
		int y = sc.nextInt();
		int erg;

		while (x > 999999 || y > 999999) {
			System.out.println("Bitte eine Zahl <1000000 eingeben: ");
			x = sc.nextInt();
			System.out.println("Bitte eine weitere Zahl <1000000 eingeben: ");
			y = sc.nextInt();
		}
		erg = x + y;
		System.out.println(erg);
	}

	// ---------------------------------------------------------//
	
	// Multiplikation Kleines Ein-Mal-Eins
	public static void multiupto100() {
		System.out.println("Bitte geben Sie an für welche Zahl (1 - 10) Sie das Kleine Ein-Mal-Eins erhalten möchten: ");
		int x = sc.nextInt();
		while(x > 10) {
			multiupto100();
		}
		for (int i = 1; i < 11; i++) {
			System.out.println("Das Kleine Ein-Mal-Eins für die Zahl " + x);
			int erg = x * i;
			System.out.println("Ergebnis : " + i + " x " + x + " = " + erg);
		}
	}

	// ---------------------------------------------------------//
	// Multiplikation Großes Ein-Mal-Eins
	   public static void multiuptowhatever() {
			System.out.println("Bitte geben Sie an für welche Zahl (1 - 10) Sie das Kleine Ein-Mal-Eins erhalten möchten: ");
			int x = sc.nextInt();
			
			for (int i = 1; i <= x; i++) {
				System.out.println("Das Kleine Ein-Mal-Eins für die Zahl " + x);
				int erg = x * i;
				System.out.println("Ergebnis : " + i + " x " + x + " = " + erg); 
	    }
	   }
	
	
	// ---------------------------------------------------------//
	
	// Nachbarzahlen +/- 1 bis 100
	public static void parentchild100() {
		System.out.println("Beliebige Zahl <= 99 eingeben: ");
		int number = sc.nextInt();
		if (number >= 100) {
			System.out.println("Beliebige Zahl <= 99 eingeben: ");
			parentchild100();
		}
		int parent = number - 1;
		int child = number + 1;
		System.out.println("Der Vorgaenger von " + number + " ist " + parent + ", der Nachfolger ist " + child);

	}

	// Nachbarzahlen +/- 1 bis 1000
	public static void parentchild1000() {
		System.out.println("Beliebige Zahl <= 999 eingeben: ");
		int number = sc.nextInt();
		if (number >= 1000) {
			System.out.println("Beliebige Zahl <= 999 eingeben: ");
			parentchild1000();
		}
		int parent = number - 1;
		int child = number + 1;
		System.out.println("Der Vorgaenger von " + number + " ist " + parent + ", der Nachfolger ist " + child);
	}

	// Nachbarzahlen +/- 1 bis 1000000
	public static void parentchild1MIO() {
		System.out.println("Beliebige Zahl <= 999999 eingeben: ");
		int number = sc.nextInt();
		if (number >= 1000000) {
			System.out.println("Beliebige Zahl <= 999999 eingeben: ");
			parentchild1MIO();
		}
		int parent = number - 1;
		int child = number + 1;
		System.out.println("Der Vorgaenger von " + number + " ist " + parent + ", der Nachfolger ist " + child);
	}

	// NachbarZehner bis 1000
	public static void parentchild10er() {
		System.out.println("Beliebige Zahl <= 999 eingeben: ");
		String number = sc.next();
		int number1 = Integer.parseInt(number);
		if (number1 >= 1000) {
			System.out.println("Beliebige Zahl <= 999 eingeben: ");
			parentchild10er();
		}

		int number2 = Integer.parseInt(number.charAt(number.length() - 1) + "");
		int child = (((number1 + 9) / 10) * 10);
		int parent = number1 - number2;

		System.out.println(
				"Der Vorgaenger Zehner von " + number + " ist " + parent + ", der Nachfolger Zehner ist " + child);
	}

	// NachbarHunderter bis 1000
	public static void parentchild100er() {
		System.out.println("Beliebige Zahl <= 999 eingeben: ");
		String number = sc.next();
		int number1 = Integer.parseInt(number);
		if (number1 >= 1000) {
			System.out.println("Beliebige Zahl <= 999 eingeben: ");
			parentchild10er();
		}

		int number2 = Integer.parseInt(number.substring(number.length() - 2, number.length()));
		int child = (((number1 + 90) / 100) * 100);
		int parent = number1 - number2;

		System.out.println("Der Vorgaenger Hunderter von " + number + " ist " + parent
				+ ", der Nachfolger Hunderter ist " + child);
	}

	// NachbarHunderter bis 1000000
	public static void parentchild1MIOer() {

		System.out.println("Beliebige Zahl <= 999999 eingeben: ");
		String number = sc.next();
		int number1 = Integer.parseInt(number);
		if (number1 >= 1000000) {
			System.out.println("Beliebige Zahl <= 999999 eingeben: ");
			parentchild10er();
		}

		int number2 = Integer.parseInt(number.substring(number.length() - 2, number.length()));
		int child = (((number1 + 90) / 100) * 100);
		int parent = number1 - number2;

		System.out.println("Der Vorgaenger Hunderter von " + number + " ist " + parent
				+ ", der Nachfolger Hunderter ist " + child);

	}

	// Hauptmenue und Eingabe
	public static int feed() {
		System.out.println(
				"1. Addieren, 2. Multiplizieren, 3. Runden, 4. Vorgaenger/Nachfolger, 5. Zahlen vergleichen, 6. Subtrahieren, 7 Dividieren, 8. Programmende");
		System.out.println("Bitte Auswahl treffen (1-8): ");
		int x = sc.nextInt();
		while (x > 8 || x < 1) {
			System.out.println("Ungueltige Eingabe!");
			System.out.println("Bitte Zahl von 1 - 8 eingeben: ");
			x = sc.nextInt();
		}
		return x;
	}

	// Ergebnis von Auswahl im Hauptmenue + Untermenue
	public static void menueselection(int feed) {
		int y = 0;
		switch (feed) {

		// ADDIEREN
		case 1:
			System.out.println("Addieren");

			System.out.println("Untermenue: Bitte Auswahl treffen 1-5");
			System.out.println("1. Addiere im Zahlrenraum bis 10 (ohne Zehneruebergang)");
			System.out.println("2. Addiere im Zahlrenraum bis 10 (mit Zehneruebergang)");
			System.out.println("3. Addiere von Zehner im Zahlenraum bis 100");
			System.out.println("4. Addiere von Zahlen im Zahlenraum bis 1000");
			System.out.println("5. Addiere von Zahlen im Zahlenraum bis 1000000");
			y = sc.nextInt();
			switch (y) {

			// Untermenue ADDIEREN

			case 1:
				System.out.println("Addiere im Zahlrenraum bis 10 (ohne Zehneruebergang)");
				add10();
				break;
			case 2:
				System.out.println("Addiere im Zahlrenraum bis 10 (mit Zehneruebergang)");
				addover10();
				break;
			case 3:
				System.out.println("Addiere von Zehner im Zahlenraum bis 100");
				add100();
				break;
			case 4:
				System.out.println("4. Addiere von Zahlen im Zahlenraum bis 1000");
				add1000();
				break;
			case 5:
				System.out.println("5. Addiere von Zahlen im Zahlenraum bis 1000000");
				add1MIO();
				break;
			default:
			}
			break;

		// MULTIPLIZIEREN

		case 2:
			System.out.println("Multiplizieren");

			System.out.println("Untermenue: Bitte Auswahl treffen 1-2");
			System.out.println("1. Multipliziere Kleines Ein-Mal-Eins");
			System.out.println("2. Multipliziere Großes Ein-Mal-Eins");
			y = sc.nextInt();
			switch (y) {

			// Untermenue MULTIPLIZIEREN

			case 1:
				System.out.println("Multipliziere Kleines Ein-Mal-Eins");
				multiupto100();
				break;
			case 2:
				System.out.println("Multipliziere Großes Ein-Mal-Eins");
				multiuptowhatever();
				break;
			default:

			}
			break;

		// RUNDEN

		case 3:
			System.out.println("Runden");

			System.out.println("Untermenue: Bitte Auswahl treffen 1-3");
			System.out.println("1. Runde auf Zehner im Zahlenraum bis 100");
			System.out.println("2. Runde auf Hunderter im Zahlenraum bis 1000");
			System.out.println("3. Runde auf Tausender im Zahlenraum bis 1000000");
			y = sc.nextInt();

			// Untermenue RUNDEN

			switch (y) {
			case 1:
				System.out.println("Runde auf Zehner im Zahlenraum bis 100");
				// Funktion
				break;
			case 2:
				System.out.println("Runde auf Hunderter im Zahlenraum bis 1000");
				// Funktion
				break;
			case 3:
				System.out.println("Runde auf Tausender im Zahlenraum bis 1000000");
				// Funktion
				break;
			default:

			}
			break;

		// VORGAENGER/NACHFOLGER

		case 4:
			System.out.println("Vorgaenger/Nachfolger");

			System.out.println("Untermenue: Bitte Auswahl treffen 1-6");
			System.out.println("1. Gebe Vorgaenger und Nachfolger an im Zahlenraum bis 100");
			System.out.println("2. Gebe Vorgaenger und Nachfolger an im Zahlenraum bis 1000");
			System.out.println("3. Gebe Vorgaenger und Nachfolger an im Zahlenraum bis 1000000");
			System.out.println("4. Gebe Vorgaengerzehner und Nachfolgezehner an im Zahlenraum bis 1000");
			System.out.println("5. Gebe Vorgaengerhunderter und Nachfolgehunderter an im Zahlenraum bis 1000");
			System.out.println("6. Gebe Vorgaengerhunderter und Nachfolgehunderter an im Zahlenraum bis 1000000");
			y = sc.nextInt();

			// Untermenue VORGAENGER/NACHFOLGER

			switch (y) {
			case 1:
				System.out.println("Gebe Vorgaenger und Nachfolger an im Zahlenraum bis 100");
				parentchild100();
				break;
			case 2:
				System.out.println("Gebe Vorgaenger und Nachfolger an im Zahlenraum bis 1000");
				parentchild1000();
				break;
			case 3:
				System.out.println("Gebe Vorgaenger und Nachfolger an im Zahlenraum bis 1000000");
				parentchild1MIO();
				break;
			case 4:
				System.out.println("Gebe Vorgaengerzehner und Nachfolgezehner an im Zahlenraum bis 1000");
				parentchild10er();
				break;
			case 5:
				System.out.println("Gebe Vorgaengerhunderter und Nachfolgehunderter an im Zahlenraum bis 1000");
				parentchild100er();
				break;
			case 6:
				System.out.println("6. Gebe Vorgaengerhunderter und Nachfolgehunderter an im Zahlenraum bis 1000000");
				parentchild1MIOer();
				break;
			// default: feed();

			}
			break;

		// ZAHLEN VERGLEICHEN

		case 5:
			System.out.println("Zahlen vergleichen");

			System.out.println("Untermenue: Bitte Auswahl treffen 1-3");
			System.out.println("1. Vergleiche die Zahlen (Zahlenraum bis 100)");
			System.out.println("2. Vergleiche die Zahlen (Zahlenraum bis 1000");
			System.out.println("3. Vergleiche die Zahlen (Zahlenraum bis 1000000");
			y = sc.nextInt();

			// Untermenue ZAHLEN VERGLEICHEN

			switch (y) {
			case 1:
				System.out.println("Vergleiche die Zahlen (Zahlenraum bis 100)");
				// Funktion
				break;
			case 2:
				System.out.println("Vergleiche die Zahlen (Zahlenraum bis 1000");
				// Funktion
				break;
			case 3:
				System.out.println("Vergleiche die Zahlen (Zahlenraum bis 1000000");
				// Funktion
				break;
			default:

			}
			break;

		// SUBTRAHIEREN

		case 6:
			System.out.println("Subtrahieren");

			System.out.println("Untermenue: Bitte Auswahl treffen 1-2");
			System.out.println("1. Subtrahiere im Zahlenraum bis 10");
			System.out.println("2. Subtrahiere im Zahlenraum bis 100");
			y = sc.nextInt();

			// Untermenue SUBTRAHIEREN
			switch (y) {
			case 1:
				System.out.println("Subtrahiere im Zahlenraum bis 10");
				// Funktion
				break;
			case 2:
				System.out.println("Subtrahiere im Zahlenraum bis 100");
				// Funktion
				break;
			default:

			}
			break;

		// DIVIDIEREN

		case 7:
			System.out.println("Dividieren");

			System.out.println("Untermenue: Bitte Auswahl treffen 1-2");
			System.out.println("1. Dividieren im Kleinen Ein-Mal-Eins");
			System.out.println("2. Berechnung des Restbetrages");
			y = sc.nextInt();

			// Untermenue DIVIDIEREN

			switch (y) {
			case 1:
				System.out.println("Dividieren im Kleinen Ein-Mal-Eins");
				// Funktion
				break;
			case 2:
				System.out.println("Berechnung des Restbetrages");
				// Funktion
				break;
			}
			break;
		case 8:
			System.out.println("Programmende");
			System.out.println("Goodbye");
			sc.close();
			break;

		// default: feed();
		// break;
		}

	}

	public static void main(String[] args) {

		int feed = feed(); // Hauptmenue + Eingabe abspeichern
		menueselection(feed); // Eingabe wird an Menueauswahl uebergeben

	}

}
