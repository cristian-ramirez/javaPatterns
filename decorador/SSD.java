package decorador;

public class SSD extends ComputerDecorator{

    public SSD(Component component) {
        super(component);
    }

    @Override
    public String getDescription() {
        return getComponent().getDescription() + " + SSD";
    }

    @Override
    public int price() {
        return getComponent().price() + 500;
    }
    
}
