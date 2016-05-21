package edu.ufp.inf.lp2.projecto;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.RedBlackBST;
import edu.princeton.cs.algs4.StdOut;
import java.util.ArrayList;

public class Linha {

  public String nome;
  
  RedBlackBST<Integer,String> ParagensST = new RedBlackBST<>();
  
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
  
  public String addParagem(Integer id) 
    {
      return this.ParagensST.get(id); // obtemos o id the paragem atraves 
                                                    // do nome
  }

  
    
   public RedBlackBST loadParagem(String path) {
       In in = new In(path);
       
        while(!in.isEmpty())
        {
            String[] texto = in.readLine().split(";");
            String id = texto[0];
            String nomedaparagem = texto[1];
            int ido = Integer.parseInt(id);//geramos o id e guardamos na  BST
            this.ParagensST.put(ido, nomedaparagem);
        }
        return this.ParagensST;
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