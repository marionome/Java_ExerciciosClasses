package com.mycompany.projectclasses;
import java.util.*;
import java.io.*;

public class metodos {

    public Votacao[] FCadastrarVotos(Votacao[] vt)
    {
        vt = FIniciarLista(vt);
        Random rand = new Random();
        for(int i = 0; i< vt.length;i++)
        {
        vt[i].numerosecao = rand.nextInt(1,10);
        vt[i].numerocanditato = rand.nextInt(1,300);
        }
        return vt;
    }
    
    public Votacao[] FIniciarLista(Votacao[] vt)
    {
        for(int i = 0; i< vt.length;i++)
        {
        vt[i] = new Votacao();
        }
        return vt;
    }
    
    public Votacao[] FClassificarsecao(Votacao[] vt)
    {
    
        return vt;
    }
    
    public void FGravarVotacao(Votacao[] vt)
    {
    
    }
}
