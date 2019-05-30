package cursojava.exercicios.lista12.exercicio2;

public class PessoaFisica extends Contribuente{
	
	private String cpf;

	public PessoaFisica() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PessoaFisica(String nome, double rendaBruta, String cpf) {
		super(nome, rendaBruta);
		this.cpf = cpf;
		// TODO Auto-generated constructor stub
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void impostoDeRenda() {
		
		double imposto = super.getRendaBruta();
		
		if(super.getRendaBruta() >= 0 && super.getRendaBruta() <= 1400)
		{
			imposto *= 0;
			System.out.println("Sem imposto");
		}
		else if(super.getRendaBruta() <= 2100)
		{
			imposto *= 0.1;
			imposto -= 100;
			System.out.println("10% de imposto");
		}
		else if(super.getRendaBruta() <= 2800)
		{
			imposto *= 0.15;
			imposto -= 270;
			System.out.println("15% de imposto");
		}
		else if(super.getRendaBruta() <= 3600)
		{
			imposto *= 0.25;
			imposto -= 500;
			System.out.println("25% de imposto");
		}
		else
		{
			imposto *= 0.3;
			imposto -= 700;
			System.out.println("30% de imposto");
		}
		
		System.out.println("O imposto a ser pago eh de: " + imposto);
	}
}
