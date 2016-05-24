package edu.ufp.inf.lp2.projecto;

import edu.princeton.cs.algs4.RedBlackBST;

import edu.princeton.cs.algs4.In;

public class Rede extends EdgeWeightedDigraph1 {

    public int id;

    public RedBlackBST passageiros;
    
    

    //Construtor
    public Rede(In in){
            
    super(in);   
    }

    public void addAresta() {
    }

    public void removeAresta() {
    }

    public float calDesconto(Passageiro p) {
        return 0.0f;
    }

    
    //Gets/Sets
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public RedBlackBST getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(RedBlackBST passageiros) {
        this.passageiros = passageiros;
    }

}
