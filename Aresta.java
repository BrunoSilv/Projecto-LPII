package edu.ufp.inf.lp2.projecto;

import edu.princeton.cs.algs4.EdgeWeightedGraph;
import edu.princeton.cs.algs4.DirectedEdge;

public class Aresta extends DirectedEdge {

  public float custoMonetario;

  public float custoTemporal;

  public Paragem destino;

    public Rede arestas;
    public Linha linhas;
    public Paragem tem;
    
    
    public Aresta(int v, int w, double weight) {
        super(v, w, weight);
    }

  public Linha addLinha(String nome) {
  return null;
  }

  public void removeLinha(String nome) {
  }

}