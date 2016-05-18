package observer;

public class Main {
    public static void main(String[] args) {
        Shepherd shepherd = new Shepherd();
        
        Sheep sheep1 = new Sheep("sheep1", shepherd);
        Sheep sheep2 = new Sheep("sheep2", shepherd);
        Sheep sheep3 = new Sheep("sheep3", shepherd);
        Sheep sheep4 = new Sheep("sheep4", shepherd);
        Sheep sheep5 = new Sheep("sheep5", shepherd);
        
        sheep2.hidden();
        sheep3.hidden();
        sheep5.hidden();
        
        sheep5.visible();
        sheep2.visible();
        
    }
}
