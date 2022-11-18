package activities;

import java.util.Scanner;

public class Questão5_Par {
	public static void main(String[] args) {
		int num;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o numero:");
		num = entrada.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
				
	}
}