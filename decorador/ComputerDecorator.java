package decorador;

public abstract class ComputerDecorator implements Component{
    private Component component;
    
    public ComputerDecorator(Component component){
        setComponent(component);
    }

    public Component getComponent() {
        return component;
    }

    public void setComponent(Component component) {
        this.component = component;
    }
    
}
