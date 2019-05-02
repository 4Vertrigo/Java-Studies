package cursojava.aulas.aula6;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com sua idade");
		int idade = scan.nextInt();
		
		//blocos condicionais
		if(idade >= 18){
			System.out.println("Eh maior de idade");
		}
		else
			System.out.println("Eh menor de idade");
		
		System.out.println("Entre com o preco do item");
		double valor = scan.nextDouble();
		
		if(valor <= 10)
			System.out.println("Esta barato, pode compar");
		else if (valor < 15) //aqui valor eh > 10 ja
			System.out.println("Voce pode pedir um desconto");
		else if(valor >= 15 && valor < 17) //so entrara no bloco caso as duas condicoes sejam verdadeiras
			System.out.println("Voce pode pesquisar mais");
		else //qualquer valor > que 17 entrara nesse laco
			System.out.println("Muito caro");
		
		scan.close();
	}
	
}
