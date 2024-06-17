public class main {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Davi", "Gerente", 
                                        14 ,24,
                                        null, 1412.64);
        
        Funcionario f2 = new Funcionario("Carlos", "Assistente",
                                        11, 19, 
                                        f1, 900.10);

        Funcionario f3 = new Funcionario("JJ", "Assistente",
                                        10, 17,
                                        null, 500.50);

        try {
            f3.setChefe(f1);
            System.out.println("O chefe de "+ f3.getNome() +" eh "+ f3.getChefe().getNome());
            f1.setChefe(f1);    
            System.out.println("O chefe de "+ f1.getNome() +" eh "+ f1.getChefe().getNome());
        } catch (ChefeInvalidoException e) {
            System.out.println(e);
        }
    }
}
