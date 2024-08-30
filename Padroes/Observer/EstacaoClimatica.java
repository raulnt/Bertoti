import java.util.ArrayList;
import java.util.List;

// Classe Sujeito Concreto
public class EstacaoClimatica implements Subject {
    private List<Observer> observadores;
    private float temperatura;

    public EstacaoClimatica() {
        observadores = new ArrayList<>();
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
        notificarObservadores();
    }

    @Override
    public void adicionarObservador(Observer o) {
        observadores.add(o);
    }

    @Override
    public void removerObservador(Observer o) {
        observadores.remove(o);
    }

    @Override
    public void notificarObservadores() {
        for (Observer o : observadores) {
            o.atualizar(temperatura);
        }
    }
}
