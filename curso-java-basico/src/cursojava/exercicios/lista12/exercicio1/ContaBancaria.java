package cursojava.exercicios.lista12.exercicio1;

public class ContaBancaria {
	
	private String nomeCliente;
	private int numConta;
	private double saldo;
	
	public ContaBancaria() {
		// TODO Auto-generated constructor stub
	}

	public ContaBancaria(String nomeCliente, int numConta, double saldo) {
		this.nomeCliente = nomeCliente;
		this.numConta = numConta;
		this.saldo = saldo;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	@Override
	public String toString() {
		return "[ContaBancaria]\nNome do cliente: " + nomeCliente + "\nNumero da Conta: " + numConta + "\nSaldo: R$" + saldo;
	}

	public void sacar(double quantia) {
		
		double novoSaldo = getSaldo() - quantia;
		
		if(novoSaldo < 0)
		{
			System.out.println("Voce nao possui saldo para a transacao");
			return;
		}
		
		setSaldo(novoSaldo);
		System.out.println("Seu novo saldo eh de: R$" + getSaldo());
	}
	
	public void depositar(double quantia) {
		
		double novoSaldo = getSaldo() + quantia;
		
		setSaldo(novoSaldo);
		System.out.println("Seu novo saldo eh de R$" + getSaldo());
	}
	
	
	

}
