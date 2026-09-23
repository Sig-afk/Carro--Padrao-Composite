import java.util.Random;

public class Carroceria {
    private double pesoParaLamas;
    private double pesoPortas;
    private double pesoPaineis;
    private double pesoPortaMalas;
    private double pesoCapo;

    public Carroceria() {
        Random random = new Random();
        // Atribuição de pesos leves/médios
        this.pesoParaLamas = 10.0 + random.nextDouble() * 10.0; // 10 a 20 kg
        this.pesoPortas = 30.0 + random.nextDouble() * 20.0; // 30 a 50 kg
        this.pesoPaineis = 12.0 + random.nextDouble() * 13.0; // 12 a 25 kg
        this.pesoPortaMalas = 10.0 + random.nextDouble() * 10.0; // 10 a 20 kg
        this.pesoCapo = 12.0 + random.nextDouble() * 13.0; // 12 a 25 kg
    }

    public double somarPesos(double totalAtual) {
        totalAtual = registrarPeca("Para-lamas", pesoParaLamas, totalAtual);
        totalAtual = registrarPeca("Portas", pesoPortas, totalAtual);
        totalAtual = registrarPeca("Painéis", pesoPaineis, totalAtual);
        totalAtual = registrarPeca("Porta-malas", pesoPortaMalas, totalAtual);
        totalAtual = registrarPeca("Capô", pesoCapo, totalAtual);
        return totalAtual;
    }

    private double registrarPeca(String nome, double peso, double totalAtual) {
        totalAtual += peso;
        System.out.printf("Somando agora o peso de %s: %.2f kg. Total parcial: %.2f kg%n",
                nome, peso, totalAtual);
        return totalAtual;
    }
}