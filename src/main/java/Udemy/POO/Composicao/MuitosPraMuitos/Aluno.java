package Udemy.POO.Composicao.MuitosPraMuitos;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    String nome;
    List<Curso> cursos = new ArrayList<>();

    Aluno(String nome) { // Construtor
        this.nome = nome;

    }

    void adicionarCurso(Curso curso) {
        this.cursos.add(curso); // Adiciona o curso na lista de cursos do aluno
        curso.alunos.add(this); // Adiciona o aluno na lista de alunos do curso
    }

    @Override
    public String toString() {
        return "Meu nome é " + nome;
    }
}
