package cursojava.exercicios.lista9;

public class Contador {
	
	private static int contador;
	
	Contador(){
		contador++;
	}
	
	public static void incrementar() {
		contador++;
	}
	
	public static void zerar() {
		contador = 0;
	}
	
	public static int retorna() {
		return contador;
	}
	

}
