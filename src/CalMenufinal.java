
import java.security.SecureRandom;

import java.util.Scanner;

public class CalMenufinal {

	/*
	 * Gruppenmitglieder: Felix Bernhardt Jan Schlagowsky Lukas Feldbusch
	 * 
	 */

	static Scanner sc = new Scanner(System.in);

	// ZUFALLSGENERIERTE ZAHLEN

	// Random zahl bis 10
	static int getRandomNumber10() {
		SecureRandom random = new SecureRandom();
		return random.nextInt(10);
	}

	// Random Zahl bis 20
	static int getRandomNumber20() {
		SecureRandom random = new SecureRandom();
		return random.nextInt(20);
	}

	// Random Zahl bis 100
	static int getRandomNumber100() {
		SecureRandom random = new SecureRandom();
		return random.nextInt(100);
	}

	// Random Zahl bis 1000
	static int getRandomNumber1000() {
		SecureRandom random = new SecureRandom();
		return random.nextInt(1000);
	}

	// Random Zahl bis 1000000
	static int getRandomNumber1MIO() {
		SecureRandom random = new SecureRandom();
		return random.nextInt(1000000);
	}

	// Random Zahl 10 bis 20
	// static int getRandomNumber1020() {
	// SecureRandom random = new SecureRandom();
	// return random.nextInt(10,20);
	// }

	// AUFGABE 1.1

	public static void add10() {
		//System.out.println("Aufgabe: Addiere im Zahlenraum bis 10 (ohne Zehneruebergang)");
		int Random = getRandomNumber10();
		int random2 = getRandomNumber10();

		if ((random2 + Random) <= 9) {
			System.out.println("Aufgabe: " + Random + " + " + random2 + " ergibt: ");
			int number = sc.nextInt();
			if (number == (random2 + Random)) {
				System.out.println("Super, das Ergebnis ist korrekt!");
				System.out.println(
						"M�chtest du 1. weiter �ben 2. die n�chste Aufgabe. 3. Zur�ck ins Men�. 4. Programm beenden.");
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

			} else {
				System.out.println("Das ist leider das falsche Ergebnis.");
				System.out.println("Zur �bung bekommst du einen neuen Versuch.");
				add10();
				// end of if-else
			}
		} else {
			add10();
		}

	}

	// AUFGABE 1.2

	public static void add10extended() {
		int Random = getRandomNumber10();
		int random2 = getRandomNumber10();

		
			System.out.println("Aufgabe: " + Random + " + " + random2 + " ergibt: ");
			int number = sc.nextInt();
			if (number == (random2 + Random)) {
				System.out.println("Super, das Ergebnis ist korrekt!");
				System.out.println(
						"M�chtest du 1. weiter �ben 2. die n�chste Aufgabe. 3. Zur�ck ins Men�. 4. Programm beenden.");
				int weiterleitung = sc.nextInt();
				switch (weiterleitung) {
				case 1:
					add10extended();
					break;
				case 2:
					add100();
					break;
				case 3:
					int feed = feed();
					menueselection(feed);
					break;
				default:
					System.out.println("Bis zum n�chsten mal ^.^");
				}

			} else {
				System.out.println("Das ist leider das falsche Ergebnis.");
				System.out.println("Zur �bung bekommst du einen neuen Versuch.");
				add10extended();
				// end of if-else
			}
		}
	
	// AUFGABE 1.3

	public static void add100() {
		int Random = getRandomNumber100();
		int random2 = getRandomNumber100();

		if ((random2 + Random) <= 100) {
			System.out.println("Aufgabe: " + Random + " + " + random2 + " ergibt: ");
			int number = sc.nextInt();
			if (number == (random2 + Random)) {
				System.out.println("Super, das Ergebnis ist korrekt!");
				System.out.println(
						"M�chtest du 1. weiter �ben 2. die n�chste Aufgabe. 3. Zur�ck ins Men�. 4. Programm beenden.");
				int weiterleitung = sc.nextInt();
				switch (weiterleitung) {
				case 1:
					add100();
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

			} else {
				System.out.println("Das ist leider das falsche Ergebnis.");
				System.out.println("Zur �bung bekommst du einen neuen Versuch.");
				add100();
				// end of if-else
			}
		} else {
			add100();
		}

	}

	// AUFGABE 1.4

	public static void add1000() {
		int Random = getRandomNumber1000();
		int random2 = getRandomNumber1000();

		if ((random2 + Random) <= 1000) {
			System.out.println("Aufgabe: " + Random + " + " + random2 + " ergibt: ");
			int number = sc.nextInt();
			if (number == (random2 + Random)) {
				System.out.println("Super, das Ergebnis ist korrekt!");
				System.out.println(
						"M�chtest du 1. weiter �ben 2. die n�chste Aufgabe. 3. Zur�ck ins Men�. 4. Programm beenden.");
				int weiterleitung = sc.nextInt();
				switch (weiterleitung) {
				case 1:
					add1000();
					break;
				case 2:
					add1MIO();
					break;
				case 3:
					int feed = feed();
					menueselection(feed);
					break;
				default:
					System.out.println("Bis zum n�chsten mal ^.^");
				}

			} else {
				System.out.println("Das ist leider das falsche Ergebnis.");
				System.out.println("Zur �bung bekommst du einen neuen Versuch.");
				add1000();
				// end of if-else
			}
		} else {
			add1000();
		}

	
	}

	// AUFGABE 1.5

	public static void add1MIO() {
		int Random = getRandomNumber1MIO();
		int random2 = getRandomNumber1MIO();

		if ((random2 + Random) <= 1000000) {
			System.out.println("Aufgabe: " + Random + " + " + random2 + " ergibt: ");
			int number = sc.nextInt();
			if (number == (random2 + Random)) {
				System.out.println("Super, das Ergebnis ist korrekt!");
				System.out.println(
						"M�chtest du 1. weiter �ben 2. die n�chste Aufgabe. 3. Zur�ck ins Men�. 4. Programm beenden.");
				int weiterleitung = sc.nextInt();
				switch (weiterleitung) {
				case 1:
					add1MIO();
					break;
				case 2:
					multismall();
					break;
				case 3:
					int feed = feed();
					menueselection(feed);
					break;
				default:
					System.out.println("Bis zum n�chsten mal ^.^");
				}

			} else {
				System.out.println("Das ist leider das falsche Ergebnis.");
				System.out.println("Zur �bung bekommst du einen neuen Versuch.");
				add1MIO();
				// end of if-else
			}
		} else {
			add1MIO();
		}

	}

	// AUFGABE 2.1

	public static void multismall() {
		System.out.println("Aufgabe: Mulitpliziere Kleines Ein-Mal-Eins");
		int Random = getRandomNumber10();

		for (int i = 3; i <= 10; i++) {
			int erg = Random * i;
			System.out.println(erg);
		}
		System.out.println("Welches Kleine Ein-Mal-Eins ist hier zu erkennen?");
		int number1 = sc.nextInt();

		if (number1 == Random) {

			System.out.println("Richtig, " + number1 + " geh�rt zu diesem Ein-Mal-Eins");
			System.out.println(
					"M�chtest du 1. weiter �ben 2. die n�chste Aufgabe. 3. Zur�ck ins Men�. 4. Programm beenden.");
			int weiterleitung = sc.nextInt();
			switch (weiterleitung) {
			case 1:
				multismall();
				break;
			case 2:
				multibig();
				break;
			case 3:
				int feed = feed();
				menueselection(feed);
				break;
			default:
				System.out.println("Bis zum n�chsten mal ^.^");
			}

		} else {
			System.out.println("Das ist leider das falsche Ergebnis.");
			System.out.println("Zur �bung bekommst du einen neuen Versuch.");
			multismall();
		} // end of if-else
	}

	// AUFGABE 2.2

	public static void multibig() {
		System.out.println("Aufgabe: Mulitpliziere Gro�es Ein-Mal-Eins");
		int Random = getRandomNumber20();

		for (int i = 3; i <= 20; i++) {
			int erg = Random * i;
			System.out.println(erg);
		}
		System.out.println("Welches Gro�e Ein-Mal-Eins ist hier zu erkennen?");
		int number1 = sc.nextInt();

		if (number1 == Random) {

			System.out.println("Richtig, " + number1 + " geh�rt zu diesem Ein-Mal-Eins");
			System.out.println(
					"M�chtest du 1. weiter �ben 2. die n�chste Aufgabe. 3. Zur�ck ins Men�. 4. Programm beenden.");
			int weiterleitung = sc.nextInt();
			switch (weiterleitung) {
			case 1:
				multibig();
				break;
			case 2:
				round100();
				break;
			case 3:
				int feed = feed();
				menueselection(feed);
				break;
			default:
				System.out.println("Bis zum n�chsten mal ^.^");

			}

		} else {
			System.out.println("Das ist leider das falsche Ergebnis.");
			System.out.println("Zur �bung bekommst du einen neuen Versuch.");
			multismall();
		} // end of if-else
	}

	// AUFGABE 3.1

	public static void round100() {

		System.out.println("Aufgabe: Rund auf Zehner im Zahlenraum bis 100");
		int child = 0;
		String Random = getRandomNumber100() + "";
		int number1 = Integer.parseInt(Random);

		int random = Integer.parseInt(Random.charAt(Random.length() - 1) + "");
		System.out.println("random: " + random);
		System.out.println("Random: " + Random);

		if (Integer.parseInt(Random.charAt(Random.length() - 1) + "") <= 5) {
			child = random - Integer.parseInt(Random.charAt(Random.length() - 1) + "");
			System.out.println(child);

			System.out.println("Auf welchen Zehner muss " + Random + " gerundet werden?");
			int number2 = sc.nextInt();

			if (number2 == child) {
				System.out.println("Richtig, " + number1 + " ist der korrekte Zehner");
				int weiterleitung = sc.nextInt();
				switch (weiterleitung) {
				case 1:
					round100();
					break;
				case 2:
					round1000();
					break;
				case 3:
					int feed = feed();
					menueselection(feed);
					break;
				default:
					System.out.println("Bis zum n�chsten mal ^.^");
					break;
				}

			}
		} else {
			System.out.println("Das ist leider das falsche Ergebnis.");
			System.out.println("Zur �bung bekommst du einen neuen Versuch.");
			round100();
		} // end of if-else
	}

	// AUFGABE 3.2

	public static void round1000() {

	}

	// AUFGABE 4.1

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

	// AUFGABE 4.2

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

	// AUFGABE 4.3

	// Nachbarzahlen +/- 1 bis 1000000
	public static void parentchild1MIO() {
		System.out.println("Aufgabe: Gebe Vorgaenger und Nachfolger an im Zahlenraum bis 1000000");
		int Random = getRandomNumber1MIO();

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

	// AUFGABE 4.4

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

	// AUFGABE 4.5

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

	// Aufgabe 4.6

	// NachbarHunderter bis 1000000
	public static void parentchild1MIOer() {
		System.out.println("Aufgabe: Gebe Vorgaenger Hunderter und Nachfolge Hunderter an im Zahlenraum bis 1000000");
		int Random = getRandomNumber1MIO();

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
				add10extended();
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
				System.out.println("Ung�ltige Eigabe!");
				feed();
				menueselection(feed);
				break;
			}
			break;

		// MULTIPLIZIEREN

		case 2:
			System.out.println("Multiplizieren");
			do {
				System.out.println("Untermenue: Bitte Auswahl treffen 1-2");
				System.out.println("1. Multipliziere Kleines Ein-Mal-Eins");
				System.out.println("2. Multipliziere Gro�es Ein-Mal-Eins");
				y = sc.nextInt();
			} while ((y < 0 || y > 2));
			switch (y) {

			// Untermenue MULTIPLIZIEREN

			case 1:
				System.out.println("Multipliziere Kleines Ein-Mal-Eins");
				multismall();
				break;
			case 2:
				System.out.println("Multipliziere Gro�es Ein-Mal-Eins");
				multibig();
				break;
			default:
				System.out.println("Ung�ltige Eigabe!");
				feed();
				menueselection(feed);

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
				round100();
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
				System.out.println("Ung�ltige Eigabe!");
				feed();
				menueselection(feed);

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
				feed();
				menueselection(feed);

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
				System.out.println("Ung�ltige Eigabe!");
				feed();
				menueselection(feed);

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
				System.out.println("Ung�ltige Eigabe!");
				feed();
				menueselection(feed);

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