package agenda;

public interface AgendaTelefonica {
	
	void inserir(String nome,String numero);
	String buscarNumero(String nome);
	void remover(String nome);
	int tamanho();

}
