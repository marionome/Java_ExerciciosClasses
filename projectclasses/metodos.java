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
    
    private Votacao[] FIniciarLista(Votacao[] vt)
    {
        for(int i = 0; i< vt.length;i++)
        {
        vt[i] = new Votacao();
        }
        return vt;
    }
    
    public Votacao[] FClassificarsecao(Votacao[] vt)
    {
    Votacao aux = new Votacao();
    for(int i = 0; i < vt.length-1 ;i++)
        {
        for(int j = i+1; j<vt.length;j++)
            {
            if (vt[i].numerosecao > vt[j].numerosecao)
                {
                aux = vt[i];
                vt[i] = vt[j];
                vt[j]= aux;
                }
            else
                {
                    if((vt[i].numerocanditato > vt[j].numerocanditato) & (vt[i].numerosecao == vt[j].numerosecao))
                    {
                    aux = vt[i];
                    vt[i] = vt[j];
                    vt[j]= aux;
                    }
                }
            }
        }
        return vt;
    }
    
    public void FGravarVotacao(Votacao[] vt)throws IOException
    {
    String filename = "VotaçãoRegistro.txt";
    BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
    for(int i = 0; i<vt.length;i++)
        {
        writer.write(Integer.toString(vt[i].numerosecao));
        writer.newLine();
        writer.write(Integer.toString(vt[i].numerocanditato));
        writer.newLine();
        }
    writer.close();
    }
    
    public int[] FContarSecao(Votacao[] vt, int[] qtdsecao)
    {
        for(int i = 0; i < vt.length;i++)
            {
            qtdsecao[vt[i].numerosecao-1]++;
            }
        return qtdsecao;
    }
    
    public int[] FContaVoto(Votacao[] vt, int[] qtdvotos)
    {
    for(int i = 0; i< vt.length; i++)
        {
        qtdvotos[vt[i].numerocanditato-1]++;
        }
    return qtdvotos;
    }
}
