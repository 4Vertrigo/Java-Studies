package cursojava.aulas.aula22;

public class Teste {
	
	/*Aluno aluno = new Aluno();
	Pessoa pessoaAluno = aluno; //upcasting, tornando uma classe filha, mae (automatico)
	
	Pessoa aluno2 = (Pessoa) new Aluno();
	
	Pessoa aluno3 = new Pessoa();
	Aluno aluno4 = (Aluno) aluno3; //downcasting com erro*/
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		Aluno aluno = new Aluno();
		Professor prof = new Professor();
		
		if(pessoa instanceof Pessoa)
			System.out.println("eh do tipo pessoa");
		
		if(aluno instanceof Aluno)
			System.out.println("eh do tipo aluno");
		
		if(prof instanceof Professor)
			System.out.println("eh do tipo professor");
	}
}
