import java.util.ArrayList;
import java.util.List;

public class ParteComposta implements ComponenteCarro {
    private String nome;
    private List<ComponenteCarro> partes;

    public ParteComposta(String nome) {
        this.nome = nome;
        this.partes = new ArrayList<>();
    }

    public void adicionar(ComponenteCarro parte) {
        this.partes.add(parte);
    }

    public void remover(ComponenteCarro parte) {
        this.partes.remove(parte);
    }

    public List<ComponenteCarro> getPartes() {
        return partes;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double somarPesos(double totalAtual) {
        for (ComponenteCarro parte : partes) {
            totalAtual = parte.somarPesos(totalAtual);
        }
        return totalAtual;
    }
}
