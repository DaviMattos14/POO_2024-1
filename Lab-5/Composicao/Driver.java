public class Driver {
    public static void main(String[] args) {
        Comodo c1 = new Comodo("Quarto-Davi");
        Residencia r1 = new Residencia("Casa-Davi", c1);
        Comodo c2 = new Comodo("Quarto-Ingrid");
        r1.adicionarComodo(c2);
        Residencia r2 = new Residencia("Casa-Ingrid", c2);

        r1.getComodos();
        r2.getComodos();
        c1.getResidencia();
        c2.getResidencia();
    }
}
