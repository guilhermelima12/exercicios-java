/* 
 Escreva um algoritmo que leia o nome de um aluno e as notas das três provas que ele obteve no semestre. 
No final informar o nome do aluno e a sua média (aritmética);
 
 */

package exercicios.java;

import java.util.Scanner;

public class MediaAluno {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o nome do aluno: ");
		String name = sc.nextLine();
		
		System.out.print("Digite a primeira nota: ");
		double n1 = sc.nextDouble();
		
		System.out.print("Digite a segunda nota: ");
		double n2 = sc.nextDouble();
		
		System.out.print("Digite a terceira nota: ");
		double n3 = sc.nextDouble();
		
		double media = (n1 + n2 + n3) / 3;
		
		separation();
		
		System.out.println("Nome do aluno: " + name);
		System.out.println("Média: " + media);
		
		
		sc.close();
		
	}
	
	public static void separation() {
		System.out.println("--------------------------------------------------------");
	}

}
