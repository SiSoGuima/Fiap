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
		
		System.out.println("A soma dos dois valores � " + soma);
		System.out.println("A subtra��o dos dois valores � " + subtracao);
		System.out.println("A divis�o dos dois valores � " + divisao);
		System.out.println("A multiplica�ao dos dois valores � " + multiplicacao);
		
		leitor.close();
		

	}

}
