package edu.ufp.inf.lp2.projecto;

import edu.princeton.cs.algs4.RedBlackBST;
import java.util.ArrayList;
import java.util.Date;

public class Passageiro extends RedBlackBST {

    public ArrayList<Passageiro> passageiros = new ArrayList<>();

    public String nome;

    public String id;

    public int idade;

    public float saldo;

    public Coordenada coordenada;

    //Construtor
    public Passageiro(String nome, String id, int idade, float saldo) {
        this.nome = nome;
        this.id = id;
        this.idade = idade;
        this.saldo = saldo;
        //this.coordenada = coordenada;
    }


    public void addPassageiro(Passageiro p) {
        int size = passageiros.size();
        for (int i = 0; i < size; i++) {
            Passageiro pass = passageiros.get(i);
            if (pass.getId() == p.getId()) {
                System.out.println("ID já existe");
                return;
            }
        }
        passageiros.add(p);
    }

    public Passageiro removePassageiro(String nome) {
        for (Passageiro p : this.passageiros) {
            if (p.getNome() == nome) {
                this.passageiros.remove(p);
                return p;
            }
        }
        return null;
    }

    public void addDinheiro(float valor) {
        valor = this.saldo++;
    }

    public void removeDinheiro(float preco) {
        preco = this.saldo--;
    }

    public int getIdade() {
        return 0;
    }

    // Gets/Sets
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getDataNasc() {
        return idade;
    }

    public void setDataNasc(int idade) {
        this.idade = idade;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public Coordenada getCoordenada() {
        return coordenada;
    }

//    public void setCoordenada(Coordenada coordenada) {
//        this.coordenada = coordenada;
//    }

}
