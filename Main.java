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
        
        Linha novalinha;
        Paragem novaparagem;
        
        loadPassageirosST(passageiroST, ".//data//passageiros.txt");
        
        novaparagem = criarParagem();
        novaparagem.adicionaraLista(novaparagem);
        novalinha = criarLinha("linhad");
        novaparagem = novalinha.addParagem("Trindade", novalinha, novaparagem);
        StdOut.print(novaparagem.getLinha() + "\n" + novaparagem.getNomeParagem()+ "\n"); // a funcionar
         
    }
    public static void loadPassageirosST(RedBlackBST<String, Passageiro> passageiroST, String path){
        In in = new In(path);
        while(!in.isEmpty()){
            String[] texto = in.readLine().split(";");
            String id = texto[0];
            String nome = texto[1];
            String idade = texto[2];
            String saldo = texto[3];
            
            Passageiro p = new Passageiro(id, nome, idade, saldo);
            passageiroST.put(id, p);
            
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
 
    public static Paragem criarParagem()
    {
        
        String nome, cod, zona;
        Coordenada novacoordenada = new Coordenada(45.84f,65.67f);
        nome = "Trindade";
        
        Paragem novaparagem = new Paragem("Trindade", "C2",novacoordenada,"45",null);// o campo la linha é
        //null porque nao sabemos qual é a linha que queremos adicionar a paragem
        return novaparagem;
       
    }
    
}
