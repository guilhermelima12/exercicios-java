package exercicios.java;

import java.util.Scanner;

public class OperacoesBasicas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro n�mero: ");
		int firstNumber = sc.nextInt();
		
		System.out.println("--------------------------------------------------");
		
		System.out.print("Digite o segundo n�mero: ");
		int secondNumber = sc.nextInt();
		
		System.out.println("--------------------------------------------------");
		
		int sum = firstNumber + secondNumber;
		
		int subtraction = firstNumber - secondNumber;
		
		double multiplication = firstNumber * secondNumber;
		
		double division = (double)firstNumber / secondNumber;
		
		System.out.println("A soma dos n�meros � : " + sum);
		System.out.println("A subtra��o dos n�meros � : " + subtraction);
		System.out.println("A multiplica��o dos n�meros � : " + multiplication);
		System.out.println("A divis�o dos n�meros � : " + division);
		
		sc.close();
	}

}
