package Relaciomentos;
public class Client {
	private String nome;
 	private String sobrenome;
 	private String cpf;
	private String endereco;

	//construtores
	public Client() {
		nome="Sandra";
 		sobrenome="Geroldo";
 		cpf="123.456.789-10";
		endereco="AAAA";
	}

	//getters e setters
	public String getNome(){
		return nome;
	}
	public void setNome(String n){
		nome = n;
	}
	public String getSobrenome(){
		return nome;
	}
	public void setSobrenome(String snome){
		sobrenome = snome;
	}
	public String getCpf(){
		return cpf;
	}
	public void setCpf (String c){
		cpf = c;
	}
	public String getEndereco(){
		return endereco;
	}
	public void setEndereco (String e){
		endereco = e;
	}
		
	//metodos workers
	public void imprimeCliente(){

		System.out.println("Nome: "+this.nome);
		System.out.println("Sobrenome: "+this.sobrenome);
		System.out.println("CPF: "+this.cpf);
		System.out.println("Endereço: "+this.endereco);	
	}
}
