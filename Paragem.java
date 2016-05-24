package edu.ufp.inf.lp2.projecto;
import edu.princeton.cs.algs4.In;
import java.util.ArrayList;
import edu.princeton.cs.algs4.RedBlackBST;

public class Paragem{

    public String nomeParagem;

    public String zona;
    
    public Integer cod; //codigo da paragem

    public String linha;
    
    
    /**
     *
     * @element-type Aresta
     */
    

    // Contructor vazio
    public Paragem()
    {}
    // Construtor que poderá ser usado caso queiramos importar os dados do ficheiro
    public Paragem(Integer cod, String nomeParagem, String zona, String linha) {
        this.cod = cod;
        this.nomeParagem = nomeParagem;
        this.zona = zona;
        //this.coordenada = coordenada;
        this.linha = linha;
        //this. = paragens;
    }
    
// Gets/Sets
    public String getNomeParagem() {
        return nomeParagem;
    }

    public void setNomeParagem(String nomeParagem) {
        this.nomeParagem = nomeParagem;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }

    public String getLinha() {
        return linha;
    }

    public void setLinha(String linha) {
        this.linha = linha;
    }
}
