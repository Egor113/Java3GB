package part3;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    List<T> listOfFruits = null;

    public Box() {
        this.listOfFruits = new ArrayList<>();
    }

    public void addFruit(T fruit){
        listOfFruits.add(fruit);
    }
}
