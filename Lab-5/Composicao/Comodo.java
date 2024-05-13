public class Comodo{
    private Residencia residencia;
    private String nome;
  
    public Comodo(){
        this.nome = "Comodo Sem Nome";
    }

    public Comodo(String nome){
        this.nome = nome;
    }

    public void setResidencia(Residencia residencia){
        this.residencia = residencia;
    }

    public void getResidencia(){
        System.out.println("O comodo: "+ nome +" pertence a " + this.residencia);
    }

    @Override
    public String toString(){
        return nome;
    }
}