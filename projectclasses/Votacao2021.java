package com.mycompany.projectclasses;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Votacao2021 {
    public static void main(String args[])throws IOException
    {
    int escolha = 0;
    Votacao[] votacao = new Votacao[2020];
    metodos metodo_votacao = new metodos();

    do{
        escolha = Integer.parseInt(JOptionPane.showInputDialog("""
----------------------------------------------------------------
|           SISTEMA DE VOTAÇÃO                                      |
|      1 – Carregar Seção/Número Eleitor                        |
|      2 – Classificar por Seção                                |
|      3 – Gravar Registros                                     |
|      4 – Mostrar Indicadores                                  |
|      9 – Finalizar                                            |
----------------------------------------------------------------
                                                               """));
            switch(escolha)
        {
        case 1:
            votacao = metodo_votacao.FCadastrarVotos(votacao);
            JOptionPane.showMessageDialog(null, "votos cadastrados");
            break;
        case 2:
            votacao = metodo_votacao.FClassificarsecao(votacao);
            for(int i = 0; i< votacao.length;i++)
                {
                System.out.println(votacao[i].numerosecao +" "+votacao[i].numerocanditato);
                }
            JOptionPane.showMessageDialog(null, "votos classificados");
            break;
        case 3:
            metodo_votacao.FGravarVotacao(votacao);
            JOptionPane.showMessageDialog(null, "votos gravados");
            break;
        case 4:
            MenuIndicadores(votacao, metodo_votacao);
            break;
        case 9:
            JOptionPane.showMessageDialog(null, "Fechando programada");
            break;
            default:
                JOptionPane.showMessageDialog(null,"Valor Invalido\nInsira um outro valor");
                break;
            }
        }while(escolha != 9);

    }
    
    public static void MenuIndicadores(Votacao[] vt, metodos metodo)
    {
        int escolha = 0;
        do
        {
            escolha = Integer.parseInt(JOptionPane.showInputDialog("""
            ----------------------------------------------------------------
            |       Mostrar Indicadores                                     |
            |   Estatísticas de Votação em 2021                             |                               |                                                       
            |                                                               |
            |      1 – Quantidades Eleitores por Seção                      |
            |      2 – Seção com Maior e Menor número de Eleitores          |
            |      3 – Quantidade de votos por canditato                    |
            |      4 – 10 primeiros colocadas                               |
            |      9 – Voltar para menu principal                           |
            ----------------------------------------------------------------
                                                                   
                                                                           """));
            switch(escolha)
            {
                case 1:
                    PIndicadoresQtdSecao(vt, metodo);
                    break;
                case 2:
                    PIndicadoresSecaoMaiorMenor(vt, metodo);
                    break;
                case 3:
                    PIndicadoresQtdCandidato(vt, metodo);
                    break;
                case 4:
                    PIndicadoresRanque(vt,metodo);
                    break;
                case 9:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Voltando");
                    break;
            }
        }while(escolha !=9);
        
    }
    public static void PIndicadoresQtdSecao(Votacao[] vt, metodos m)
        {
        int[] qtdsecao = new int [10];
        m.FContarSecao(vt, qtdsecao);
        for(int i = 0; i<qtdsecao.length;i++)
            {
            System.out.println("Quantidade de candidados na secao "+(i+1)+": "+qtdsecao[i]);
            }
        }
    public static void PIndicadoresSecaoMaiorMenor(Votacao[] vt,metodos m)
        {
        int[] qtdsecao = new int [10];
        int maiorqtd,maiorsecao, menorqtd,menorsecao;
        maiorqtd = 0;
        menorqtd = 0;
        menorsecao = 0;
        maiorsecao = 0;
        m.FContarSecao(vt, qtdsecao);
        for(int i = 0; i<qtdsecao.length;i++)
            {
            if (qtdsecao[i] > maiorqtd)
                    {
                        maiorqtd = qtdsecao[i];
                        maiorsecao=i+1;
                    }
            if(qtdsecao[i] < menorqtd || menorsecao == 0)
                {
                menorqtd = qtdsecao[i];
                menorsecao = i+1;
                }
            }
        System.out.println("Secao com maior numero de candidatos:"+maiorsecao+" qtd:"+maiorqtd+"\nSecao com menor numero de candidatos:"+menorsecao+" qtd:"+menorqtd);
        
        }
    public static void PIndicadoresQtdCandidato(Votacao[] vt,metodos m)
        {
        int[] qtdvotos = new int[300];
        m.FContaVoto(vt, qtdvotos);
        for(int i = 0; i< qtdvotos.length;i++)
            {
            if (qtdvotos[i] != 0)
                {
                System.out.println("Candidato "+(i+1)+" recebeu "+qtdvotos[i]+" votos");
                }
            }
        }
    public static void PIndicadoresRanque(Votacao[] vt,metodos m)
        {
        int[] qtdvotos = new int[300];
        m.FContaVoto(vt, qtdvotos);
        int[][] rank = new int[10][2];
        
        for(int i = 0; i<qtdvotos.length;i++)
            {
            for(int j = 0; j<10; j++)
                {
                if (qtdvotos[i]>rank[j][1] || rank[j][0] == 0)
                    {
                    rank[j][0] = i+1;
                    rank[j][1] = qtdvotos[i];
                    break;
                    }
                }
            }
        for(int i = 0; i<10;i++)
            {
            System.out.println((i+1)+"* lugar: Candidato "+ rank[i][0]+" qtd de votos:"+ rank[i][1]);
            }
        }
}
