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
        
        //Print de Passageiros
        
        printPassageiro(passageiroST);
        
        Linha novalinha;
        Paragem novaparagem;

        In in = new In(".//data//ligacoes.txt");
        novalinha = new Linha();
        novalinha.loadParagem(".//data//paragem.txt");
        Rede G = new Rede(in);
        for(int i =0; i < G.V(); i++)
        {
            StdOut.print(novalinha.addParagem(i) + "\n"); // ciclo pra imprimir o nome das paragens
                                                          
        }
        for (DirectedEdgelp e : G.edges()) {

            StdOut.print(novalinha.addParagem(e.from()) + " : " + novalinha.addParagem(e.to()) + "\n");

        }
    }

    public static Linha criarLinha(String nome) {
        Linha novalinha = new Linha(nome);// é criado um novo objecto do tipo Linha
        if (validarLinha(nome, novalinha) == true) {
            StdOut.print("Linha ja existe");
        } else {
            novalinha.setLinhas(nome);
        }
        return novalinha;
    }

    public static boolean validarLinha(String nome, Linha novalinha) {
        boolean acabou = false;

        for (int i = 0; i < novalinha.getLinhas().size() && !acabou; i++) {
            if (novalinha.getLinhas().get(i).equals(nome)) {
                acabou = true;
                break;
            }
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
            //Float latitude = Float.parseFloat(texto[4]);
//            Float longitude = Float.parseFloat(texto[5]);
            
            //Coordenada c = new Coordenada(latitude, longitude);

            //Passageiro p = new Passageiro(id, nome, idade, saldo, c);
            //passageiroST.put(id, p);
        }
    }

    public static void printPassageiro(RedBlackBST<String, Passageiro> passageiroST) {
        System.out.println("\nLista de Passageiros:");
        for (String id : passageiroST.keys()) {
            Passageiro p = (Passageiro) passageiroST.get(id);
            System.out.println("ID: " + p.getNome()+ " Nome: " + p.getId()+  " Saldo: " + p.getSaldo()
            +" " + p.getCoordenada()
            );
        }
    }
}
