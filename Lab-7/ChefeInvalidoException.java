
public class ChefeInvalidoException extends Exception {

    public ChefeInvalidoException() {
        super("Erro: um funcionário não pode ser chefe de si mesmo.");
    }
}
