package edu.ufp.inf.lp2.projecto;

public class Paragem {

    public Integer id;

    public String nome;

    public Coordenada coordenada;

    public String zona;

    /**
     *
     * @element-type Aresta
     */
    // Contructor vazio
    public Paragem() {
    }

    public Paragem(Integer id, String nome, Coordenada coordenada, String zona) {
        this.id = id;
        this.nome = nome;
        this.coordenada = coordenada;
        this.zona = zona;
    }

    
//    // Construtor que poderá ser usado caso queiramos importar os dados do ficheiro
//    public Paragem(Integer cod, String nomeParagem, String zona, String linha) {
//        this.cod = cod;
//        this.nome = nomeParagem;
//        this.zona = zona;
//        //this.coordenada = coordenada;
//        this.linha = linha;
//        //this. = paragens;
//    }

// Gets/Sets

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Coordenada getCoordenada() {
        return coordenada;
    }

    public void setCoordenada(Coordenada coordenada) {
        this.coordenada = coordenada;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

}
