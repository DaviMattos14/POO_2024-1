public interface Emissor {
   void addObserver(Observer observer);
   void removeObserver(Observer observer);
   void notifyObservers();
}
