package activities;

import java.util.Scanner;

		public class Questão4_Soma {
		
		public static void main(String[] args) {
		int num, soma = 0;
		Scanner entrada = new Scanner(System.in);
		
		do {
			System.out.println("Digite um numero positivo para ser somado ou negativo para sair:");
			num = entrada.nextInt();
			if(num >= 0)
				soma += num;
		}while(num >= 0);
			System.out.println("A soma é: "+ soma);
	}
}
