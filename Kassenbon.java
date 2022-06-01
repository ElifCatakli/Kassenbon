package kbon;

import javax.swing.JOptionPane;
import java.util.Arrays;

public class Kassenbon extends Preis {
	//static String eingabe = JOptionPane.showInputDialog("Geben Sie die Filiale ein, in der Sie sich gerade befinden");
	static int count = 1;
	private static double summe;

	/*
	public String[] ueberschrift() {
		String[] filiale = { "Filiale 1", "Filiale 2", "Filiale 3" };
		if (eingabe.equals(filiale[0])) {
			System.out.println(filiale[0] + "\nQuerenburger Hoehe 208\n44801 Bochum\n");
			System.out.println("Kassenbon Nr. :" + count++ + "\n");
			while (!(eingabe.equals(filiale[0]))) {
				count = 1;
				break;
			}
		} else if (eingabe.equals(filiale[1])) {
			System.out.println(filiale[1] + "\nHauptstrasse 19\n33378 Rheda\n");
			System.out.println("Kassenbon Nr: " + count++ + "\n");
			while (!(eingabe.equals(filiale[1]))) {
				count = 1;
				break;
			}
		} else if (eingabe.equals(filiale[2])) {
			System.out.println(filiale[2] + "\nOverbergstr. 15\n44801 Bochum\n");
			System.out.println("Kassenbon Nr: " + count++ + "\n");
			while (!(eingabe.equals(filiale[2]))) {
				count = 1;
				break;
			}
		} else {
			System.out.println("Falsche Eingabe");

		}
		return filiale;
	}
*/
	public void artikel() {
		String[] gemuese = { "Tomaten", "Bohnen", "Brokkoli", "Spinat", "Gurken", "Champignons", "Kartoffeln",
				"Paprika", "Rosenkohl", "Eier" };
		String[] obst = { "Erdbeeren", "Ananas", "Bananen", "Weintrauben", "Mango", "Pfirsich", "Pflaumen", "Aprikosen",
				"Kiwi", "Orangen" };

		double bohnen = Preis.getBohnen();
		double brokkoli = Preis.getBrokkoli();
		double champignons = Preis.getChampignons();
		double eier = Preis.getEier();
		double gurken = Preis.getGurken();
		double kartoffeln = Preis.getKartoffeln();
		double paprika = Preis.getPaprika();
		double rosenkohl = Preis.getRosenkohl();
		double spinat = Preis.getSpinat();
		double tomaten = Preis.getTomaten();
		double ananas = Preis.getAnanas();
		double aprikosen = Preis.getAprikosen();
		double bananen = Preis.getBananen();
		double erdbeeren = Preis.getErdbeeren();
		double kiwi = Preis.getKiwi();
		double mango = Preis.getMango();
		double orangen = Preis.getOrangen();
		double pfirsich = Preis.getPfirsich();
		double pflaumen = Preis.getPflaumen();
		double weintrauben = Preis.getWeintrauben();

		// ---------------------Obst oder Gemuese---------------------------
		String og = JOptionPane.showInputDialog("Waehlen Sie zwischen Obst oder Gemuese (O oder G)");
		if (og.equals("O")) {
			Arrays.sort(obst);
			for (String str : obst) {
				System.out.print("//" + str + " ");
			}
			System.out.println();
			int obstEingabe = Integer.parseInt(JOptionPane.showInputDialog("Waehlen Sie die Zahl des Artikels aus:"));

			switch (obstEingabe) {
			case 1:
				// System.out.println(obst[0]+ " wurde aufgenommen");
				System.out.print(obst[0] + " ");
				break;
			case 2:
				System.out.print(obst[1] + " ");
				break;
			case 3:
				System.out.print(obst[2] + " ");
				break;
			case 4:
				System.out.print(obst[3] + " ");
				break;
			case 5:
				System.out.print(obst[4] + " ");
				break;
			case 6:
				System.out.print(obst[5] + " ");
				break;
			case 7:
				System.out.print(obst[6] + " ");
				break;
			case 8:
				System.out.print(obst[7] + " ");
				break;
			case 9:
				System.out.print(obst[8] + " ");
				break;
			case 10:
				System.out.print(obst[9] + " ");
				break;
			default:
				System.out.println("Ungueltige Eingabe");
			}

			// ---------------------Preis---------------------
			String menge = JOptionPane.showInputDialog("Geben Sie die Menge an (Stk oder kg)");
			if (menge.equals("Stk")) {
				int stk = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie die Stueckzahl an"));
				System.out.print("\t" + stk + " Stk\tx");

				if (obstEingabe == 1) {
					System.out.print("\t" + ananas + "€ ");
					System.out.print("\t = " + Math.round(setSumme(stk * ananas * 100)) / 100.0 + "€");
				} else if (obstEingabe == 2) {
					System.out.print("\t" + aprikosen + "€ ");
					System.out.print("\t = " + Math.round(setSumme(stk * aprikosen * 100)) / 100.0 + "€");
				} else if (obstEingabe == 3) {
					System.out.print("\t" + bananen + "€ ");
					System.out.print("\t = " + Math.round(setSumme(stk * bananen * 100)) / 100.0 + "€");
				} else if (obstEingabe == 4) {
					System.out.print("\t" + erdbeeren + "€ ");
					System.out.print("\t = " + Math.round(setSumme(stk * erdbeeren * 100)) / 100.0 + "€");
				} else if (obstEingabe == 5) {
					System.out.print("\t" + kiwi + "€ ");
					System.out.print("\t = " + Math.round(setSumme(stk * kiwi * 100)) / 100.0 + "€");
				} else if (obstEingabe == 6) {
					System.out.print("\t" + mango + "€ ");
					System.out.print("\t = " + Math.round(setSumme(stk * mango * 100)) / 100.0 + "€");
				} else if (obstEingabe == 7) {
					System.out.print("\t" + orangen + "€ ");
					System.out.print("\t = " + Math.round(setSumme(stk * orangen * 100)) / 100.0 + "€");
				} else if (obstEingabe == 8) {
					System.out.print("\t" + pfirsich + "€ ");
					System.out.print("\t = " + Math.round(setSumme(stk * pfirsich * 100)) / 100.0 + "€");
				} else if (obstEingabe == 9) {
					System.out.print("\t" + pflaumen + "€ ");
					System.out.print("\t = " + Math.round(setSumme(stk * pflaumen * 100)) / 100.0 + "€");
				} else if (obstEingabe == 10) {
					System.out.print("\t" + weintrauben + "€ ");
					System.out.print("\t = " + Math.round(setSumme(stk * weintrauben * 100)) / 100.0 + "€");
				}
			} else if (menge.equals("kg")) {
				double kg = Double.parseDouble(JOptionPane.showInputDialog("Geben Sie den Wert an"));
				System.out.print("\t" + kg + " kg\tx");
				if (obstEingabe == 1) {
					System.out.print("\t" + ananas + "� ");
					System.out.print("\t = " + Math.round(setSumme(kg * ananas * 100)) / 100.0 + "�");
				} else if (obstEingabe == 2) {
					System.out.print("\t" + aprikosen + "� ");
					System.out.print("\t = " + Math.round(setSumme(kg * aprikosen * 100)) / 100.0 + "�");
				} else if (obstEingabe == 3) {
					System.out.print("\t" + bananen + "� ");
					System.out.print("\t = " + Math.round(setSumme(kg * bananen * 100)) / 100.0 + "�");
				} else if (obstEingabe == 4) {
					System.out.print("\t" + erdbeeren + "� ");
					System.out.print("\t = " + Math.round(setSumme(kg * erdbeeren * 100)) / 100.0 + "�");
				} else if (obstEingabe == 5) {
					System.out.print("\t" + kiwi + "� ");
					System.out.print("\t = " + Math.round(setSumme(kg * kiwi * 100)) / 100.0 + "�");
				} else if (obstEingabe == 6) {
					System.out.print("\t" + mango + "� ");
					System.out.print("\t = " + Math.round(setSumme(kg * mango * 100)) / 100.0 + "�");
				} else if (obstEingabe == 7) {
					System.out.print("\t" + orangen + "� ");
					System.out.print("\t = " + Math.round(setSumme(kg * orangen * 100)) / 100.0 + "�");
				} else if (obstEingabe == 8) {
					System.out.print("\t" + pfirsich + "� ");
					System.out.print("\t = " + Math.round(setSumme(kg * pfirsich * 100)) / 100.0 + "�");
				} else if (obstEingabe == 9) {
					System.out.print("\t" + pflaumen + "� ");
					System.out.print("\t = " + Math.round(setSumme(kg * pflaumen * 100)) / 100.0 + "�");
				} else if (obstEingabe == 10) {
					System.out.print("\t" + weintrauben + "� ");
					System.out.print("\t = " + Math.round(setSumme(kg * weintrauben * 100)) / 100.0 + "�");
				}
			}
		}
		if (og.equals("G")) {
			Arrays.sort(gemuese);
			for (String str : gemuese) {
				System.out.print("//" + str + " ");
			}
			System.out.println();
			int gemueseEingabe = Integer
					.parseInt(JOptionPane.showInputDialog("Waehlen Sie die Zahl des Artikels aus:"));

			switch (gemueseEingabe) {
			case 1:
				// System.out.println(obst[0]+ " wurde aufgenommen");
				System.out.print(gemuese[0] + " ");
				break;
			case 2:
				System.out.print(gemuese[1] + " ");
				break;
			case 3:
				System.out.print(gemuese[2] + " ");
				break;
			case 4:
				System.out.print(gemuese[3] + " ");
				break;
			case 5:
				System.out.print(gemuese[4] + " ");
				break;
			case 6:
				System.out.print(gemuese[5] + " ");
				break;
			case 7:
				System.out.print(gemuese[6] + " ");
				break;
			case 8:
				System.out.print(gemuese[7] + " ");
				break;
			case 9:
				System.out.print(gemuese[8] + " ");
				break;
			case 10:
				System.out.print(gemuese[9] + " ");
				break;
			default:
				System.out.println("Ungueltige Eingabe");
			}

			// --------------------------Menge, Stk und Preis-----------------------------------
			String menge = JOptionPane.showInputDialog("Geben Sie die Menge an (Stk oder kg)");
			if (menge.equals("Stk")) {
				int stk = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie die Stueckzahl an"));
				System.out.print("\t" + stk + " Stk\tx");
				if (gemueseEingabe == 1) {
					System.out.print("\t" + bohnen + "€ ");
					System.out.print("\t = " + Math.round(setSumme(stk * bohnen * 100)) / 100.0 + "€");
				} else if (gemueseEingabe == 2) {
					System.out.print("\t" + brokkoli + "€ ");
					System.out.print("\t = " + Math.round(setSumme(stk * brokkoli * 100)) / 100.0 + "€");
				} else if (gemueseEingabe == 3) {
					System.out.print("\t" + champignons + "€ ");
					System.out.print("\t = " + Math.round(setSumme(stk * champignons * 100)) / 100.0 + "€");
				} else if (gemueseEingabe == 4) {
					System.out.print("\t" + eier + "€ ");
					System.out.print("\t = " + Math.round(setSumme(stk * eier * 100)) / 100.0 + "€");
				} else if (gemueseEingabe == 5) {
					System.out.print("\t" + gurken + "€ ");
					System.out.print("\t = " + Math.round(setSumme(stk * gurken * 100)) / 100.0 + "€");
				} else if (gemueseEingabe == 6) {
					System.out.print("\t" + kartoffeln + "€ ");
					System.out.print("\t = " + Math.round(setSumme(stk * kartoffeln * 100)) / 100.0 + "€");
				} else if (gemueseEingabe == 7) {
					System.out.print("\t" + paprika + "€ ");
					System.out.print("\t = " + Math.round(setSumme(stk * paprika * 100)) / 100.0 + "€");
				} else if (gemueseEingabe == 8) {
					System.out.print("\t" + rosenkohl + "€ ");
					System.out.print("\t = " + Math.round(setSumme(stk * rosenkohl * 100)) / 100.0 + "€");
				} else if (gemueseEingabe == 9) {
					System.out.print("\t" + spinat + "€ ");
					System.out.print("\t = " + Math.round(setSumme(stk * spinat * 100)) / 100.0 + "€");
				} else if (gemueseEingabe == 10) {
					System.out.print("\t" + tomaten + "€ ");
					System.out.print("\t =" + Math.round(setSumme(stk * tomaten * 100)) / 100.0 + "€");
				}
			} else if (menge.equals("kg")) {
				double kg = Double.parseDouble(JOptionPane.showInputDialog("Geben Sie den Wert an"));
				System.out.print("\t" + kg + " kg\tx");
				if (gemueseEingabe == 1) {
					System.out.print("\t" + bohnen + "€ ");
					System.out.print("\t = " + Math.round(setSumme(kg * bohnen * 100)) / 100.0 + "€");
				} else if (gemueseEingabe == 2) {
					System.out.print("\t" + brokkoli + "€ ");
					System.out.print("\t = " + Math.round(setSumme(kg * brokkoli * 100)) / 100.0 + "€");
				} else if (gemueseEingabe == 3) {
					System.out.print("\t" + champignons + "€ ");
					System.out.print("\t = " + Math.round(setSumme(kg * champignons * 100)) / 100.0 + "€");
				} else if (gemueseEingabe == 4) {
					System.out.print("\t" + eier + "€ ");
					System.out.print("\t = " + Math.round(setSumme(kg * eier * 100)) / 100.0 + "€");
				} else if (gemueseEingabe == 5) {
					System.out.print("\t" + gurken + "€ ");
					System.out.print("\t = " + Math.round(setSumme(kg * gurken * 100)) / 100.0 + "€");
				} else if (gemueseEingabe == 6) {
					System.out.print("\t" + kartoffeln + "€ ");
					System.out.print("\t = " + Math.round(setSumme(kg * kartoffeln * 100)) / 100.0 + "€");
				} else if (gemueseEingabe == 7) {
					System.out.print("\t" + paprika + "€ ");
					System.out.print("\t = " + Math.round(setSumme(kg * paprika * 100)) / 100.0 + "€");
				} else if (gemueseEingabe == 8) {
					System.out.print("\t" + rosenkohl + "€ ");
					System.out.print("\t = " + Math.round(setSumme(kg * rosenkohl * 100)) / 100.0 + "€");
				} else if (gemueseEingabe == 9) {
					System.out.print("\t" + spinat + "€ ");
					System.out.print("\t = " + Math.round(setSumme(kg * spinat * 100)) / 100.0 + "€");
				} else if (gemueseEingabe == 10) {
					System.out.print("\t" + tomaten + "€ ");
					System.out.print("\t = " + Math.round(setSumme(kg * tomaten * 100)) / 100.0 + "€");
				}
			}
		}
	}

	public static void getSumme() {
		System.out.println(summe);
	}

	public static double setSumme(double summe) {
		Kassenbon.summe = summe;
		return summe;
	}

	public void berechneSumme() {
		
		
	}
}
