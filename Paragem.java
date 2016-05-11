package edu.ufp.inf.lp2.projecto;

import java.util.ArrayList;

public class Paragem extends ListaParagens{

    public String nomeParagem;

    public String zona;

    public Coordenada coordenada;

    public String cod; //codigo da paragem

    public String linha;
    /**
     *
     * @element-type Aresta
     */
    

    // Contructor vazio
    public Paragem()
    {}
    // Construtor que poderá ser usado caso queiramos importar os dados do ficheiro
    public Paragem(String nomeParagem, String zona, Coordenada coordenada, String cod, String linha) {
        this.nomeParagem = nomeParagem;
        this.zona = zona;
        this.coordenada = coordenada;
        this.cod = cod;
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

    public Coordenada getCoordenada() {
        return coordenada;
    }

    public void setCoordenada(Coordenada coordenada) {
        this.coordenada = coordenada;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getLinha() {
        return linha;
    }

    public void setLinha(String linha) {
        this.linha = linha;
    }
}
