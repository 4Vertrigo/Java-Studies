package cursojava.exercicios.lista12.exercicio1;

public class ContaEspecial extends ContaBancaria{
	
	private double limite;
	
	public ContaEspecial() {
		super();
	}
	
	public ContaEspecial(String nomeCliente, int numConta, double saldo, double limite) {
		super(nomeCliente, numConta, saldo);
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public String toString() {
		
		String s = "[ContaEspecial]\nLimite: R$" + limite + "\n";
		s += super.toString();
		
		return s;
	}
	
	public void sacar(double quantia) {
		
		double saldoComLimite = super.getSaldo() + getLimite();
		
		if(quantia > saldoComLimite)
		{
			System.out.println("Voce nao tem limite para efetuar esse saque");
			return;
		}
		
		super.setSaldo(super.getSaldo() - quantia);
		System.out.println("Seu novo saldo eh de: R$" + getSaldo());
	}
	
	
	

}
