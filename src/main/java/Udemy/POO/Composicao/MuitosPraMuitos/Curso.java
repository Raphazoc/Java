package Udemy.POO.Composicao.MuitosPraMuitos;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    final String nome; // Nome do curso (atributo final)
    final List<Aluno> alunos = new ArrayList<>(); // Lista de alunos matriculados no curso (atributo final) que nao pode ser reatribuida

    Curso(String nome) { // Construtor
        this.nome = nome;
    }

    void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno); // Adiciona o aluno na lista de alunos do curso
        aluno.cursos.add(this); // Adiciona o curso na lista de cursos do aluno
    }

}
