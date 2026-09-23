import java.util.Random;

public class Chassi extends ParteComposta {
    public Chassi() {
        super("Chassi");
        Random random = new Random();

        // Chassi e composto por Trem de Forca (composto) e Suspensao (folha)
        adicionar(new TremDeForca());
        adicionar(new Peca("Suspensão", 35.0 + random.nextDouble() * 35.0));
    }
}