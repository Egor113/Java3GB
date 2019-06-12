package part2;

import java.util.ArrayList;
import java.util.List;

public class ArrayToList <T>{
    private List<T> list = null;

    public void convertArrayToList(T[] arr){
        List<T> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        this.list = list;
    }

    public void printList(){
        for (T element: list) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
