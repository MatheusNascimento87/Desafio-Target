package entrevistaTecnica;

import java.util.Scanner;

public class InverterString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe a String que deseja inverter: ");
		String input = scan.nextLine();
		//transformando o input em um vetor de caracteres
		char[] vetor = input.toCharArray();
		//iterando o novo vetor de trás para frente para inverter a String
		for (int i = vetor.length - 1; i >= 0; i--) {
			System.out.print(vetor[i]);
		}
		scan.close();
	}
}
