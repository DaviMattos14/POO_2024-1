
import java.util.Random;

// Definição da classe FactoryCarta
public class FactoryCarta {
    private static final Random random = new Random();

    public static Carta gerarCarta() {
        Carta.Numero numero = Carta.Numero.values()[random.nextInt(Carta.Numero.values().length)];
        Carta.Naipe.TipoNaipe tipoNaipe = Carta.Naipe.TipoNaipe.values()[random.nextInt(Carta.Naipe.TipoNaipe.values().length)];
        return new Carta(numero, tipoNaipe);
    }
}
