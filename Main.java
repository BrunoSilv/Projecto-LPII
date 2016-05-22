/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ufp.inf.lp2.projecto;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.RedBlackBST;
import edu.princeton.cs.algs4.StdOut;
import java.util.ArrayList;
/**
 *
 * @author bluis
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // BST Passageiros
        RedBlackBST<String, Passageiro> passageiroST = new RedBlackBST<>();
        
        //Load de passageiros
        loadFromFilePassageirosST(passageiroST, ".//data//passageiros.txt");  
        Linha novalinha;
        Paragem novaparagem;
        
        In in = new In(".//data//ligacoes.txt");
        novalinha = new Linha();
        novalinha.loadParagem(".//data//paragem.txt");
        Rede G = new Rede (in);
        for(DirectedEdgelp e: G.edges()){
            
            StdOut.print(novalinha.addParagem(e.from()) + " : " + novalinha.addParagem(e.to()) + "\n");
           
        }
        
        
        
        
        
       
         
    }
    
    
    public static Linha criarLinha(String nome)
    {
       Linha novalinha = new Linha(nome);// é criado um novo objecto do tipo Linha
        if(validarLinha(nome, novalinha) == true){
            StdOut.print("Linha ja existe");
        }else
        {
          novalinha.setLinhas(nome);
        }
        return novalinha;
    }
    
    public static boolean validarLinha(String nome, Linha novalinha)
    {
        boolean acabou = false;
        
        for(int i =0; i<novalinha.getLinhas().size() && !acabou; i++)
           if(novalinha.getLinhas().get(i).equals(nome))
           {
               acabou = true;
               break;
           }
        return acabou;
    }
 
    
     public static void loadFromFilePassageirosST(RedBlackBST<String, Passageiro> passageiroST, String path) {
        In in = new In(path); // abertura do ficheiro/stream de entrada
        while (!in.isEmpty()) {
            String[] texto = in.readLine().split(";");
            String id = texto[0];
            String nome = texto[1];
            int idade = Integer.parseInt(texto[2]);
            Float saldo = Float.parseFloat(texto[3]);

            Passageiro p = new Passageiro(id, nome, idade, saldo);
            passageiroST.put(id, p);
        }
    }
    
}
