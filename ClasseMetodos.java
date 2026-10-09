package com.mycompany.mavenproject3;
import javax.swing.JOptionPane;

public class ClasseMetodos {
    public Estatisticas[] FCadastrarEstatistica(Estatisticas[] estatistica)
    {
    for(int i = 0; i<3;i++)
        {
        estatistica[i].codcidade = Integer.parseInt(JOptionPane.showInputDialog("Insira o codigo da cidade:"));
        estatistica[i].nomecidade = JOptionPane.showInputDialog("Insira o nome da cidade:");
        estatistica[i].numacidentes = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de acidentes:"));
        }
    return estatistica;
    }
    
    public void PQuantidadeAcidentes(Estatisticas[] estatistica)
    {
    for(int i = 0; i<estatistica.length;i++)
        {
        if(estatistica[i].numacidentes>100 && estatistica[i].numacidentes<500)
            {
            System.out.println("Cidade:"+estatistica[i].nomecidade+" qtd de acidentes:"+estatistica[i].numacidentes);
            }
        }
    }
    
    public void PMaiorMenor(Estatisticas[] estatistica)
    {
    int[] sort = new int[estatistica.length];
    int aux = 0;
    for(int i = 0; i<estatistica.length;i++)
        {
        sort[i] = estatistica[i].numacidentes;
        }
    for(int i = 0; i<sort.length-1;i++)
        {
        for(int j = i+1; j<sort.length;j++)
            {
            if(sort[i]>sort[j])
                {
                aux = sort[j];
                sort[j] = sort[i];
                sort[i] = aux;
                }
            }
        }
    
    JOptionPane.showMessageDialog(null, "O menor numero de acidentes:"+sort[0]+"\nO maior numero de acidentes:"+sort[sort.length-1]);
   
    }
    
    public void PAcima(Estatisticas[] estatistica)
    {
    double media = 0;
    for(int i = 0;i<estatistica.length;i++)
        {
        media = media+estatistica[i].numacidentes;
        }
    media = media/estatistica.length;
    for(int i = 0;i<estatistica.length;i++)
        {
        if(estatistica[i].numacidentes>media)
            {
            System.out.println(estatistica[i].numacidentes);
            }
        }
    }
}
