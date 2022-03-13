package exercicios.java;

import java.util.Scanner;
import java.util.Locale;

public class ConsumoMedio {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dist�ncia percorrida(km/h): ");
		double distance = sc.nextDouble();
		
		separation();
		
		System.out.print("Total de combust�vel gasto(L): ");
		double totalSpent = sc.nextDouble();
		
		separation();
		
		double totalConsumption = distance / totalSpent;
		
		System.out.printf("O consumo m�dio foi de: %.2f litros", totalConsumption);
		
		sc.close();
		
	}
	
	public static void separation(){
		System.out.println("--------------------------------------------------------");
	}
	

}
