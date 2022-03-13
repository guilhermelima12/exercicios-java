package exercicios.java;

import java.util.Locale;
import java.util.Scanner;

public class SalarioFuncionario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome do vendedor: ");
		String name = sc.nextLine();
		
		separation();
		
		System.out.print("Salário do vendedor: R$");
		double salary = sc.nextDouble();
		
		separation();
		
		System.out.print("Vendas efetuadas no mês (dinheiro): R$");
		double sales = sc.nextDouble();
		
		double percent = 15;
		
		double totalSalary = salary + (sales * (percent / 100));
		
		separation();
		
		System.out.println("Nome: " + name);
		System.out.printf("Salário Fixo: R$%.2f%n", salary);
		System.out.printf("Salário final no mês: R$%.2f", totalSalary);		
		
		sc.close();
	}
	
	public static void separation(){
		System.out.println("--------------------------------------------------------");
	}

}
