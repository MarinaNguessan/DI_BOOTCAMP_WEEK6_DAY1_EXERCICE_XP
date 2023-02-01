package atos;

import java.util.Scanner;

public class Exercice2 {

	public static void main(String[] args) {
		
		/* Declaration des variables*/
		int decalageHoraire = 0;
		int heureDestinationNuit = 0;
		int heureDestinationJournee = 0;
		
		/* Saisir et recuperation des heures*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Veuillez entrer le décallage horaire entre votre domicile et votre destination." +
                "\n(Entrez une valeur négative si la destination est en retard sur le domicile)");
		decalageHoraire = scanner.nextInt();
		
		 heureDestinationNuit = decalageHoraire < 0 ? 24 + decalageHoraire : decalageHoraire;
	     heureDestinationJournee = 12 + decalageHoraire;

		System.out.println("Il sera " + heureDestinationJournee + "H à la destination lorsqu'il sera 12h au domicile " +
                "et il sera " + heureDestinationNuit + "H à la destination lorsqu'il sera 00H au domicile");

	}

}
