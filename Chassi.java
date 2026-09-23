import java.util.Random;

public class Chassi {
    private TremDeForca tremDeForca;
    private double pesoSuspensao;

    public Chassi() {
        Random random = new Random();
        this.tremDeForca = new TremDeForca();
        this.pesoSuspensao = 35.0 + random.nextDouble() * 35.0; // 35 a 70 kg
    }

    public double somarPesos(double totalAtual) {
        // Primeiro soma os itens do Trem de Força
        totalAtual = tremDeForca.somarPesos(totalAtual);

        // Depois soma a Suspensão
        totalAtual += pesoSuspensao;
        System.out.printf("Somando agora o peso de Suspensão: %.2f kg. Total parcial: %.2f kg%n",
                pesoSuspensao, totalAtual);

        return totalAtual;
    }
}