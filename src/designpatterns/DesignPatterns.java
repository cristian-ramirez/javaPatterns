package designpatterns;

import decorador.Alienware;
import decorador.Asus;
import decorador.BlueRay;
import decorador.Component;
import decorador.HP;
import decorador.SSD;
import observer.Sheep;
import observer.Shepherd;

public class DesignPatterns {

    public static void main(String[] args) {
//        Shepherd shepherd = new Shepherd();
//        
//        Sheep sheep1 = new Sheep("sheep1", shepherd);
//        Sheep sheep2 = new Sheep("sheep2", shepherd);
//        Sheep sheep3 = new Sheep("sheep3", shepherd);
//        Sheep sheep4 = new Sheep("sheep4", shepherd);
//        Sheep sheep5 = new Sheep("sheep5", shepherd);
//        
//        sheep2.hidden();
//        sheep3.hidden();
//        sheep5.hidden();
//        
//        sheep5.visible();
//        sheep2.visible();


        Component component1 = new Alienware();
        component1 = new BlueRay(component1);
        component1 = new SSD(component1);
        
        System.out.println(component1.getDescription());
        System.out.println("Price: " + component1.price());

        Component component2 = new Asus();
        component2 = new BlueRay(component2);
        component2 = new SSD(component2);
        
        System.out.println(component2.getDescription());
        System.out.println("Price: " + component2.price());
        
        Component component3 = new HP();
        component3 = new BlueRay(component3);
        component3 = new SSD(component3);
        
        System.out.println(component3.getDescription());
        System.out.println("Price: " + component3.price());
        
    }
    
}
