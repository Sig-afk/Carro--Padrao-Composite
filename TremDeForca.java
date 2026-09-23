import java.util.Random;

public class TremDeForca extends ParteComposta {
    public TremDeForca() {
        super("Trem de Força");
        Random random = new Random();

        adicionar(new Peca("Motor", 150.0 + random.nextDouble() * 100.0));
        adicionar(new Peca("Transmissão", 50.0 + random.nextDouble() * 30.0));
        adicionar(new Peca("Diferencial", 20.0 + random.nextDouble() * 20.0));
        adicionar(new Peca("Rodas", 40.0 + random.nextDouble() * 30.0));
    }
}