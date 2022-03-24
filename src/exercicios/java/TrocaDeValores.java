/*
 Leia dois valores para as variáveis A e B, e efetuar as trocas dos valores de forma que a variável A passe a 
possuir o valor da variável B e a variável B passe a possuir o valor da variável A.Apresentar os valores 
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
