package entrevistaTecnica;

import java.util.Scanner;

public class InverterString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe a String que deseja inverter: ");
		String input = scan.nextLine();

		char[] vetor = input.toCharArray();

		for (int i = vetor.length - 1; i >= 0; i--) {
			System.out.print(vetor[i]);
		}
		scan.close();
	}
}
