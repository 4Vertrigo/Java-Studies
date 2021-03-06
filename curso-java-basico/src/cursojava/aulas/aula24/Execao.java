package cursojava.aulas.aula24;

public class Execao {

	public static void main(String[] args) {

		try 
		{
			int[] vetor = new int[4];
			
			System.out.println("Antes da exception");
			
			vetor[4] = 1;
			
			System.out.println("Esse texto nao sera impresso");
		} 
		
		catch (ArrayIndexOutOfBoundsException exception) 
		{
			System.out.println("Excecao ao acessar um indice do vetor que nao existe");
		}
		
		System.out.println("Esse texto sera impresso");
		
		int[] aux = null;
		
		try 
		{
			System.out.println(aux[0]);
		}
		/*catch(Throwable exception) //mae de todas as excecoes... Nao a use
		{
			System.out.println("Ocorreu um erro");
		}*/
		catch(Exception e) 
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		finally
		{
			System.out.println("O finally eh sempre executado apos o try"); //coisas que acontecen independete do erro
		}
		
		int[] demon = {2, 0, 4, 8, 0};
		int[] numeros = {4, 8, 16, 3, 32, 64, 128};
		
		for(int i = 0; i < numeros.length; i++)
		{
			/*try 
			{
				System.out.println(numeros[i] + "/" + demon[i] + " = " + (numeros[i]/demon[i]));
			}
			catch(ArithmeticException exception)
			{
				System.out.println("Erro, divisao por 0");
			}
			catch(ArrayIndexOutOfBoundsException exception)
			{
				System.out.println("Posicao do array invalida");
			}
			finally
			{
				System.out.println("O finally eh sempre executado apos o try");
			}*/
			
			//ou
			
			try 
			{
				System.out.println(numeros[i] + "/" + demon[i] + " = " + (numeros[i]/demon[i]));
			}
			catch(ArithmeticException | ArrayIndexOutOfBoundsException exception)
			{
				System.out.println("Ocorreu um erro");
				exception.printStackTrace();
			}
			finally
			{
				System.out.println("O finally eh sempre executado apos o try");
			}
				
		}
	}

}
