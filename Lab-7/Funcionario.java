
public class Funcionario {
    private String nome;
    private String cargo;
    private int matricula;
    private int idade;
    private Funcionario chefe;
    private double salario;

    public Funcionario(String nome, String cargo, 
        int matricula, int idade,Funcionario chefe, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.matricula = matricula;
        this.idade = idade;
        this.chefe = chefe;
        this.salario = salario;
    }

    public boolean mesmaChefia(Funcionario f){
        return this.chefe == f.chefe;
    }
// get e set Nome
    public String getNome() {  
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

// get e set Cargo
    public String getCargo() {
        return this.cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

// get e set Matricula
    public int getMatricula() {
        return this.matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

// get e set Idade
    public int getIdade() {
        return this.idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

// get e set Chefe
    public Funcionario getChefe() {
        return this.chefe;
    }
    public void setChefe(Funcionario chefe) throws ChefeInvalidoException {
        if (chefe == this){
            throw new ChefeInvalidoException();
        }
        else{
            this.chefe = chefe;
        }
    }
  
// get e set Salario
    public double getSalario() {
        return this.salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
