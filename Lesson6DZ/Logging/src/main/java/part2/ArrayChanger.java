/*
2. Написать метод, которому в качестве аргумента передается не пустой одномерный целочисленный массив.
   Метод должен вернуть новый массив, который получен путем вытаскивания
   из исходного массива элементов, идущих после последней четверки.
   Входной массив должен содержать хотя бы одну четверку, иначе в методе
   необходимо выбросить RuntimeException. Написать набор тестов для этого метода
   (по 3-4 варианта входных данных). Вх: [ 1 2 4 4 2 3 4 1 7 ] -> вых: [ 1 7 ].
 */

package part2;

import java.util.ArrayList;
import java.util.List;

public class ArrayChanger {

    public int[] changeArray(int[] arr){
        List<Integer> indexes = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4){
                indexes.add(i);
            }
        }
        if (indexes.isEmpty()){
            throw new RuntimeException("Нет четверок");
        }
        else if(indexes.get(indexes.size()-1) == arr.length-1){
            throw new RuntimeException("После последней четверки нет символов");
        }
        int destArrSize = arr.length - indexes.get(indexes.size()-1)-1;
        int[] destArr = new int[destArrSize];
        System.arraycopy(arr,indexes.get(indexes.size()-1)+1,destArr,0,destArrSize);
        return destArr;
    }

    public void printArray(int[] arr){
        for (int i = 0; i < changeArray(arr).length; i++) {
            System.out.print(changeArray(arr)[i] + " ");
        }
    }
}
