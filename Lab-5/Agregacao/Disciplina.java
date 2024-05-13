
import java.util.ArrayList;

public class Disciplina {
    private int id_disciplina;
    private String nome_disciplina;
    private ArrayList<Aluno> alunos;

    
    public Disciplina(int id, String nome){
        this.id_disciplina = id;
        this.nome_disciplina = nome;
        this.alunos = new ArrayList<>();
    }

    public void AdicionarAluno(Aluno aluno){
        this.alunos.add(aluno);
    }

    public void getAlunos(){
        System.out.println(this.nome_disciplina);
        System.out.println(this.alunos + "\n");
    }
}