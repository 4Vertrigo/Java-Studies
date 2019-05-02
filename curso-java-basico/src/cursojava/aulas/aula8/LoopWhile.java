package cursojava.aulas.aula8;

public class LoopWhile {

	public static void main(String[] args) {
		
		int i = 1;
		int max = 10;
		
		System.out.println("Contando ate " + max);
		
		while(i <= max)
		{
			System.out.println("Valor de i: " + i);
			i++; //i = i + 1; ou i += 1;
		}
		
		System.out.println(i); // valor de 11
		
		do //primeiro executa e depois avalia a expressao
		{
			i++;
			System.out.println("Valor de i: " + i);
		}while (i < 11);

		System.out.println(i);
	}

}
