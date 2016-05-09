package edu.ufp.inf.lp2.projecto;

import edu.princeton.cs.algs4.RedBlackBST;
import java.util.Date;

public class Passageiro extends RedBlackBST {

    public String nome;

    public int id;

    public Date dataNasc;

    public float saldo;

    public Coordenada coordenada;

    public Rede myRede;

    public void addPassageiro(String nome) {
    }

    public Passageiro removePassageiro(String nome) {
        return null;
    }

    public void addDinheiro(float valor) {
    }

    public void removeDinheiro(float preco) {
    }

    public int getIdade() {
        return 0;
    }

    //Construtor
    public Passageiro(String nome, int id, Date dataNasc, float saldo, Coordenada coordenada, Rede myRede) {
        this.nome = nome;
        this.id = id;
        this.dataNasc = dataNasc;
        this.saldo = saldo;
        this.coordenada = coordenada;
        this.myRede = myRede;
    }

    // Gets/Sets
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
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

    public void setCoordenada(Coordenada coordenada) {
        this.coordenada = coordenada;
    }

    public Rede getMyRede() {
        return myRede;
    }

    public void setMyRede(Rede myRede) {
        this.myRede = myRede;
    }

}
