package fiapModulo1;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		double valor1;
		double valor2;
		double soma, subtracao, divisao, multiplicacao;
				
		System.out.println("Por favor digite o primeiro valor");
		valor1 = leitor.nextDouble();
		
		System.out.println("Por favor digite o segundo valor");
		valor2 = leitor.nextDouble();
		
		soma = valor1 + valor2;
		subtracao = valor1 - valor2;
		divisao = valor1 / valor2;
		multiplicacao = valor1 * valor2;
		
		System.out.println("A soma dos dois valores é " + soma);
		System.out.println("A subtração dos dois valores é " + subtracao);
		System.out.println("A divisão dos dois valores é " + divisao);
		System.out.println("A multiplicaçao dos dois valores é " + multiplicacao);
		
		leitor.close();
		

	}

}
