package cursojava.aulas.aula24;

public class CriandoExecao {
	
	public static void main(String[] args) {
		
		int[] demon = {2, 0, 4, 8, 0};
		int[] numeros = {4, 8, 16, 3, 32, 64, 128};
		
		for(int i = 0; i < numeros.length; i++)
		{
			try 
			{
				if(numeros[i] % 2 != 0)
					throw new DivisaoNaoExata(numeros[i], demon[i]); //criando a propria excecao
				
				System.out.println(numeros[i] + "/" + demon[i] + " = " + (numeros[i]/demon[i]));
			}
			catch(ArithmeticException | ArrayIndexOutOfBoundsException | DivisaoNaoExata exception)
			{
				System.out.println("Ocorreu um erro");
				exception.printStackTrace();
			}
		}
	}
}

