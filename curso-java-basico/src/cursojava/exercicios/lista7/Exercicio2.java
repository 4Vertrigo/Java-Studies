package cursojava.exercicios.lista7;

public class Exercicio2 {

	public static void main(String[] args) {

		ContaCorrente conta = new ContaCorrente();
		
		conta.numeroConta = 1234567;
		conta.especial = true;
		conta.limite = 800;
		conta.saldo = 1600;
		
		System.out.println("Numero da conta: " + conta.numeroConta);
		System.out.println("Eh especial? " + conta.especial);
		System.out.println("Limite: R$" + conta.limite);
		System.out.println("Saldo: R$" + conta.saldo);
		
		conta.realizaSaque(200);
		conta.depositaDinheiro(1600);
		conta.consultaSaldo();
		conta.verificaEstado();
	}

}
