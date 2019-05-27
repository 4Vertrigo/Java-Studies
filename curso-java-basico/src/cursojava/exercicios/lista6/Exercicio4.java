package cursojava.exercicios.lista6;

import java.util.Date;

public class Exercicio4 {

	public static void main(String[] args) {
		
		LivroBiblioteca mpbc = new LivroBiblioteca();
		
		mpbc.titulo = "Memorias postumas de Brás Cubas";
		mpbc.autor = "Machado de Assis";
		mpbc.tema = "Leitura experimentral";
		mpbc.anoLancamento = 1881;
		mpbc.numPaginas = 251;
		mpbc.emprestado = true;
		mpbc.pessoaEmprestimo = "Jonas Wendel";
		mpbc.dataEntrega = new Date();
		
		System.out.println(mpbc.titulo + " " + mpbc.autor + "\n" + mpbc.tema + "\n" + mpbc.anoLancamento + "\n" + mpbc.numPaginas + "\n");
	}

}
