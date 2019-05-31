package cursojava.exercicios.lista13;

public class Lista13 {
	
	public static void main(String[] args) {
		
		FiguraGeometrica[] figuras = new FiguraGeometrica[6];
		
		figuras[0] = new Quadrado(5.0, "Quadrado", "Preto"); 
		figuras[1] = new Triangulo(5.0, 5.0, "Triangulo", "Preto");
		figuras[2] = new Circulo(5.0, "Circulo", "Preto");
		figuras[3] = new Cubo(5.0, "Cubo", "Preto");
		figuras[4] = new Cilindro(5.0, 5.0, "Cilindro", "Preto");
		figuras[5] = new Piramide(5.0, 5.0, 5.0, (Figura2D) figuras[0], 5, "Piramide", "Preto");
		
		Figura2D aux2D;
		Figura3D aux3D;
		
		for(FiguraGeometrica figura : figuras)
		{
			if(figura instanceof Figura2D)
			{
				aux2D = (Figura2D) figura; //downcasting
				
				System.out.println(aux2D.getNome());
				System.out.println("Area : " + aux2D.calcularArea());
			}
			else if(figura instanceof Figura3D)
			{
				aux3D = (Figura3D) figura;
				System.out.println(aux3D.getNome());
				System.out.println("Area: " + aux3D.calcularArea());
				System.out.println("Volume: "+ aux3D.calcularVolume());
			}
			
			System.out.println("---------------------------------------");
		}
		
	}

}
