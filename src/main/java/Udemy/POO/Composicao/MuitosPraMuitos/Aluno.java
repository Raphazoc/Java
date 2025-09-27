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

    Curso obterCursoPorNome (String nome) {
        for (Curso curso : this.cursos) { // Percorre a lista de cursos do aluno
            if (curso.nome.equalsIgnoreCase(nome)) { // Compara o nome do curso com o nome passado como parâmetro
                return curso; // Retorna o curso encontrado
            }
        }
        return null; // Retorna null se o curso não for encontrado
    }

    @Override
    public String toString() {
        return "Meu nome é " + nome;
    }
}
