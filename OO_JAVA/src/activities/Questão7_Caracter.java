package activities;

import java.util.Scanner;

public class Questão7_Caracter {

	public static void main(String[] args) {
		String caracter;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o caracter a ser verificado:");
		caracter = entrada.nextLine();
		
		if(caracter.matches("[0-9]*")) {
			System.out.println("true");
		}else{
			System.out.println("false");
	
		}
	}
}
