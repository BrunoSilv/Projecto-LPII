package edu.ufp.inf.lp2.projecto;

import java.util.ArrayList;

public class Paragem {

    public String nomeParagem;

    public String zona;

    public Coordenada coordenada;

    public String cod;

    public ArrayList<Linha> linhas = new ArrayList<>();
    /**
     *
     * @element-type Aresta
     */
    public ArrayList<Paragem> paragens = new ArrayList<>();

    // Contructor vazio
    public Paragem()
    {}
    // Construtor que poderá ser usado caso queiramos importar os dados do ficheiro
    public Paragem(String nomeParagem, String zona, Coordenada coordenada, String cod, ArrayList linhas, ArrayList paragens) {
        this.nomeParagem = nomeParagem;
        this.zona = zona;
        this.coordenada = coordenada;
        this.cod = cod;
        this.linhas = linhas;
        this.paragens = paragens;
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

    public ArrayList getLinhas() {
        return linhas;
    }

    public void setLinhas(ArrayList linhas) {
        this.linhas = linhas;
    }

    public ArrayList getParagens() {
        return paragens;
    }

    public void setParagens(ArrayList paragens) {
        this.paragens = paragens;
    }

}
