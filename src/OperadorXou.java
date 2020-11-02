import java.util.Scanner;

public class OperadorXou {

	public static void main(String[] args) {
		/*Em uma ONG há uma horta monitorada e automatizada por um arduino.
		 * Escreva o código de um programa que receba a umidade relativa do ar e a temperatura atual. Caso a umidade seja maior que 70% ou caso o temperatura seja maior que 26°C, exibir a mensagem "ligando os ventiladores". Caso as duas condições sejam verdadeiras ou falsas, exibir a mensagem: "Entrar em contato com agrônomo".*/
		Scanner leitor =  new Scanner(System.in);
		Double umidade, temperatura;
		System.out.println("Por favor, insira a umidade relativa do ar:");
		umidade = leitor.nextDouble();
		System.out.println("Por favor, insira a temperatura em graus celsius: ");
		temperatura = leitor.nextDouble();
		
		//Aqui é preciso criar um if que verifique as duas condições para que o os ventiladores sejam ligados ou não
		
		leitor.close();
		

	}

}
