package exercicios.java;

import java.util.Scanner;

public class ConsumoMedio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Distância percorrida(km/h): ");
		double distance = sc.nextDouble();
		
		separation();
		
		System.out.print("Total de combustível gasto(L): ");
		double totalSpent = sc.nextDouble();
		
		separation();
		
		double totalConsumption = distance / totalSpent;
		
		System.out.printf("O consumo médio foi de: %.2f litros", totalConsumption);
		
		sc.close();
		
	}
	
	public static void separation(){
		System.out.println("--------------------------------------------------------");
	}
	

}
