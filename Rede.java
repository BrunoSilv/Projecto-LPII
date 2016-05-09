package edu.ufp.inf.lp2.projecto;

import edu.princeton.cs.algs4.RedBlackBST;
import java.util.Vector;
import edu.princeton.cs.algs4.EdgeWeightedGraph;
import edu.princeton.cs.algs4.EdgeWeightedDigraph;

public class Rede extends EdgeWeightedDigraph {

  public int id;

  public RedBlackBST passageiros;

    /**
   * 
   * @element-type Aresta
   */
  public Vector  possui;

    public Rede(int V) {
        super(V);
    }

  public void addAresta() {
  }

  public void removeAresta() {
  }

  public float calDesconto(Passageiro p) {
  return 0.0f;
  }

  public Paragem paragem(Coordenada c) {
  return null;
  }

}