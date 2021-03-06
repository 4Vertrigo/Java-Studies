package cursojava.exercicios.lista8;

public class ContaCorrente {
	
	private int numeroConta;
	private double saldo;
	private boolean especial;
	private int limite;
	
	public ContaCorrente() {
		// TODO Auto-generated constructor stub
	}
	
	public ContaCorrente(int numeroConta, double saldo, boolean especial, int limite) {
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		this.especial = especial;
		this.limite = limite;
	}

	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public boolean isEspecial() {
		return especial;
	}
	public void setEspecial(boolean especial) {
		this.especial = especial;
	}
	public int getLimite() {
		return limite;
	}
	public void setLimite(int limite) {
		this.limite = limite;
	}
	
	public void realizaSaque(double valor) {
		
		if(valor > getSaldo())
		{
			System.out.println("Voce nao tem saldo para realizar o saque");
			return;
		}
		
		setSaldo(getSaldo() - valor);
		System.out.println("Voce fez o saque de: R$" + valor + " e seu saldo atual eh: R$" + getSaldo());
	}
	
	public void depositaDinheiro(double valor) {
		setSaldo(getSaldo() + valor);
		System.out.println("Voce fez o deposito de: R$" + valor + " e seu saldo atual eh: R$" + getSaldo());
	}
	
	public void consultaSaldo() {
		System.out.println("Seu saldo eh: R$" + getSaldo());
	}
	
	public void verificaEstado() {
		if(isEspecial())
		{
			System.out.println("O cliente esta no cheque especial");
			return;
		}
		
		System.out.println("O cliente nao esta no cheque especial");
	}

}
