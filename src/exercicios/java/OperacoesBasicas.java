package exercicios.java;

import java.util.Scanner;

public class OperacoesBasicas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		int firstNumber = sc.nextInt();
		
		System.out.println("--------------------------------------------------");
		
		System.out.print("Digite o segundo número: ");
		int secondNumber = sc.nextInt();
		
		System.out.println("--------------------------------------------------");
		
		int sum = firstNumber + secondNumber;
		
		int subtraction = firstNumber - secondNumber;
		
		double multiplication = firstNumber * secondNumber;
		
		double division = (double)firstNumber / secondNumber;
		
		System.out.println("A soma dos números é : " + sum);
		System.out.println("A subtração dos números é : " + subtraction);
		System.out.println("A multiplicação dos números é : " + multiplication);
		System.out.println("A divisão dos números é : " + division);
		
		sc.close();
	}

}
