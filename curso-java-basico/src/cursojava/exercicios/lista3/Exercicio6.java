package cursojava.exercicios.lista3;

public class Exercicio6 {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 20; i++)
			System.out.println(i);
		
		for(int i = 1; i <= 20; i++)
		{
			System.out.print(i);
			
			if(i != 20)
				System.out.print(" ");
			else
				System.out.print("\n");
		}
	}

}
