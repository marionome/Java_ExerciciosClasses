package com.mycompany.mavenproject3;
import javax.swing.JOptionPane;

public class TransitoPrincipal {
    public void main(String args[])
    {
    int opc = 0;
    Estatisticas[] estatistica = new Estatisticas[3];
    ClasseMetodos m = new ClasseMetodos();
    
    while(opc != 9)
        {
        opc = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                    MENU ESTATISTICA
                                                           ----------------------------------------------
                                                           |1 - Cadastro Estatistica                    |
                                                           |2 - Consulta por quantidade de acidentes    |
                                                           |3 - Consulta por estatisticas de acidente   |
                                                           |4 - Acidentes acima da media das 10 cidades |
                                                           |9 - Finaliza                                |    
                                                           ----------------------------------------------
                                                           """));
        switch(opc)
            {
            case 1:
                
                estatistica=m.FCadastrarEstatistica(estatistica);
                break;
            case 2:
                m.PQuantidadeAcidentes(estatistica);
                break;
            case 3:
                m.PMaiorMenor(estatistica);
                break;
            case 4:
                m.PAcima(estatistica);
                break;
            case 9:
                JOptionPane.showMessageDialog(null, "Menu Finalizado");
                break;
            default:
                JOptionPane.showMessageDialog(null,"Valores invalidos");
            }
        }
    }
}
