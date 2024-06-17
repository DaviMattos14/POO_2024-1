public class WeatherApp{ // Driver Class
    public static void main(String[] args){

        WeatherStation weatherStation = new WeatherStation();

        Observer phoneDisplay = new PhoneDisplay();
        weatherStation.addObserver(phoneDisplay);

        weatherStation.setWeather("Ensolarado.");
    }
}