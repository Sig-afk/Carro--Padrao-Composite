public class Carro {
    private Carroceria carroceria;
    private Chassi chassi;

    public Carro() {
        this.carroceria = new Carroceria();
        this.chassi = new Chassi();
    }

    public void calcularPesoTotal() {
        System.out.println("=== Início do cálculo do peso do veículo ===");
        double total = 0;

        // Contabiliza Carroceria
        total = carroceria.somarPesos(total);

        // Contabiliza Chassi (que inclui Trem de Força e Suspensão)
        total = chassi.somarPesos(total);

        System.out.println("============================================");
        System.out.printf("PESO TOTAL DO VEÍCULO: %.2f kg%n", total);
    }
}