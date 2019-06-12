import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import part3.ArrayOf1And4;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class ArrayOf1And4TestParams {
    private static ArrayOf1And4 array = null;

    private int[] arr;
    private boolean res;

    public ArrayOf1And4TestParams(int[] arr, boolean res) {
        this.arr = arr;
        this.res = res;
    }

    @Parameters
    public static Collection array1(){
        return Arrays.asList(new Object[][]{
                {new int[]{1,2,3,4,5},true},
                {new int[]{9,25,444,11,0,7},false},
                {new int[]{1,2,3},false},
                {new int[]{2,3,4},false},
                {new int[]{1,4,4,4,1,1,4},true}}
        );
    }

    @Before
    public void init(){
        array = new ArrayOf1And4();
    }

    @Test
    public void test() {
        Assert.assertEquals(array.checkArray(arr),res);
    }

    @After
    public void closeObject(){
        array = null;
    }
}
