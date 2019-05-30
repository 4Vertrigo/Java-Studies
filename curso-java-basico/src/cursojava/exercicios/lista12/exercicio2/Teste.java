package cursojava.exercicios.lista12.exercicio2;

public class Teste {

	public static void main(String[] args) {

		Contribuente jonas = new PessoaFisica("Jonas Wendel", 3000.0, "11122233344-76");
		Contribuente joao = new PessoaFisica("Joao Victor", 1000.0, "11282239344-76");
		Contribuente vantuil = new PessoaFisica("Vantuil nets", 7000.0, "15122239344-86");
		Contribuente empresa1 = new PessoaJuridica("Empresa 1", 177000.0, "14122239344-86");
		Contribuente empresa2 = new PessoaJuridica("Empresa 2", 1897000.0, "13122239344-86");
		Contribuente empresa3 = new PessoaJuridica("Empresa 3", 4487000.0, "12122239344-86");
		
		jonas.impostoDeRenda();
		joao.impostoDeRenda();
		vantuil.impostoDeRenda();
		empresa1.impostoDeRenda();
		empresa2.impostoDeRenda();
		empresa3.impostoDeRenda();
	}

}
