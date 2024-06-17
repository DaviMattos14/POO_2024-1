import java.util.ArrayList;

public class WeatherStation implements Emissor{ // Uma solução par não esquecermos de implementar os metodos de um observer
    private ArrayList<Observer> observers = new ArrayList<>();
    private String weather;

    @Override
    public void addObserver(Observer observer){
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(){
        for (Observer observer : observers){
            observer.update(weather);
        }
    }

    public void setWeather(String newWeather){
        this.weather = newWeather;
        notifyObservers();
    }
}
