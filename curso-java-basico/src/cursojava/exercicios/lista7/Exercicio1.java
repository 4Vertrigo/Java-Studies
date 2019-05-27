package cursojava.exercicios.lista7;

public class Exercicio1 {
	
	public static void main(String[] args) {
		Lampada led = new Lampada();
		
		led.altura = 20.1;
		led.largura = 10;
		led.marca = "Empalux";
		led.angulo = 220;
		led.corLuz = "Branca";
		led.formato = "A100";
		led.garantia = 12;
		led.indiceProtecao = 20;
		led.material = "Policarbonato";
		led.potencia = 500;
		led.temperaturaCor = 6500;
		led.tensaoEletrica = "Bivolt";
		led.tipoSoquete = "E40";
		led.vidaUtil = 25000;
		led.estado = false;
		
		System.out.println(led.marca + " " +led.corLuz);
		
		if(led.estado)
			System.out.println("A lampada esta ligada");
		else
			System.out.println("A lampada esta desligada");
		
		led.estado = true;
		
		if(led.estado)
			System.out.println("A lampada esta ligada");
		else
			System.out.println("A lampada esta desligada");
		
		
	}
}
