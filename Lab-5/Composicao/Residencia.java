import java.util.ArrayList;

public class Residencia{
    private ArrayList<Comodo> comodos = new ArrayList<Comodo>();
    private String nome;

    public  Residencia(){
        this.nome = null;
        this.comodos.add(new Comodo());
    }

    public Residencia(String nome){
        this.nome = nome;
        this.comodos.add(new Comodo());
    }

    public Residencia(String nome, Comodo comodo){
        this.nome = nome;
        this.comodos.add(comodo);
        comodo.setResidencia(this);
    }

    public void setResidencia(String nome){
        this.nome = nome;
    }

    public void adicionarComodo(Comodo comodo){
        this.comodos.add(comodo);
        comodo.setResidencia(this);
    }
    
    public void getComodos(){
        System.out.println(this.nome);
        System.out.println(this.comodos + "\n");
    }

    @Override
    public String toString(){
        return nome;
    }
}