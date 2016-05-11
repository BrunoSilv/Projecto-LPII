/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ufp.inf.lp2.projecto;

import java.util.ArrayList;

/**
 *
 * @author Diogo
 */
public class ListaParagens {
    ArrayList<Paragem> ListaParagens = new ArrayList<>();
    
    public ArrayList getParagens()
    {
        return ListaParagens;
    }
    public void adicionaraLista(Paragem novaparagem)
    {
        ListaParagens.add(novaparagem);
    }
    
}
