package com.mycompany.projectclasses;
import javax.swing.JOptionPane;

public class Votacao2021 {
    public static void main(String args[])
    {
    int escolha = 0;
    Votacao[] votacao = new Votacao[10];
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
            break;
        case 4:
            MenuIndicadores(votacao);
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
    
    public static void MenuIndicadores(Votacao[] vt)
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
                    PIndicadoresQtdSecao();
                    break;
                case 2:
                    PIndicadoresSecaoMaiorMenor();
                    break;
                case 3:
                    PIndicadoresQtdCandidato();
                    break;
                case 4:
                    PIndicadoresRanque();
                    break;
                case 9:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Voltando");
                    break;
            }
        }while(escolha !=9);
        
    }
    public static void PIndicadoresQtdSecao()
        {
        
        }
    public static void PIndicadoresSecaoMaiorMenor()
        {
        
        }
    public static void PIndicadoresQtdCandidato()
        {
        
        }
    public static void PIndicadoresRanque()
        {
        }
}
