public class Carro extends ParteComposta {
    public Carro() {
        super("Carro");
        // Carro e composto por Carroceria e Chassi
        adicionar(new Carroceria());
        adicionar(new Chassi());
    }

    public void calcularPesoTotal() {
        System.out.println("=== Início do cálculo do peso do veículo ===");
        double total = somarPesos(0.0);
        System.out.println("============================================");
        System.out.printf("PESO TOTAL DO VEÍCULO: %.2f kg%n", total);
    }
}