package decorador;

public class BlueRay extends ComputerDecorator{

    public BlueRay(Component component) {
        super(component);
    }
    
    @Override
    public String getDescription() {
        return getComponent().getDescription() + " + BlueRay";
    }

    @Override
    public int price() {
        return getComponent().price() + 300;
    }
    
}
