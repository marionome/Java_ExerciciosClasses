package com.mycompany.projectclasses;
import javax.swing.JOptionPane;

public class Votacao2021 {
    public void main(String args[])
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
        }while(escolha != 9);
    switch(escolha)
        {
        case 1:
            votacao = metodo_votacao.FCadastrarVotos(votacao);
            JOptionPane.showMessageDialog(null, "votos cadastrados");
            break;
        case 2:
            votacao = metodo_votacao.FClassificarsecao(votacao);
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
    }
    
    public void MenuIndicadores(Votacao[] vt)
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
            |      9 – Finalizar                                            |
            ----------------------------------------------------------------
                                                                           """));
        }while(escolha != 9);
        switch(escolha)
        {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 9:
                break;
            default:
                break;
        }
    }
    public void PIndicadoresQtdSecao(){}
    public void PIndicadoresSecaoMaiorMenor(){}
    public void PIndicadoresQtdSecao(){}
    public void PIndicadoresQtdSecao(){}
}
