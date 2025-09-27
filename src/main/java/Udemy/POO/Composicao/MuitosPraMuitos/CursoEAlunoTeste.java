package Udemy.POO.Composicao.MuitosPraMuitos;

public class CursoEAlunoTeste {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João");
        Aluno aluno2 = new Aluno("Maria");
        Aluno aluno3 = new Aluno("Pedro");

        Curso curso1 = new Curso("Matemática");
        Curso curso2 = new Curso("História");
        Curso curso3 = new Curso("Biologia");

        curso1.adicionarAluno(aluno1); // Adiciona o aluno1 ao curso1
        curso1.adicionarAluno(aluno2); // Adiciona o aluno2 ao curso1
        curso2.adicionarAluno(aluno2); // Adiciona o aluno2 ao curso2
        curso3.adicionarAluno(aluno3); // Adiciona o aluno3 ao curso3
        curso2.adicionarAluno(aluno3); // Adiciona o aluno3 ao curso2
        curso3.adicionarAluno(aluno1); // Adiciona o aluno1 ao curso3
        curso3.adicionarAluno(aluno2); // Adiciona o aluno2 ao curso3
        curso3.adicionarAluno(aluno3); // Adiciona o aluno3 ao curso3


        // Imprime os alunos de cada curso
        System.out.println("Alunos do curso " + curso1.nome + ":"); // Acessa o atributo final nome do curso1
        for (Aluno aluno : curso1.alunos) { // Percorre a lista de alunos do curso1
            System.out.println("- " + aluno.nome); // Acessa o atributo nome do aluno

        }
        System.out.println("  "); // Linha em branco para melhor visualização
        System.out.println("Alunos do curso " + curso2.nome + ":"); // Acessa o atributo final nome do curso2
        for (Aluno aluno : curso2.alunos) { // Percorre a lista de alunos do curso2
            System.out.println("- " + aluno.nome); // Acessa o atributo nome do aluno

        }
        System.out.println("  "); // Linha em branco para melhor visualização
        System.out.println("Alunos do curso " + curso3.nome + ":"); // Acessa o atributo final nome do curso3
        for (Aluno aluno : curso3.alunos) { // Percorre a lista de alunos do curso3
            System.out.println("- " + aluno.nome); // Acessa o atributo nome do aluno
        }

        System.out.println("  "); // Linha em branco para melhor visualização
        aluno1.obterCursoPorNome("Matemática"); // Busca o curso de nome "Matemática" na lista de cursos do aluno1)
        Curso cursoEncontrado = aluno1.obterCursoPorNome("Matemática");
        if (cursoEncontrado != null) {
            System.out.println("Curso encontrado: " + cursoEncontrado.nome);
            System.out.println("Alunos do curso " + cursoEncontrado.nome + ":");
            for (Aluno aluno : cursoEncontrado.alunos) { // Percorre a lista de alunos do curso encontrado
                System.out.println("- " + aluno.nome); // Acessa o atributo nome do aluno
            }
        } else {
            System.out.println("Curso não encontrado.");
        }
    }
} // Fim da classe CursoEAlunoTeste