package cursojava.aulas.aula23;

public interface BancoDados extends SqlDCL, SqkDDK, SqlDML{
	
	void abrirConexao();
	void fecharConexao();
}
