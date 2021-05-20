package Relaciomentos;
public class Cont {
	private int numero=123;
	private double saldo=10000.00;
	private double limite=1000;
	private Client titular;   

	//construtores
	public Cont (){
		numero=123;
		saldo=10000.00;
		limite=1000;
	}

	//getters e setters
	public int getNumero(){
		return numero;
	}
	public void setNumero(int n){
		numero = n;
	}
	public double getSaldo(){
		return saldo;
	}
	public void setSaldo(double s){
		saldo = s;
	}
	public double getlimite(){
		return limite;
	}
	public void setCpf (double l){
		limite = l;
	}
	public Client getClient(){
		return this.titular;
	}
	public void setClient(Client cli){
		/*irá receber a referencia de um objeto curso*/
		this.titular=cli;
	}

	//metodos workers
	public void imprimeConta(){
		System.out.println("Numero: "+this.numero);
		System.out.println("Saldo: "+this.saldo);
		System.out.println("Limite: "+this.limite);
	}
}
