public class WeatherStation implements Emissor{ // Uma solução par não esquecermos de implementar os metodos de um observer
    private String weather;

    @Override
    public void notifyObservers(LazyObserver observer) {
        observer.update(weather);
    }

    public void setWeather(String newWeather){
        this.weather = newWeather;
    }
}
