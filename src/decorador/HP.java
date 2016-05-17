package decorador;

public class HP extends Computer{

    @Override
    public String getDescription() {
        return "HP Pavilion";
    }

    @Override
    public int price() {
        return 1800;
    }
    
}
