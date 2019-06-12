package part2;

public class MainList {
    public static void main(String[] args) {
        ArrayToList<Integer> listInt = new ArrayToList<>();
        listInt.convertArrayToList(new Integer[]{1,2,3,4,5});
        System.out.println("Лист чисел: ");
        listInt.printList();
        ArrayToList<String> listStr = new ArrayToList<>();
        listStr.convertArrayToList(new String[]{"aaa", "bbb", "ccc"});
        System.out.println("Лист строк: ");
        listStr.printList();
    }

}
