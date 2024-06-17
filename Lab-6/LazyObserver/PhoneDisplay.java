public class PhoneDisplay implements LazyObserver{
    private String weather;

    @Override
    public void update(String weather){
        this.weather = weather;
    }

    @Override
    public void solicitarUpdate(Emissor e){
        e.notifyObservers(this);
    }
    public void display(Emissor emissor){
        solicitarUpdate(emissor);
        System.out.println("Celular: tempo atualizado - " + weather);
    } 
}