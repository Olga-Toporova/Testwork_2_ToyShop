import java.util.ArrayList;


public class ToyShop {
    public static void lottery(ArrayList<Toy> toys) {
        double weight = 0.0;
        for (Toy toy : toys){
            weight += toy.getWeight();
        }
        double rand = Math.random() * weight;
        double countWeight = 0.0;
        for (Toy toy : toys) {
            countWeight += toy.getWeight();
            if (countWeight >= rand){
                System.out.println(toy);
                break;
            }
        }
    }
}
