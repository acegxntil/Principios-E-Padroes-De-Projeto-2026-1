package questao3;

import java.util.ArrayList;
import java.util.List;

// A CET é o "Subject" do padrão Observer.
// Ela guarda o estado e notifica todos os observers quando algo muda.
public class CentralEstacaoTempo implements Observable {

    private List<Observer> observers = new ArrayList<>();

    private double temperatura;
    private double umidade;
    private double velocidadeVento;

    @Override
    public void registrarObserver(Observer observer) {
        observers.add(observer);
        System.out.println("Observer registrado: " + observer.getClass().getSimpleName());
    }

    @Override
    public void removerObserver(Observer observer) {
        observers.remove(observer);
        System.out.println("Observer removido: " + observer.getClass().getSimpleName());
    }

    @Override
    public void notificarObservers() {
        for (Observer observer : observers) {
            observer.atualizar(temperatura, umidade, velocidadeVento);
        }
    }

    // Quando novos dados chegam, atualiza e notifica todos
    public void setMedicoes(double temperatura, double umidade, double velocidadeVento) {
        System.out.printf("%n[CET] Novos dados coletados -> Temp: %.1f°C | Umidade: %.1f%% | Vento: %.1f km/h%n",
                temperatura, umidade, velocidadeVento);
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.velocidadeVento = velocidadeVento;
        notificarObservers();
    }
}
