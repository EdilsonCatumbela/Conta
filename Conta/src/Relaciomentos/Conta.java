package Relaciomentos;
public class Conta {
	int numero=123;
	double saldo=10000.00;
	double limite=1000;
	Clientes titular;   
		
	public void imprimeConta(){
		System.out.println("\nNumero: "+this.numero);
		System.out.println("\nSaldo: "+this.saldo);
		System.out.println("\nLimite: "+this.limite);
		
		//System.out.println("\nLimite: "+this.titular); não se pode imprimir dessa forma

	}
}
