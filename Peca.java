public class Peca implements ComponenteCarro {
    private String nome;
    private double peso;

    public Peca(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    @Override
    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }

    @Override
    public double somarPesos(double totalAtual) {
        totalAtual += this.peso;
        System.out.printf("Somando agora o peso de %s: %.2f kg. Total parcial: %.2f kg%n",
                this.nome, this.peso, totalAtual);
        return totalAtual;
    }
}
