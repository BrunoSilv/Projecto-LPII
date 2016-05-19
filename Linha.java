package edu.ufp.inf.lp2.projecto;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.RedBlackBST;
import edu.princeton.cs.algs4.StdOut;
import java.util.ArrayList;

public class Linha {

  public String nome;
  
  RedBlackBST<String,Integer> ParagensST = new RedBlackBST<>();
  
  Paragem novaparagem;

  
  public Linha(String nome){
    this.nome = nome;          // Este constructor define o nome da linha
  }
  public Linha(){}
    /**
   * 
   * @element-type Aresta
   */
  public ArrayList<String> linhas = new ArrayList<>();
    /**
   * 
   * @element-type Paragem
   */
  
    /**
   * 
   * @element-type Aresta
   */
  public ArrayList  myAresta;

  //definimos o nome e depois é criada a paragem
  
  public int addParagem(String nomeParagem) 
    {
      return this.ParagensST.get(nomeParagem); // obtemos o id the paragem atraves 
                                                    // do nome
  }

  
    
   public RedBlackBST loadParagem(String path) {
       In in = new In(path);
       int count = 0;
        while(!in.isEmpty())
        {
            String[] texto = in.readLine().split(";");
            String nomedaparagem = texto[0];                //geramos o id e guardamos na  BST
            count = count + 1;
            this.ParagensST.put(nomedaparagem, count);
        }
        return this.ParagensST;
    }
   public void printParagens()
    {
        
        for(String s: this.ParagensST.keys())
        {
            StdOut.print(s + this.ParagensST.get(s) + "\n");
        }
    }
  public Paragem removeParagem(String nome) {
  return null;
  }
  public ArrayList getLinhas()
  {
     return linhas;
  }
  public void setLinhas(String nome){
      linhas.add(nome);
      
   }
  public String getNome()
  {
      return nome;
  }
 
  
}