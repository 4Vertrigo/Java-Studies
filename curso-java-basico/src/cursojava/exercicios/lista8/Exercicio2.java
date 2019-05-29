package cursojava.exercicios.lista8;

public class Exercicio2 {

	public static void main(String[] args) {

		ContaCorrente conta = new ContaCorrente(1234567, 1600.0, true, 800);
		
		System.out.println("Numero da conta: " + conta.getNumeroConta());
		System.out.println("Eh especial? " + conta.isEspecial());
		System.out.println("Limite: R$" + conta.getLimite());
		System.out.println("Saldo: R$" + conta.getSaldo());
		
		conta.realizaSaque(200);
		conta.depositaDinheiro(1600);
		conta.consultaSaldo();
		conta.verificaEstado();
	}
}
