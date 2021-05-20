package VectMatColecoes;
import javax.swing.JOptionPane;
import java.util.ArrayList;
public class Alunos{
	public static void main(String[] args){
        ArrayList<String> aluno = new ArrayList<String>();		
		String nome, str="";
		int resp, tamanho,i;			
		resp = Integer.parseInt(JOptionPane.showInputDialog("Deseja adicionar um aluno? [1] Sim: "));
		while(resp==1){
			nome = JOptionPane.showInputDialog("Informe o nome do aluno: ");
			aluno.add(nome);				
			resp=Integer.parseInt(JOptionPane.showInputDialog("Deseja adicionar mais alunos?[1]Sim: "));
		}
		tamanho=aluno.size();
		if(tamanho>0){
			i=0;
			while(i<tamanho){
				str = str + "\n"+ aluno.get(i);
				i++; }
			JOptionPane.showMessageDialog(null, str,"Alunos cadastrados", JOptionPane.PLAIN_MESSAGE);
		}else{
			JOptionPane.showMessageDialog(null, "Nenhum aluno na lista" + str , 
				"Alunos cadastrados", JOptionPane.PLAIN_MESSAGE);
		}
		System.exit(0);	}}
		
		
		
		
		