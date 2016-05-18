package decorador;

public class Alienware extends Computer{

    @Override
    public String getDescription() {
        return "Alienware Area51";
    }

    @Override
    public int price() {
        return 2500;
    }
    
}
