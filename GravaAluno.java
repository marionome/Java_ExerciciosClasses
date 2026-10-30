package com.mycompany.mavenproject2;
import java.io.*;
import javax.swing.*;

public class GravarAluno {
    public static void main(String args[])throws IOException
    {
    Aluno[] aluno = new Aluno[3];
    int i;
    String filename = "ArquivoAluno.txt";
    BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
    
    for(i=0;i<3;i++)
        {
        aluno[i] = new Aluno();
        }
    for(i=0;i<3;i++)
        {
        aluno[i].pnome = JOptionPane.showInputDialog("Insira o primeiro nome do aluno:");
        writer.write(aluno[i].pnome);
        writer.newLine();
        aluno[i].unome = JOptionPane.showInputDialog("Insira o ultimo nome do aluno:");
        writer.write(aluno[i].unome);
        writer.newLine();
        aluno[i].pontos = Integer.parseInt(JOptionPane.showInputDialog("Insira os pontos do aluno:"));
        writer.write(Integer.toString(aluno[i].pontos));
        writer.newLine();
        }    
    for(i=0;i<3;i++)
        {
        System.out.println(aluno[i].pnome+" "+aluno[i].unome+" pontos: "+aluno[i].pontos);
        }
    writer.close();
    System.exit(0);
    }
}
