/*
    Lista 2
    Questões Teóricas 
    1)
        NA programação proceudural (modular/estruturada) escrevemos 
        procedimentos e métodos que realizam operações nos dados, enquanto
        na POO criamos objetos que contém ambos, método e data.
    2)
        Classe é modelo de objeto, ou apenas uma "categoria", e objeto é uma 
        instância da classe.
    3)
        Atributo de objeto: 
            É uma "caracteristica", variável de uma instância de uma classe
        Atributo de classe:  
            É uma variável que pertence à própria classe em vez de uma instância específica da classe
        Método de objeto
            Um método de objeto é uma função definida dentro de uma classe 
            que opera em instâncias específicas dessa classe.
        Método de classe:
            Um método de classe é uma função que opera na própria classe 
            e não em instâncias específicas dela


 */
class Funcionario{
    private String nome;
    private double salarioHora;
    private int ID_FUNC;
    private static int proxID = 1;
    final double SALARIO_HORA_MINIMO = 12.50;
    private double horasTrabalhadasMes;

    public Funcionario(String nome_completo){
        this.nome = nome_completo;
        this.salarioHora = SALARIO_HORA_MINIMO;
        this.ID_FUNC = proxID++;
        
    }
    public Funcionario(String nome,double salario ){
        this.nome = nome;
        this.salarioHora = salario;
        this.ID_FUNC = proxID++;
    }
    public String getNome(){
        return nome;
    }
    public int getID(){
        return ID_FUNC;
    }
    public double getSalarioHora(){
        return salarioHora;
    }
    public double calculaSalarioMes(){
        double salario_mes = this.salarioHora * this.horasTrabalhadasMes;
        return salario_mes;

    }
    public void reiniciaMesTrabalho(){
        this.horasTrabalhadasMes = 0;
    }
    public void atualizarNome(String novo_nome){
        String[] nome_ = novo_nome.split(" ");
        if (nome_.length < 2) {
            System.out.print("Precisa ter pelo menos um sobrenome\n");
        }
        else{
            this.nome = novo_nome;
        }
    }
    public void atualizarSalarioHora(double novo_SalarioHora){
        if (novo_SalarioHora < this.salarioHora){
            System.out.print("O novo valor tem que ser maior que o atual\n");
        }
        else{
            this.salarioHora = novo_SalarioHora;
        }
    }
    public int getProximoID(){
        return proxID;
    }
    public void adicionaDiaDeTrabalho(double horas_trabalhadas){
        if (horas_trabalhadas < 4) {
            System.out.print("Precisa ser no minimo 4 horas para ser valido\n");
        }
        else{
            this.horasTrabalhadasMes += horas_trabalhadas;
        }
    }
    public static void main(String[] args) {
        Funcionario f = new Funcionario("Davi Mattos", 250.50);
        f.atualizarSalarioHora(200.00);
        f.adicionaDiaDeTrabalho(4);
        f.adicionaDiaDeTrabalho(6);
        f.atualizarNome("João");
        System.out.printf("ID: %d\nNome: %s\nSalario Mes: %.2f\n", f.getID(),f.getNome(), f.calculaSalarioMes());
        Funcionario g = new Funcionario("Clebinho Malvadeza");
        System.out.printf("ID: %d\nNome: %s\nSalario Hora: %.2f\n", g.getID(),g.getNome(), g.getSalarioHora());
        System.out.printf("%d\n%d\n", f.getProximoID(), g.getProximoID());
        
    }

}