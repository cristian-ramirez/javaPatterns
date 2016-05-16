package observer;

public class Sheep implements Observer{
    private String sheepName;
    private Subject shepherd;

    public Sheep(String sheepName, Subject shepherd) {
        this.sheepName = sheepName;
        this.shepherd = shepherd;
        
        shepherd.registerObserver(this);
    }
    
    @Override
    public void update(String status) {
        System.out.println(status + " to " + sheepName);
    }
    
    public void hidden() {
        this.shepherd.removeObserver(this);
    }
    
    public void visible() {
        this.shepherd.registerObserver(this);
    }
    
    public String getSheepName() {
        return sheepName;
    }

    public void setSheepName(String sheepName) {
        this.sheepName = sheepName;
    }
}
