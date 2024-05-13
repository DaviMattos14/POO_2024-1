public class Driver {
    public static void main(String[] args) {
        Aluno a1 = new Aluno(1,"Gab");
        Aluno a2 = new Aluno(2,"Ju");

        Disciplina d1 = new Disciplina(1, "Matematica");
        Disciplina d2 = new Disciplina(2, "Filosofia");

        d1.AdicionarAluno(a1);
        d1.AdicionarAluno(a2);

        d2.AdicionarAluno(a2);

        d1.getAlunos();
        d2.getAlunos();
    }
}
