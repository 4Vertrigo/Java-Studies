package cursojava.exercicios.lista12.exercicio3;

public class Teste {

	public static void main(String[] args) {

		Animal camelo = new Animal("Camelo", 150.0, 4, "Amarelo", "Terra", 2.0);
		Animal tubarao = new Peixe ("Tubarao", 300.0, 0, "Cinzento", "Agua", 1.5, "Barbatanas e cauda.");
		Animal urso = new Mamifero("Urso-do-canada", 180, 4, "Vermelho", "Terra", 0.5, "Mel");
		
		System.out.println(camelo.toString());
		System.out.println(tubarao.toString());
		System.out.println(urso.toString());
	}

}
