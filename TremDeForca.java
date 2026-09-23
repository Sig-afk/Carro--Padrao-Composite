import java.util.Random;

public class TremDeForca {
    private double pesoMotor;
    private double pesoTransmissao;
    private double pesoDiferencial;
    private double pesoRodas;

    public TremDeForca() {
        Random random = new Random();
        // Atribuição de pesos coerentes (em kg)
        this.pesoMotor = 150.0 + random.nextDouble() * 100.0; // 150 a 250 kg
        this.pesoTransmissao = 50.0 + random.nextDouble() * 30.0; // 50 a 80 kg
        this.pesoDiferencial = 20.0 + random.nextDouble() * 20.0; // 20 a 40 kg
        this.pesoRodas = 40.0 + random.nextDouble() * 30.0; // 40 a 70 kg
    }

    public double somarPesos(double totalAtual) {
        totalAtual = registrarPeca("Motor", pesoMotor, totalAtual);
        totalAtual = registrarPeca("Transmissão", pesoTransmissao, totalAtual);
        totalAtual = registrarPeca("Diferencial", pesoDiferencial, totalAtual);
        totalAtual = registrarPeca("Rodas", pesoRodas, totalAtual);
        return totalAtual;
    }

    private double registrarPeca(String nome, double peso, double totalAtual) {
        totalAtual += peso;
        System.out.printf("Somando agora o peso de %s: %.2f kg. Total parcial: %.2f kg%n",
                nome, peso, totalAtual);
        return totalAtual;
    }
}