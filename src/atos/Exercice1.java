package atos;

import java.util.Scanner;

public class Exercice1 {

	public static void main(String[] args) {
	/*Declaration des variables*/
		int angle1 = 0;
		int angle2 = 0;
		int angle3 = 0;
		int sum = 0;
		
	/*saisir des nombres*/
		
	Scanner scanner = new Scanner(System.in);
	System.out.printf("Veuillez saisir le premier nombre svp !");
	angle1 = scanner.nextInt();
	
		
	System.out.printf("Veuillez saisir le deuxième nombre svp !");
	angle2 = scanner.nextInt();
	
	
	System.out.printf("Veuillez saisir le troisième nombre svp !");
	angle3 = scanner.nextInt();
	
	// Calcul de la somme des angles	
	
	sum = angle1 + angle2 + angle3 ;
	
	if(sum == 180) {
	   System.out.printf("C'est un triangle valide !");
		
	}
	else {
		System.out.printf("Ce n'est pas untriangle valide");
	}

	}

}
