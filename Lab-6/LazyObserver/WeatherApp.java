public class WeatherApp{ // Driver Class
    public static void main(String[] args){

        WeatherStation weatherStation = new WeatherStation();

        PhoneDisplay telCelular = new PhoneDisplay();

        weatherStation.setWeather("Ensolarado.");
        weatherStation.setWeather("Nublado.");
        weatherStation.setWeather("Chuvoso.");

        telCelular.display(weatherStation);
    }
}