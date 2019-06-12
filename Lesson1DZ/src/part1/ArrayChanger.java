package part1;

public class ArrayChanger<T>{
    private T[] array;

    public ArrayChanger(T[] array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public void changeArray(T element1, T element2){
        boolean flag1 = false;
        boolean flag2 = false;
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(element1)){
                index1 = i;
                flag1 = true;
            }
            if (array[i].equals(element2)){
                index2 = i;
                flag2 = true;
            }
        }
        changeElemets(element1,element2,index1,index2);
        if (!(flag1 && flag2)){
            System.out.println("Один из элементов не найден");
        }
    }

    public void changeElemets(T element1, T element2, int index1, int index2){
        array[index1] = element2;
        array[index2] = element1;
    }

    public void printArray(){
        for (T i:array ) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
