// Definição da classe Carta
public class Carta implements Printavel {

    // Enumeração para os números das cartas
    public enum Numero {
        AS, DOIS, TRES, QUATRO, CINCO, SEIS, SETE, OITO, NOVE, DEZ, J, Q, K
    }

    // Atributo para o número da carta
    private Numero numero;

    // Classe interna Naipe
    public class Naipe {
        // Enumeração para os tipos de naipes
        public enum TipoNaipe {
            OUROS, ESPADAS, PAUS, COPAS
        }

        // Atributo para o tipo de naipe
        private TipoNaipe tipoNaipe;

        // Construtor para a classe Naipe
        public Naipe(TipoNaipe tipoNaipe) {
            this.tipoNaipe = tipoNaipe;
        }

        // Getter para o tipo de naipe
        public TipoNaipe getTipoNaipe() {
            return tipoNaipe;
        }

        @Override
        public String toString() {
            return tipoNaipe.name();
        }
    }

    // Atributo para o naipe da carta
    private Naipe naipe;

    // Construtor para a classe Carta
    public Carta(Numero numero, Naipe.TipoNaipe tipoNaipe) {
        this.numero = numero;
        this.naipe = new Naipe(tipoNaipe);
    }

    // Implementação do método imprimir da interface Printavel
    @Override
    public String Imprimir() {
        return numero.name() + " de " + naipe.toString();
    }

    // Getter para o número da carta
    public Numero getNumero() {
        return numero;
    }

    // Getter para o naipe da carta
    public Naipe getNaipe() {
        return naipe;
    }
}