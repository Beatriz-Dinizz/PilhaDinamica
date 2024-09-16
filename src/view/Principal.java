package view;

import java.util.Scanner;
import controller.FatController;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num = -1;
		
		while (num < 0 || num > 10) {
			System.out.print("Insira um número inteiro entre 0 e 10: ");
			
			num = scanner.nextInt();
		}
		
		FatController fatController = new FatController();
		int fatorial = fatController.fatorial(num);
		
		System.out.println("O fatorial do número " + num + " é: " + fatorial);
		
		scanner.close();
	}
}
