package part3;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> listOfFruits = null;
    private double sumWeight;
    private String name;
    public static int numbers;
    private int number;

    public Box() {
        this.listOfFruits = new ArrayList<>();
        numbers++;
        this.number = numbers;
        this.name = "The box";
    }

    public List<T> getListOfFruits() {
        return listOfFruits;
    }

    public double getSumWeight() {
        return sumWeight;
    }

    public int getNumber() {
        return number;
    }

    public void addFruit(T fruit){
        listOfFruits.add(fruit);
        sumWeight += fruit.weight;
        if (name.equals("The box")){
            name += " of " + fruit.name + "s";
        }
    }

    public boolean compare(Box anotherBox){
        if (this.sumWeight == anotherBox.sumWeight){
            return true;
        }
        else return false;
    }

    public void putFruitsToOtherBox(Box<T> anotherBox){
        for (int i = 0; i < listOfFruits.size(); i++) {
            anotherBox.addFruit(listOfFruits.get(i));
        }
        listOfFruits.clear();
        sumWeight = 0;
    }

    public void printBox(){
        System.out.println(name + " consists of " + listOfFruits.size() + " fruits");
        System.out.println("The box #" + number + " is " + sumWeight + " kg");
    }
}
