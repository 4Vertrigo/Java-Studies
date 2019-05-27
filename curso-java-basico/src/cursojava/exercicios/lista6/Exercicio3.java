package cursojava.exercicios.lista6;

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		LivroLivraria mpbc = new LivroLivraria();
		
		mpbc.titulo = "Memorias postumas de Brás Cubas";
		mpbc.autor = "Machado de Assis";
		mpbc.tema = "Leitura experimentral";
		mpbc.anoLancamento = 1881;
		mpbc.numPaginas = 251;
		mpbc.preco = 150.99;
		
		System.out.println(mpbc.titulo + " " + mpbc.autor + "\n" + mpbc.tema + "\n" + mpbc.anoLancamento + "\n" + mpbc.numPaginas + "\n" + mpbc.preco);
	}

}
