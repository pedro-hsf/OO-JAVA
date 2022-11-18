package activities;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Questão6_MaiorNum {

	public static void main(String[] args) {
		int num1, num2, num3, num4, num5;
		Scanner in = new Scanner (System.in);
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		System.out.println("Entre com o primeiro numero:");
		num1 = in.nextInt();
		nums.add(num1);
		System.out.println("Entre com o segundo numero:");
		num2 = in.nextInt();
		nums.add(num2);
		System.out.println("Entre com o terceiro numero:");
		num3 = in.nextInt();
		nums.add(num3);
		System.out.println("Entre com o quarto numero:");
		num4 = in.nextInt();
		nums.add(num4);
		System.out.println("Entre com o quinto numero:");
		num5 = in.nextInt();
		nums.add(num5);
		
		int max = (int) Collections.max(nums);
		System.out.println(max);
		
		
	}
}