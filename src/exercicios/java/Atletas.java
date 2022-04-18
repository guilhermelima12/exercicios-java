package exercicios.java;

import java.util.Locale;
import java.util.Scanner;

public class Atletas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int contador = 1;
		int homens = 0;
		int mulheres = 0;
		
		double peso;
		double pesoTotal = 0;
		double comparador = 0.0;
		double pesoMedio = 0;
		double porcentagem = 0;
		double contadorAltura = 0;
		double alturaMedia;
		String nomeMaisAlto = "";
		
		System.out.print("Qual a quantidade de atletas?");
		int numeroDeAtletas = sc.nextInt();
		
		while (contador <= numeroDeAtletas) {
			System.out.println("Digite os dados do atleta numero: " + contador);
			System.out.print("Nome: ");
			String nome = sc.next();
			
			System.out.print("Sexo (M / F): ");
			char sexo = sc.next().charAt(0);
			
			while (sexo != 'F' && sexo != 'M') {
				System.out.print("Valor inválido! Favor digite F ou M: ");
				sexo = sc.next().charAt(0);
			}
			
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			
			while (altura <= 0) {
				System.out.print("Valor inválido! Digitar um valor positivo: ");
				altura = sc.nextDouble();
			}
			
			if (sexo == 'F') {
				mulheres += 1;
				contadorAltura += altura;
			}
			
			if (sexo == 'M') {
				homens += 1;
			}
			
			if (altura > comparador) {
				comparador = altura;
				nomeMaisAlto = nome;
			}
			
			System.out.print("peso: ");
			peso = sc.nextDouble();
			
			while (peso <= 0) {
				System.out.print("Valor inválido! Favor digitar um valor positivo: ");
				peso = sc.nextDouble();
			}
			
			pesoTotal += peso;
			contador += 1;
			System.out.println("");
		}
		
		pesoMedio = pesoTotal / numeroDeAtletas;
		porcentagem = ((double) homens / (homens + mulheres)) * 100.0;
		alturaMedia = contadorAltura / mulheres;
		
		System.out.println("");
		
		System.out.println("RELATÓRIO");
		System.out.printf("Peso médio dos atletas: %.2f%n", pesoMedio);
		System.out.printf("Atleta mais alto: %s ", nomeMaisAlto);
		System.out.printf("Porcentagem dos homens: %.1f %%%n", porcentagem);
		System.out.printf("Altura média das mulheres: %.2f", alturaMedia);
		sc.close();
		
	}

}
