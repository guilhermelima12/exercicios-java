/*
 Leia dois valores para as vari�veis A e B, e efetuar as trocas dos valores de forma que a vari�vel A passe a 
possuir o valor da vari�vel B e a vari�vel B passe a possuir o valor da vari�vel A.Apresentar os valores 
trocados; 
 */


package exercicios.java;

import java.util.Scanner;

public class TrocaDeValores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor A: ");
		int valorA = sc.nextInt();
		
		System.out.print("Digite o valor B: ");
		int valorB = sc.nextInt();
		
		int valorC = valorA;
		
		valorA = valorB;
		valorB = valorC;
		
		System.out.println("Valor A: " + valorA + " " + "Valor B: " + valorB);
		
		
		sc.close();

	}

}
