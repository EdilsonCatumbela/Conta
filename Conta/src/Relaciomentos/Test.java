package Relaciomentos;
public class Test {
    public static void main (String[] args) {
        Client c = new Client ();
        Cont minhaConta = new Cont();

        minhaConta.setClient(c);

        System.out.println("Referencia do objeto na memória: "+minhaConta.getClient());

        //pode-se acessar os métodos da classe cliente
        System.out.println("Titular: "+minhaConta.getClient() .getNome());

        c.imprimeCliente();
        minhaConta.imprimeConta();
    }
}