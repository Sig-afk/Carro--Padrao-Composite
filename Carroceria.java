import java.util.Random;

public class Carroceria extends ParteComposta {
    public Carroceria() {
        super("Carroceria");
        Random random = new Random();

        adicionar(new Peca("Para-lamas", 10.0 + random.nextDouble() * 10.0));
        adicionar(new Peca("Portas", 30.0 + random.nextDouble() * 20.0));
        adicionar(new Peca("Painéis", 12.0 + random.nextDouble() * 13.0));
        adicionar(new Peca("Porta-malas", 10.0 + random.nextDouble() * 10.0));
        adicionar(new Peca("Capô", 12.0 + random.nextDouble() * 13.0));
    }
}