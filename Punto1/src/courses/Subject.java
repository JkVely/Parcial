package courses;

import observers.Observer;

public interface Subject {
    public void register(Observer observer);
    public void delete(Observer observer);
    public void notifyObservers();
}
