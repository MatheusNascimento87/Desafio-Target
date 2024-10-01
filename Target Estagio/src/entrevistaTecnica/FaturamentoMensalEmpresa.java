package entrevistaTecnica;

public class FaturamentoMensalEmpresa {

	public static void main(String[] args) {
		double faturamentoSP = 67836.43;
		double faturamentoRJ = 36678.66;
		double faturamentoMG = 29229.88;
		double faturamentoES = 27165.48;
		double faturamentoOutros = 19849.53;
		
		double total = faturamentoSP + faturamentoRJ + faturamentoES + faturamentoMG + faturamentoOutros;
		System.out.printf("Valor total mensal da distribuidora: %.2f Reais \n", total);
		
		System.out.printf("O percentual de representação de São paulo é de: %.2f%% \n", percentual(faturamentoSP , total));
		System.out.printf("O percentual de representação do Rio de janeiro é de: %.2f%% \n" , percentual(faturamentoRJ , total) );
		System.out.printf("O percentual de representação de Minas gerais é de: %.2f%% \n" , percentual(faturamentoMG , total) );
		System.out.printf("O percentual de representação do Espirito santo é de: %.2f%% \n" , percentual(faturamentoES , total) );
		System.out.printf("O percentual de representação de outros estados é de: %.2f%% " , percentual(faturamentoOutros , total) );
	}
	public static double percentual(double valor, double total) {
		return (valor*100)/total;
	}
}