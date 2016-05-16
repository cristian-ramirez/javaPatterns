package observer;

import java.util.ArrayList;

public class Shepherd implements Subject{
    private ArrayList sheeps;
    private String status;
    
    public Shepherd() {
        sheeps = new ArrayList();
    }
    
    @Override
    public void registerObserver(Observer o) {
        sheeps.add(o);
        this.notifyObserver("watching", o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = sheeps.indexOf(o);
        
        this.notifyObserver("not watching", o);
        
        if (i >= 0) {
            sheeps.remove(i);
        }
    }

    @Override
    public void notifyObserver(String status, Observer o) {
        o.update("The sheperd is " + status);
    }
    
}
