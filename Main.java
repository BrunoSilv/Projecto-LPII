/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ufp.inf.lp2.projecto;
import java.util.ArrayList;
/**
 *
 * @author bluis
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Linha objlinha;
        
        objlinha = criarLinha("linhad");
        
        
    }
    
    public static Linha criarLinha(String nome){
       
        Linha novalinha = new Linha(nome); // é criado um novo objecto do tipo Linha
        return novalinha;     
    }
    public static ArrayList gerirLinhas(Linha objlinha)
    {
        ArrayList<Linha> listaLinhas = new ArrayList<>();
        listaLinhas.add(objlinha);
        return listaLinhas;
    }
    public static Paragem criarParagem(Linha objlinha, String nome, ArrayList listaLinhas, Coordenada novacoordenada, String cod, String zona)
    {
        Paragem novaparagem;
        novaparagem = objlinha.addParagem(nome);
        
        novaparagem.setCod(nome);
        novaparagem.setZona(zona);
        novaparagem.setLinhas(listaLinhas);
        novaparagem.setCoordenada(novacoordenada);
        return novaparagem;
    }
    
}
