
import java.security.SecureRandom;

import java.util.Scanner;

public class CalMenufinal {

	/*
	 * Gruppenmitglieder: Felix Bernhardt Jan Schlagowsky Lukas Feldbusch
	 * 
	 */

	static Scanner sc = new Scanner(System.in);

	// Random zahl bis 10
	static int getRandomNumber10() {
		SecureRandom random = new SecureRandom();
		return random.nextInt(10);
	}

	public static void add10() {
		System.out.println("Aufgabe: Addiere im Zahlenraum bis 10 (ohne Zehneruebergang)");
		int Random = getRandomNumber10();

		System.out.println("Welche beiden Zahlen addiert ergeben: " + Random);
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();

		if ((number1 + number2) == Random) {
			System.out.println("Richtig, " + number1 + " addiert mit " + number2 + " ergibt: " + Random);
			System.out.println("M�chtest du 1. weiter �ben 2. die n�chste Aufgabe. 3. Zur�ck ins Men�. 4. Programm beenden.");
			int weiterleitung = sc.nextInt();
			switch (weiterleitung) {
			case 1:
				add10();
				break;
			case 2:
				add10extended();
				break;
			case 3:
				int feed = feed();
				menueselection(feed);
				break;
			default:
				System.out.println("Bis zum n�chsten mal ^.^");
			}
		
		}
		else {
			System.out.println("Das ist leider das falsche Ergebnis.");
			System.out.println("Zur �bung bekommst du einen neuen Versuch.");
			add10();
		} // end of if-else

	
	}
	
	// Random Zahl bis 20
	static int getRandomNumber20() {
		SecureRandom random = new SecureRandom();
		return random.nextInt(20);
	}
	
	
	public static void add10extended() {
		System.out.println("Aufgabe: Addiere im Zahlenraum bis 10 (ohne Zehneruebergang)");
		int Random = getRandomNumber20();

		System.out.println("Welche beiden Zahlen addiert ergeben: " + Random);
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();

		if ((number1 + number2) == Random) {
			System.out.println("Richtig, " + number1 + " addiert mit " + number2 + " ergibt: " + Random);
			System.out.println("M�chtest du 1. weiter �ben 2. die n�chste Aufgabe. 3. Zur�ck ins Men�. 4. Programm beenden.");
			int weiterleitung = sc.nextInt();
			switch (weiterleitung) {
			case 1:
				parentchild100();
				break;
			case 2:
				parentchild1000();
				break;
			case 3:
				int feed = feed();
				menueselection(feed);
				break;
			default:
				System.out.println("Bis zum n�chsten mal ^.^");
			}
		
		}
		else {
			System.out.println("Das ist leider das falsche Ergebnis.");
			System.out.println("Zur �bung bekommst du einen neuen Versuch.");
			add10extended();
		} // end of if-else

	}
	

	// Random Zahl bis 100
	static int getRandomNumber100() {
		SecureRandom random = new SecureRandom();
		return random.nextInt(100);
	}

	// Nachbarzahlen +/- 1 bis 100
	public static void parentchild100() {
		System.out.println("Aufgabe: Gebe Vorg�nger und Nachfolger an im Zahlenraum bis 100");
		int Random = getRandomNumber100();

		System.out.println("Nenne erst den Vorg�nger und dann den Nachfolger von " + Random);
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int parent = Random - 1;
		int child = Random + 1;
		if (number1 == parent && number2 == child) {
			System.out.println(
					"Richtig der Vorg�nger von " + Random + " ist " + parent + " und der Nachfolger ist " + child);
			System.out.println(
					"M�chtest du 1. weiter �ben 2. die n�chste Aufgabe. 3. Zur�ck ins Men�. 4. Programm beenden.");
			int weiterleitung = sc.nextInt();
			switch (weiterleitung) {
			case 1:
				parentchild100();
				break;
			case 2:
				parentchild1000();
				break;
			case 3:
				int feed = feed();
				menueselection(feed);
				break;
			default:
				System.out.println("Bis zum n�chsten mal ^.^");
			}
		} // end of if
		else {
			System.out.println("Das sind Leider die Falschen Ergebnisse :( Richtig w�re der Vorg�nger " + parent
					+ " und der Nachfolger " + child);
			System.out.println("Zur �bung bekommst du einen neuen Versuch.");
			parentchild100();
		} // end of if-else

	}

	// Random Zahl bis 1000
	static int getRandomNumber1000() {
		SecureRandom random = new SecureRandom();
		return random.nextInt(1000);
	}

	// Nachbarzahlen +/- 1 bis 1000
	public static void parentchild1000() {
		System.out.println("Aufgabe: Gebe Vorg�nger und Nachfolger an im Zahlenraum bis 1000");
		int Random = getRandomNumber1000();

		System.out.println("Nenne erst den Vorg�nger und dann den Nachfolger von " + Random);
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int parent = Random - 1;
		int child = Random + 1;
		if (number1 == parent && number2 == child) {
			System.out.println(
					"Richtig der Vorg�nger von " + Random + " ist " + parent + " und der Nachfolger ist " + child);
			System.out.println(
					"M�chtest du 1. weiter �ben 2. die n�chste Aufgabe. 3. Zur�ck ins Men�. 4. Programm beenden.");
			int weiterleitung = sc.nextInt();
			switch (weiterleitung) {
			case 1:
				parentchild1000();
				break;
			case 2:
				parentchild1MIO();
				break;
			case 3:
				int feed = feed();
				menueselection(feed);
				break;
			default:
				System.out.println("Bis zum n�chsten mal ^.^");
			}

		} else {
			System.out.println("Das sind Leider die Falschen Ergebnisse :( Richtig w�re der Vorg�nger " + parent
					+ " und der Nachfolger " + child);
			System.out.println("Zur �bung bekommst du einen neuen Versuch.");
			parentchild1000();
		} // end of if-else

	}

	// Random Zahl bis 1000000
	static int getRandomNumber1000000() {
		SecureRandom random = new SecureRandom();
		return random.nextInt(1000000);
	}

	// Nachbarzahlen +/- 1 bis 1000000
	public static void parentchild1MIO() {
		System.out.println("Aufgabe: Gebe Vorgaenger und Nachfolger an im Zahlenraum bis 1000000");
		int Random = getRandomNumber1000000();

		System.out.println("Nenne erst den Vorg�nger und dann den Nachfolger von " + Random);
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int parent = Random - 1;
		int child = Random + 1;
		if (number1 == parent && number2 == child) {
			System.out.println(
					"Richtig der Vorg�nger von " + Random + " ist " + parent + " und der Nachfolger ist " + child);
			System.out.println(
					"M�chtest du 1. weiter �ben 2. die n�chste Aufgabe. 3. Zur�ck ins Men�. 4. Programm beenden.");
			int weiterleitung = sc.nextInt();
			switch (weiterleitung) {
			case 1:
				parentchild1MIO();
				break;
			case 2:
				parentchild10er();
				break;
			case 3:
				int feed = feed();
				menueselection(feed);
				break;
			default:
				System.out.println("Bis zum n�chsten mal ^.^");
			}
		} // end of if
		else {
			System.out.println("Das sind Leider die Falschen Ergebnisse :( Richtig w�re der Vorg�nger " + parent
					+ " und der Nachfolger " + child);
			System.out.println("Zur �bung bekommst du einen neuen Versuch.");
			parentchild1MIO();
		} // end of if-else
	}

	// NachbarZehner bis 1000
	public static void parentchild10er() {
		System.out.println("Aufgabe: Gebe Vorgaenger Zehner und Nachfolge Zehner an im Zahlenraum bis 1000");
		int Random = getRandomNumber1000();

		System.out.println("Nenne erst den Vorg�nger Zehner und dann den Nachfolge Zehner von " + Random);
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int child = (((Random + 10) / 10) * 10);
		int parent = (((Random - 1) / 10) * 10);
		if (number1 == parent && number2 == child) {
			System.out.println("Richtig der Vorg�nger Zehner von " + Random + " ist " + parent
					+ " und der Nachfolge Zehner ist " + child);
			System.out.println(
					"M�chtest du 1. weiter �ben 2. die n�chste Aufgabe. 3. Zur�ck ins Men�. 4. Programm beenden.");
			int weiterleitung = sc.nextInt();
			switch (weiterleitung) {
			case 1:
				parentchild10er();
				break;
			case 2:
				parentchild100er();
				break;
			case 3:
				int feed = feed();
				menueselection(feed);
				break;
			default:
				System.out.println("Bis zum n�chsten mal ^.^");
			}
		} // end of if
		else {
			System.out.println("Das sind Leider die Falschen Ergebnisse :( Richtig w�re der Vorg�nger Zehner " + parent
					+ " und der Nachfolge Zehner " + child);
			System.out.println("Zur �bung bekommst du einen neuen Versuch.");
			parentchild10er();
		} // end of if-else
	}

	// NachbarHunderter bis 1000
	public static void parentchild100er() {
		System.out.println("Aufgabe: Gebe Vorgaenger Hunderter und Nachfolge Hunderter an im Zahlenraum bis 1000");
		int Random = getRandomNumber1000();

		System.out.println("Nenne erst den Vorg�nger Hunderter und dann den Nachfolge Hunderter von " + Random);
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int child = (((Random + 100) / 100) * 100);
		int parent = (((Random - 1) / 100) * 100);
		if (number1 == parent && number2 == child) {
			System.out.println("Richtig der Vorg�nger Hunderter von " + Random + " ist " + parent
					+ " und der Nachfolge Hunderter ist " + child);
			System.out.println(
					"M�chtest du 1. weiter �ben 2. die n�chste Aufgabe. 3. Zur�ck ins Men�. 4. Programm beenden.");
			int weiterleitung = sc.nextInt();
			switch (weiterleitung) {
			case 1:
				parentchild100er();
				break;
			case 2:
				parentchild1MIOer();
				break;
			case 3:
				int feed = feed();
				menueselection(feed);
				break;
			default:
				System.out.println("Bis zum n�chsten mal ^.^");
			}
		} // end of if
		else {
			System.out.println("Das sind Leider die Falschen Ergebnisse :( Richtig w�re der Vorg�nger Hunderter "
					+ parent + " und der Nachfolge Hunderter " + child);
			System.out.println("Zur �bung bekommst du einen neuen Versuch.");
			parentchild100er();
		} // end of if-else
	}

	// NachbarHunderter bis 1000000
	public static void parentchild1MIOer() {
		System.out.println("Aufgabe: Gebe Vorgaenger Hunderter und Nachfolge Hunderter an im Zahlenraum bis 1000000");
		int Random = getRandomNumber1000000();

		System.out.println("Nenne erst den Vorg�nger Hunderter und dann den Nachfolge Hunderter von " + Random);
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int child = (((Random + 100) / 100) * 100);
		int parent = (((Random - 1) / 100) * 100);
		if (number1 == parent && number2 == child) {
			System.out.println("Richtig der Vorg�nger Hunderter von " + Random + " ist " + parent
					+ " und der Nachfolge Hunderter ist " + child);
			System.out.println("M�chtest du 1. weiter �ben 2. Zur�ck ins Men�. 3. Programm beenden.");
			int weiterleitung = sc.nextInt();
			switch (weiterleitung) {
			case 1:
				parentchild1MIOer();
				break;
			case 2:
				int feed = feed();
				menueselection(feed);
				break;
			default:
				System.out.println("Bis zum n�chsten mal ^.^");
			}
		} // end of if
		else {
			System.out.println("Das sind Leider die Falschen Ergebnisse :( Richtig w�re der Vorg�nger Hunderter "
					+ parent + " und der Nachfolge Hunderter " + child);
			System.out.println("Zur �bung bekommst du einen neuen Versuch.");
			parentchild100er();
		} // end of if-else

	}

	// Hauptmenue und Eingabe
	public static int feed() {
		System.out.println(
				"1. Addieren, 2. Multiplizieren, 3. Runden, 4. Vorgaenger/Nachfolger, 5. Zahlen vergleichen, 6. Subtrahieren, 7 Dividieren, 8. Programmende");
		System.out.println("Bitte Auswahl treffen (1-8): ");
		int x = sc.nextInt();
		while (x > 8 || x < 1) {
			System.out.println("Ung�ltige eingabe! Bitte eine Zahl von 1-8 angeben");
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
			do {
				System.out.println("Untermenue: Bitte Auswahl treffen 1-5");
				System.out.println("1. Addiere im Zahlrenraum bis 10 (ohne Zehneruebergang)");
				System.out.println("2. Addiere im Zahlrenraum bis 10 (mit Zehneruebergang)");
				System.out.println("3. Addiere von Zehner im Zahlenraum bis 100");
				System.out.println("4. Addiere von Zahlen im Zahlenraum bis 1000");
				System.out.println("5. Addiere von Zahlen im Zahlenraum bis 1000000");
				y = sc.nextInt();
			} while (y > 5 || y < 1);

			switch (y) {

			// Untermenue ADDIEREN

			case 1:
				System.out.println("Addiere im Zahlrenraum bis 10 (ohne Zehneruebergang");
				add10();
				break;
			case 2:
				System.out.println("Addiere im Zahlrenraum bis 10 (mit Zehneruebergang)");
				// Funktion
				break;
			case 3:
				System.out.println("Addiere von Zehner im Zahlenraum bis 100");
				// Funktion
				break;
			case 4:
				System.out.println("4. Addiere von Zahlen im Zahlenraum bis 1000");
				// Funktion
				break;
			case 5:
				System.out.println("5. Addiere von Zahlen im Zahlenraum bis 1000000");
				// Funktion
				break;
			default:
			}
			break;

		// MULTIPLIZIEREN

		case 2:
			System.out.println("Multiplizieren");

			System.out.println("Untermenue: Bitte Auswahl treffen 1-2");
			System.out.println("1. Multipliziere Kleines Ein-Mal-Eins");
			System.out.println("2. Multipliziere Gro�es Ein-Mal-Eins");
			y = sc.nextInt();
			switch (y) {

			// Untermenue MULTIPLIZIEREN

			case 1:
				System.out.println("Multipliziere Kleines Ein-Mal-Eins");
				// Funktion
				break;
			case 2:
				System.out.println("Multipliziere Gro�es Ein-Mal-Eins");
				// Funktion
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
			do {

				System.out.println("Untermenue: Bitte Auswahl treffen 1-6");
				System.out.println("1. Gebe Vorgaenger und Nachfolger an im Zahlenraum bis 100");
				System.out.println("2. Gebe Vorgaenger und Nachfolger an im Zahlenraum bis 1000");
				System.out.println("3. Gebe Vorgaenger und Nachfolger an im Zahlenraum bis 1000000");
				System.out.println("4. Gebe Vorgaengerzehner und Nachfolgezehner an im Zahlenraum bis 1000");
				System.out.println("5. Gebe Vorgaengerhunderter und Nachfolgehunderter an im Zahlenraum bis 1000");
				System.out.println("6. Gebe Vorgaengerhunderter und Nachfolgehunderter an im Zahlenraum bis 1000000");
				y = sc.nextInt();
			} while (y > 6 || y < 1);
			// Untermenue VORGAENGER/NACHFOLGER

			switch (y) {
			case 1:
				parentchild100();
				break;
			case 2:
				parentchild1000();
				break;
			case 3:
				parentchild1MIO();
				break;
			case 4:
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
			default:
				System.out.println("Ung�ltige Eigabe!");

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