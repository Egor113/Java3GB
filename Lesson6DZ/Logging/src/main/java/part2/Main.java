package part2;

public class Main {
    public static void main(String[] args) {
        ArrayChanger arrayChanger = new ArrayChanger();
        arrayChanger.printArray(new int[]{1,2,3,4,5});
        System.out.println();
        arrayChanger.printArray(new int[]{1,4,3,10,5,4,8,7});
        System.out.println();
        arrayChanger.printArray(new int[]{1,3,10,5,8,4});
    }
}
