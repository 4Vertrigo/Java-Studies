package cursojava.exercicios.lista7;

public class Lampada {
	
	String tensaoEletrica;
	String tipoSoquete;
	String material;
	String corLuz;
	String formato;
	String marca;
	double altura; //em centimetros
	double largura; //em centimetros
	double vidaUtil; //em horas
	int angulo;
	int indiceProtecao;
	int potencia; //em Watts
	int temperaturaCor; //em Kelvin
	byte garantia; //em meses
	boolean estado;
	
	void ligaLampada() {
		estado = true;
	}
	
	void desligaLampada() {
		estado = false;
	}
}
