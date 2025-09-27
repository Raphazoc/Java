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
        System.out.println("Alunos do curso " + curso1.nome + ":");
        for (Aluno aluno : curso1.alunos) {
            System.out.println("- " + aluno.nome);

        }
        System.out.println("Alunos do curso " + curso2.nome + ":");
        for (Aluno aluno : curso2.alunos) {
            System.out.println("- " + aluno.nome);

        }
        System.out.println("Alunos do curso " + curso3.nome + ":");
        for (Aluno aluno : curso3.alunos) {
            System.out.println("- " + aluno.nome);
        }

    }
}