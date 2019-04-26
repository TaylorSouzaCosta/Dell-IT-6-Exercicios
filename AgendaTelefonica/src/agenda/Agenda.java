package agenda;

import java.util.Map;

public class Agenda implements AgendaTelefonica {
	
	private Map<String,String> agendaDeTelefone;
	
	public void inserir(String nome, String numero){
		
		agendaDeTelefone.put(nome,numero);
		
	}
	
	public String buscarNumero (String nome) {
		return agendaDeTelefone.get(nome);
	}
	
	public void remover (String nome) {
		agendaDeTelefone.remove(nome);
	}

	public int tamanho() {
		return agendaDeTelefone.size();
		
	}
}
