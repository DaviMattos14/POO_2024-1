
public class Aluno {
    private int dre;
    private String nome;

    public Aluno(int dre, String nome){
        this.dre = dre;
        this.nome = nome;
    }

    @Override
    public String toString(){
        return "DRE: " + dre + " Nome: " + nome;
    }
}
