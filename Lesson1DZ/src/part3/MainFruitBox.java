package part3;

public class MainFruitBox {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>();
        for (int i = 0; i < 3; i++) {
            appleBox.addFruit(new Apple());
        }

        Box<Orange> orangeBox = new Box<>();
        for (int i = 0; i < 2; i++) {
            orangeBox.addFruit(new Orange());
        }

        appleBox.printBox();
        System.out.println();
        orangeBox.printBox();
        System.out.println();

        if (appleBox.compare(orangeBox)){
            System.out.println("The box #" + appleBox.getNumber() + " and #" + orangeBox.getNumber() + " has the same wight");
        }
        System.out.println();

        Box<Apple> appleBox2 = new Box<>();
        appleBox2.printBox();
        System.out.println();

        appleBox.putFruitsToOtherBox(appleBox2);
        appleBox.printBox();
        System.out.println();
        appleBox2.printBox();

    }
}
