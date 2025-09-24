package Faculdade.CriarArquivos.Serializacao;

import java.io.*;

public class Principal {
    public static void main(String[] args) {
        Aluno p1 = new Aluno("Ana", 5, 8.5);
        Aluno p2 = new Aluno("Bia", 2, 9.5);
        Aluno p3 = new Aluno("Carlos", 0, 10.0);

        try {
            FileOutputStream f = new FileOutputStream(new File("alunos.txt"));
            ObjectOutputStream o = new ObjectOutputStream(f);

            o.writeObject(p1);
            o.writeObject(p2);
            o.writeObject(p3);

            o.close();
            f.close();

            FileInputStream fi = new FileInputStream(new File("alunos.txt"));
            ObjectInputStream oi = new ObjectInputStream(fi);

            // Read objects

            Aluno pr1 = (Aluno) oi.readObject();
            Aluno pr2 = (Aluno) oi.readObject();
            Aluno pr3 = (Aluno) oi.readObject();

            System.out.println(pr1.toString());
            System.out.println(pr2.toString());
            System.out.println(pr3.toString());


            oi.close();
            fi.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error initializing stream");
        }
    }

}
