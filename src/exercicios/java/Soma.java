package exercicios.java;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Digite o primeiro n�mero: ");
			int firstNumber = sc.nextInt();
			
			System.out.println("--------------------------------------------------");
			
			System.out.print("Digite o segundo n�mero: ");
			int secondNumber = sc.nextInt();
			
			int sum = firstNumber + secondNumber;
			
			System.out.println("--------------------------------------------------");
			
			System.out.println("A soma dos dois n�meros �: " + sum);
			
			sc.close();
	}

}
