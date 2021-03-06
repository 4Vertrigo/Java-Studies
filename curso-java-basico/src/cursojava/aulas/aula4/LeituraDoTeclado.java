package cursojava.aulas.aula4;

import java.util.Scanner;

public class LeituraDoTeclado {

	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in); //recebendo o arquivo de entrada
		
		//escaneando a linha interia como uma string
		System.out.print("Digite seu nome completo: ");
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome completo eh: " + nomeCompleto);
		
		//escaneando a string ate o primeiro espaco
		System.out.print("Digite seu primeiro nome: ");
		String primeiroNome = scan.next();
		System.out.println("Seu primeiro nome eh " + primeiroNome);
		
		//escaneando inteiros
		System.out.print("Digite sua idade: ");
		int idade = scan.nextInt();
		System.out.println("Sua idade eh: " + idade);
		
		//escaneando doubles
		System.out.print("Digite sua altura: ");
		double altura = scan.nextDouble();
		System.out.println("Sua altura eh: " + altura);
		
		//escaneando alguns tipos e mostrando na saida
		System.out.println("Digite seu primeiro nome, sua idade, quantidade de filhos, altura e se tem animal de estimacao:");
	    String nome = scan.next();
	    int anos = scan.nextInt();
	    byte qtdFilhos = scan.nextByte();
	    float estatura = scan.nextFloat();
	    boolean temPet = scan.nextBoolean();
	    System.out.println("Voce digitou os seguintes valores: ");
		System.out.println("Seu primeiro nome eh " + nome);
		System.out.println("Sua idade eh: " + anos);
		System.out.println("Voce tem: " + qtdFilhos + " filhos");
		System.out.println("Voce mede: " + estatura + "m");
		System.out.println("Tem bichino de estimacao? " + temPet);
		
		scan.close(); //fecha a stream de leitura
	}
}
