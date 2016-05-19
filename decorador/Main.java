/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorador;

public class Main {
     public static void main(String[] args) {
        System.out.println("========== Alienware ==========");
        Component component1 = new Alienware();
        component1 = new BlueRay(component1);
        component1 = new SSD(component1);
        
        System.out.println(component1.getDescription());
        System.out.println("Price: " + component1.price());
        System.out.println("================================");
        
        System.out.println("============= Asus =============");
        Component component2 = new Asus();
        component2 = new BlueRay(component2);
        component2 = new SSD(component2);
        
        System.out.println(component2.getDescription());
        System.out.println("Price: " + component2.price());
        System.out.println("================================");
        
        System.out.println("============== HP ==============");
        Component component3 = new HP();
        component3 = new BlueRay(component3);
        component3 = new SSD(component3);
        
        System.out.println(component3.getDescription());
        System.out.println("Price: " + component3.price());
        System.out.println("================================");
    }
}
