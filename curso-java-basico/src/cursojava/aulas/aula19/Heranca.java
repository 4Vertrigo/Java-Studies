package cursojava.aulas.aula19;

public class Heranca /*extends String isso eh impossivel pq String eh uma classe final*/{ //definindo herancas

	public static void main(String[] args) {
		
		/*Aluno aluno = new Aluno();
		
		Professor professor = new Professor();
		
		//Pessoa pessoa = new Pessoa();
		
		aluno.setCpf("154");
		
		professor.setCpf("15245");

		Pessoa aluno = new Aluno();
		//aluno.getNotas nao esta acessivel
		
		Pessoa professor = new Professor();
		//professor.getSalario(); nao esta acessivel
		
		aluno.setCpf("154");
		professor.setCpf("15245");*/
		
		//Pessoa pessoa = new Pessoa();
		Pessoa aluno = new Aluno();
		Pessoa professor = new Professor();
		
		//pessoa.setEndereco("Rua1, num1");
		aluno.setEndereco("Rua2, num2");
		professor.setEndereco("Rua3, num3");
		
		//polimorfismo
		//System.out.println(pessoa.obterEtiquetaEndereco());
		System.out.println(aluno.obterEtiquetaEndereco());
		System.out.println(professor.obterEtiquetaEndereco());
		
		//polimorfismo abstract
		System.out.println(aluno.irUniversidade());
		System.out.println(professor.irUniversidade());
		
		System.out.println(Constantes.CURSO_COMPLETO);
		//Constantes.CURSO_COMPLETO = "asassas"; atributo final, nao permite esse tipo de operacao nao se pode alterar o valr
	}

}
