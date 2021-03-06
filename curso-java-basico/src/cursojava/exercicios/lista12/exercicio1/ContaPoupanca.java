package cursojava.exercicios.lista12.exercicio1;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria{
	
	private int diaRendimento;
	
	public ContaPoupanca() {
		super();
	}
	
	public ContaPoupanca(String nomeCliente, int numConta, double saldo, int diaRendimento) {
		super(nomeCliente, numConta, saldo);
		this.diaRendimento = diaRendimento;
	}

	public int getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}
	
	@Override
	public String toString() {
		
		String s = "[ContaPoupanca]\nDia do rendimento: " + diaRendimento + "\n";
		s += super.toString();
		
		return s;
	}

	public void calcularNovoSaldo(double taxaRendimento) {
		
		Calendar hoje = Calendar.getInstance(); //obtem a data de hoje
		
		if(diaRendimento == hoje.get(Calendar.DAY_OF_MONTH))
		{
			super.setSaldo(super.getSaldo() + (super.getSaldo() * taxaRendimento));
			System.out.println("Seu novo saldo, a partir de um rendimento, eh de: " + super.getSaldo());
			return;
		}
		
		System.out.println("Hoje nao eh dia de rendimento");
	}

}
