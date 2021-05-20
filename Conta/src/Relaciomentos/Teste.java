package Relaciomentos;
public class Teste {
  public static void main(String[] args) {
	Clientes c = new Clientes();
	Conta minhaConta = new Conta();
	minhaConta.titular = c;
      
	minhaConta.titular.imprimeCliente(); //mesmo que c.imprimeCliente();  
	minhaConta.imprimeConta();
 }
 }