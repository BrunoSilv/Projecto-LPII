package edu.ufp.inf.lp2.projecto;

import edu.princeton.cs.algs4.StdOut;
import java.util.ArrayList;

public class Linha extends ListaParagens{

  public String nome;
  
  public Linha(String nome){
    this.nome = nome;          // Este constructor define o nome da linha
  }
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
  public Paragem addParagem(String nomedaparagem, Linha novalinha, Paragem novaparagem) {
      Paragem variavelaux = null;
      boolean terminou = false;
      
      for(int i=0; i<novaparagem.getParagens().size() && !terminou; i++){
       
       variavelaux = (Paragem) novaparagem.getParagens().get(i);
       if(variavelaux.getNomeParagem().equals(nomedaparagem)){  // vai procurar no array de paragens
          variavelaux.setLinha(novalinha.getNome());            // se existe uma paragem com aquele nome
       }else{                                                   // e define o campo linha como sendo o da linha em que vamos adicionar a paragem
         StdOut.println("A paragem nao existe na BD");
          terminou = true;
          break;
       }
    }
    return variavelaux; 
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