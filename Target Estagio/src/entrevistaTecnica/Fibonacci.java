package entrevistaTecnica;

import java.util.Scanner;

public class Fibonacci {
	public static int fibonacci(int n) {
		if (n == 0 || n == 1) {
			return n;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}

	public static boolean checarFibonacci(int num) {
		int index = 0;
		int fib;
		while (true) {
			fib = fibonacci(index);
			if (fib == num) {
				return true;
			} else if (fib > num) {
				return false;
			}
			index++;
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean flag = false;
		int num = 0;
		while (!flag) {
			try {
				System.out.println("Informe o número que deseja checar se contém na sequência de fibonacci: ");
				num = scan.nextInt();
				fibonacci(num);
				if (checarFibonacci(num)) {
					System.out.println(num + " Pertence a sequência de Fibonacci");
				} else {
					System.out.println(num + " Não pertence a sequência de Fibonacci");
				}
				flag = true;
			} catch (Exception e) {
				System.out.println("Valor inválido, a sequência de fibonacci só aceita números inteiros, tente novamente");
				scan.next();
			}
		}
		scan.close();
	}
}
