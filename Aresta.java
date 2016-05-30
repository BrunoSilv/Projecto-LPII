package edu.ufp.inf.lp2.projecto;


import edu.princeton.cs.algs4.DirectedEdge;
import edu.princeton.cs.algs4.StdOut;


public class Aresta extends DirectedEdge {

    public float custoMonetario;

    public double custoTemporal;

    public Paragem destino;

    public Rede arestas;
    public Linha linhas;
    public Paragem tem;

    public Aresta(int v, int w, double distancia) {
        super(v, w,distancia);
    }

    
   

    // Gets/Sets
    public float getCustoMonetario() {
        return custoMonetario;
    }

    public void setCustoMonetario(float custoMonetario) {
        this.custoMonetario = custoMonetario;
    }

    public double getCustoTemporal() {
        return custoTemporal;
    }

    public void setCustoTemporal(double custoTemporal) {
        this.custoTemporal = custoTemporal;
    }

    public Paragem getDestino() {
        return destino;
    }

    public void setDestino(Paragem destino) {
        this.destino = destino;
    }

    public Rede getArestas() {
        return arestas;
    }

    public void setArestas(Rede arestas) {
        this.arestas = arestas;
    }

    public Linha getLinhas() {
        return linhas;
    }

    public void setLinhas(Linha linhas) {
        this.linhas = linhas;
    }

    public Paragem getTem() {
        return tem;
    }

    public void setTem(Paragem tem) {
        this.tem = tem;
    }

}
