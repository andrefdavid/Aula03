import java.util.Scanner;

public class OperadorOu {

	public static void main(String[] args) {
		/*Faça um programa que receba o total de compras de um usuário e um cupom. Se o total de compas exceder 1000 ou se o cupom for igual a DESCONTO20, aplicar um desconto de 20% na compra*/
		Scanner leitor = new Scanner(System.in);
		Double totalCompra, valorFinal=0.0;
		String cupom;
		System.out.println("SISTEMA DE DESCONTOS");
		System.out.println("Por favor, digite o valor total da compra");
		totalCompra = leitor.nextDouble();
		System.out.println("Por favor, digite o seu cupom");
		cupom = leitor.next();
		
		//Aqui é preciso criar um if que verifique as duas condições para que o desconto seja ou não aplicado
		
		System.out.println("O valor final é de R$" + valorFinal);

	}

}
