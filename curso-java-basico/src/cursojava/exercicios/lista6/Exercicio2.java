package cursojava.exercicios.lista6;

public class Exercicio2 {

	public static void main(String[] args) {

		Livro mpbc = new Livro();
		
		mpbc.titulo = "Memorias postumas de Brás Cubas";
		mpbc.autor = "Machado de Assis";
		mpbc.tema = "Leitura experimentral";
		mpbc.anoLancamento = 1881;
		mpbc.numPaginas = 251;
		
		System.out.println(mpbc.titulo + " " + mpbc.autor + "\n" + mpbc.tema + "\n" + mpbc.anoLancamento + "\n" + mpbc.numPaginas);
	}

}
