package com.mycompany.mavenproject3;

public class Estatisticas {
    int codcidade;
    String nomecidade;
    int numacidentes;
    
    Estatisticas()
    {
    this(0,"",0);
    }
    
    Estatisticas(int codcid, String nomecid, int numacid)
    {
    codcidade = codcid;
    nomecidade = nomecid;
    numacidentes = numacid;
    }
}
