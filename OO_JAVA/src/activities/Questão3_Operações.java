package activities;

import java.util.Scanner;

	public class Questão3_Operações {

	public static void main(String[] args) {
	String operacao;
	int num1, num2;
	int result;
	Scanner entrada =  new Scanner(System.in);
	System.out.println("Entre com a operação a ser realizada (+, - ou *):");
	operacao = entrada.nextLine();
	System.out.println("Entre com o primeiro número:");
	num1 = entrada.nextInt();
	System.out.println("Entre com o segundo número:");
	num2 = entrada.nextInt();
	
	
	
	switch(operacao) {
	case "+":
		result = num1 + num2;
		System.out.println("O resultado da operação é: " + result);
		break;
	case "-":
		result = num1 - num2;
		System.out.println("O resultado da operação é: " + result);
		break;
	case "*":
		result = num1 * num2;
		System.out.println("O resultado da operação é: " + result);
		break;
	default:
	    System.out.print("Operação inválida");
	    
	}
  }
}
