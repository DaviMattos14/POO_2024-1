public interface LazyObserver{
    void update(String weather);
    void solicitarUpdate(Emissor emissor);
}