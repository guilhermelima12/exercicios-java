package exercicios.java;

import java.util.Locale;
import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o primeiro n?mero: ");
		int firstNumber = sc.nextInt();

		separation();

		System.out.print("Digite o segundo n?mero: ");
		int secondNumber = sc.nextInt();

		int sum = firstNumber + secondNumber;

		separation();

		System.out.println("A soma dos dois n?meros ?: " + sum);

		sc.close();
	}

	public static void separation() {
		System.out.println("--------------------------------------------------------");
	}

}
