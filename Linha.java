package edu.ufp.inf.lp2.projecto;

import java.util.ArrayList;

public class Linha {

  public String nome;

  
  public Linha(String nome){
    this.nome = nome;          // Este constructor define o nome da linha
  }
    /**
   * 
   * @element-type Aresta
   */
  public ArrayList  linhas;
    /**
   * 
   * @element-type Paragem
   */
  public ArrayList tem;
    /**
   * 
   * @element-type Aresta
   */
  public ArrayList  myAresta;

  //definimos o nome e depois é criada a paragem
  public Paragem addParagem(String nome) {
  Paragem novaparagem = new Paragem();
  novaparagem.setNomeParagem(nome);
  return novaparagem;
  }

  public Paragem removeParagem(String nome) {
  return null;
  }
  
}