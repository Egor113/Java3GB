package part3;

public class ArrayOf1And4 {

    public boolean checkArray(int[] arr){
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1 || arr[i] == 4){
                flag = true;
            }
        }
        return flag;
    }

}
