package edu.ufp.inf.lp2.projecto;

import edu.princeton.cs.algs4.RedBlackBST;

import edu.princeton.cs.algs4.In;

public class Rede extends EdgeWeightedDigraph1 {

    public int id;

    // RedBlacks
    private RedBlackBST<String, Passageiro> passageiroST = new RedBlackBST<>();
    private RedBlackBST<String, Paragem> paragensST = new RedBlackBST<>();

    //Construtor
    public Rede(In in) {

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

    public RedBlackBST<String, Passageiro> getPassageiroST() {
        return passageiroST;
    }

    public void setPassageiroST(RedBlackBST<String, Passageiro> passageiroST) {
        this.passageiroST = passageiroST;
    }

    public RedBlackBST<String, Paragem> getParagensST() {
        return paragensST;
    }

    public void setParagensST(RedBlackBST<String, Paragem> paragensST) {
        this.paragensST = paragensST;
    }

    public void loadPassageiros(String path) {
        In in = new In(path); // abertura do ficheiro/stream de entrada
        while (!in.isEmpty()) {
            String[] texto = in.readLine().split(";");
            String id = texto[0];
            String nome = texto[1];
            int idade = Integer.parseInt(texto[2]);
            Float saldo = Float.parseFloat(texto[3]);
            Float latitude = Float.parseFloat(texto[4]);
            Float longitude = Float.parseFloat(texto[5]);

            Coordenada c = new Coordenada(latitude, longitude);

            Passageiro p = new Passageiro(id, nome, idade, saldo, c);
            passageiroST.put(id, p);
        }
    }
    
    public void loadParagens(String path) {
       In in = new In(path);
        while(!in.isEmpty())
        {
            String[] texto = in.readLine().split(";");
            String id = texto[0];
            String nome = texto[1];
            Float latitude = Float.parseFloat(texto[2]);
            Float longitude = Float.parseFloat(texto[3]);
            Integer zona = Integer.parseInt(texto[4]);
            
            Coordenada c = new Coordenada(latitude, longitude);
            
            Paragem pa = new Paragem(id, nome, c, zona);
            paragensST.put(id, pa);
        }
    }

    public void printPassageiro() {
        System.out.println("\nLista de Passageiros:");
        for (String id : passageiroST.keys()) {
            Passageiro p = (Passageiro) passageiroST.get(id);
            System.out.println("ID: " + p.getNome() + " Nome: " + p.getId() + " Saldo: " + p.getSaldo()
                    + " " + p.getCoordenada()
            );
        }
    }
    
    public void printParagens(){
        System.out.println("\nLista de Paragens:");
        for (String id : paragensST.keys()){
            Paragem pa = (Paragem) paragensST.get(id);
            System.out.println("ID: " + pa.getId() + "Nome: " + pa.getNome() + " Coordenada: " + pa.getCoordenada() + " Zona: " + pa.getZona());
        }
    }
}
