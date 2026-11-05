package com.mycompany.projectclasses;
import java.util.*;

public class metodos {

    public Votacao[] FCadastrarVotos(Votacao[] vt)
    {
        Random rand = new Random();
        for(int i = 0; i< vt.length;i++)
        {
        vt[i].numerosecao = rand.nextInt(1,10);
        vt[i].numerocanditato = rand.nextInt(1,300);
        }
        return vt;
    }
}
