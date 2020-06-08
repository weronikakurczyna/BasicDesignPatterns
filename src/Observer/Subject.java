package Observer;

import java.util.ArrayList;

class Subject {

    protected ArrayList<Observer> observers = new ArrayList();

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void deleteObserver (Observer o) {
        observers.remove(o);
    }

    public void deleteObservers() {
        observers.clear();
    }

    public void notifyObservers() {
        for(Observer o : observers) {
            o.update(Subject.this);
        }
        System.out.println();
    }
}
