package decorador;

public class Asus extends Computer{

    @Override
    public String getDescription() {
        return "Asus RoG";
    }

    @Override
    public int price() {
        return 2250;
    }
    
}
