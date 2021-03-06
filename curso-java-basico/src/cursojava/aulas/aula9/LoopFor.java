package cursojava.aulas.aula9;

import javax.swing.JOptionPane;

public class LoopFor {

	public static void main(String[] args) {

		
		for(int i = 0; i < 5; i++)
			System.out.println("i tem valor: " + i);
		
		//System.out.println(i); //erro de escopo de variavel 
		
		for(int i = 5; i >= 0; i--)
			System.out.println("i tem valor: " + i);
		
		for(int i = 0, j = 10; i < j; i++, j--)
			System.out.println("i = " + i + "; j = " + j);
		
		int count = 0;
		
		for( ; count < 10; ) //podem haver partes faltando
		{
			System.out.println("valor de count: " + count);
			count += 2;
		}
		
		//for(int count; count < 100; count++); erro de dupla variavel
		
		for(int cont = 0; cont < 10; cont += 2)
			System.out.println("valor de cont: " + cont);
		
		//for(;;); //loop infinito
		
		int soma = 0;
		for(int i = 1; i < 5; soma += i++); //loop sem corpo
		
		System.out.println("Valor da soma eh " + soma);
		
		JOptionPane.showMessageDialog(null, "Valor da soma eh " + soma); //Olhe que legal!!!
	}

}
