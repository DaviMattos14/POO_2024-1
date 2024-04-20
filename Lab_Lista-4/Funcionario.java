public class Funcionario{
    private String nome;
    private int matricula;
    private double salario;
    private Funcionario chefe;
    // 9) O código não compila foi a variável salário está privada

    public Funcionario(String n, int m, double s, Funcionario c){
        nome = n;
        matricula = m;
        salario = s;
        chefe = c;
    }

    public double bonus(Trimestre t){
        return salario * 0.1;
    }
    public String getNome(){
        return this.nome;
    }
    public double getSalario(){
        return this.salario;
    }

    @Override
    public boolean equals(Object objeto){
        Funcionario func = (Funcionario)objeto;
        if (func.matricula == this.matricula) {
            return true;
        }
        else{
            return false;
        }
    }
}
