package cursojava.exercicios.lista6;

public class Exercicio6 {

	public static void main(String[] args) {

		ContatoAgenda contato1 = new ContatoAgenda();
		
		contato1.nome = "Jonas Wendel";
		contato1.endereco = "Rua Sao Jose";
		contato1.email = "jonas_wendel@usp.br";
		contato1.telefones = new String[2];
		contato1.telefones[0] = "1234-56789";
		contato1.telefones[1] = "54321-6789";
		
		System.out.println("Nome: " + contato1.nome);
		System.out.println("Endereco: " + contato1.endereco);
		System.out.println("Email: " + contato1.email);
		System.out.println("Telefones: " + contato1.telefones[0] + " " + contato1.telefones[1]);
	}

}