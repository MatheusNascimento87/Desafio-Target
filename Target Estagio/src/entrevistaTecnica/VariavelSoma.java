package entrevistaTecnica;

public class VariavelSoma {

	public static void main(String[] args) {
		int indice = 13, soma = 0, k = 0;
		while (k < indice) {
			k++;
			soma += k;
		}
		System.out.println("Valor da variável soma = " + soma);
	}
}