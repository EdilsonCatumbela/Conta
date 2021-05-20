package VectMatColecoes;
import java.util.ArrayList;
import java.util.Arrays;

public class Cursos{
    
    public static void main(String[] args){
        //ArrayList não tem tamanho pré-definido
        //ArrayList<Objeto> nomeDoArrayList = new ArrayList <Objeto>()
        ArrayList<String> curso = new ArrayList<String> ();
        
        curso.add("ADS"); //curso.add = nome do array + invocacao do metodo add > adicionar/inserir conteudo
        System.out.print("Adicionando o curso de ADS ");
        System.out.println(Arrays.toString(curso.toArray())); //o metodo pega o conteudo e exibe de forma ordenada, insercao de "[]" e "," automaticamente
            
        curso.add("DMD");
        System.out.print("Adicionando o curso de DMD");
        System.out.println(Arrays.toString(curso.toArray()));
            
        curso.add("SI");
        System.out.print("Adicionando o curso de SI ");
        System.out.println(Arrays.toString( curso.toArray() ) );
            
        System.out.print("Qual curso esta na indice 0: ");
        System.out.println(curso.get(0)); //metodo que busca a posicao do indice > primeiro curso inserido
            
        System.out.print("Adicionando descricao em ADS");
        curso.add(curso.indexOf("ADS"), "Analise e Desenvolvimento de Sistemas"); //metodo de alteracao 
        System.out.println(Arrays.toString(curso.toArray()));
            
        System.out.print("Numero de elementos na lista: ");
        System.out.println(curso.size()); //metodo para verificar o tamanho da lista
            
        System.out.print("Removendo o curso de SI ");
        curso.remove("SI"); //metodo de remocao
        System.out.println( Arrays.toString( curso.toArray() ) );
            
        System.out.print("Removendo tudo: ");
        curso.clear(); //metodo para remover itens da lista
        System.out.println(Arrays.toString(curso.toArray()));
    }
}