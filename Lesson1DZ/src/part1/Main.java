package part1;

public class Main {
    public static void main(String[] args) {
        ArrayChanger<Integer> intChanger = new ArrayChanger<Integer>(new Integer[]{1,2,3,4,5});
        System.out.println("Исходный массив чисел");
        intChanger.printArray();
        intChanger.changeArray(2,4);
        System.out.println("Измененный массив чисел");
        intChanger.printArray();
        System.out.println();
        System.out.println("Исходный массив строк");
        ArrayChanger<String> strChanger = new ArrayChanger<String>(new String[]{"aaa","bbb","ccc","ddd","fff"});
        strChanger.printArray();
        strChanger.changeArray("aaa","bbb");
        System.out.println("Изменный массив строк");
        strChanger.printArray();

    }
}
