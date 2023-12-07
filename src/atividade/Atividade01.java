package atividade;

import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float salario =  100000f;
		float abono = 1000f;
		float novoSalario = 110000; 
		
		
		
		Scanner leia = new Scanner (System.in);
		System.out.println("Digite aqui o seu salário: ");
		String salario1 = leia.nextLine ();
		System.out.println("O seu salário é: " + salario1);
		
		System.out.println("\n");
		
		Scanner leia1 = new Scanner (System.in);
		System.out.println("Digite aqui o seu abono: ");
		String abono1 = leia1.nextLine ();
		System.out.println("O seu abono é: " + abono1);
		
		System.out.println("\n");
		
		System.out.println("Este é seu novo salário: " + salario + abono);
		
		
	}

}
