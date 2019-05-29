package cursojava.exercicios.lista8;

public class Exercicio1 {

	public static void main(String[] args) {

		Lampada led = new Lampada("Bivolt", "E40", "Policarbonato", "Branca", "A100", "Empalux", 20.1, 10.0, 25000.0, 220, 20, 500, 6500, 12, false);
		
		led.mostraEstado();
		
		led.mudaEstado();
		
		led.mostraEstado();
		
		led.mudaEstado();
		
		led.mostraEstado();
	}

}
