package cursojava.exercicios.lista3;

import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double precoProduto;
		double precoFinal;
		double pagamento;
		int i;
		
		System.out.println("Lojas Tabajara");
		while(true)
		{
			precoFinal = 0;
			i = 1;
			
			do
			{
				System.out.print("Produto "+ i +": R$ ");
				precoProduto = scan.nextDouble();
				precoFinal += precoProduto;
				i++;
			}while(precoProduto != 0);
			
			System.out.println("Total: R$ " + precoFinal);
			
			System.out.print("Dinheiro: R$ ");
			pagamento = scan.nextDouble();
			pagamento = pagamento - precoFinal;
			
			System.out.println("Troco: R$ " + pagamento + "\n");
			
		}
		
	}

}
