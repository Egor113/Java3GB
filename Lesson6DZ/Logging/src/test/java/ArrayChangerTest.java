import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import part2.ArrayChanger;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

@RunWith(value = Parameterized.class)
public class ArrayChangerTest {
    private static ArrayChanger changer = null;
    private int[] res;

    private int[] arr;

    public ArrayChangerTest(int[] arr) {
        this.arr = arr;
    }

    @Parameters
    public static int[] abracadabra() {
        return new int[]{1,2,3,4};
    }

//    @Parameters
//    public static Collection abracadabra() {
//        return Arrays.asList(new Object[][]{{
//                new int[]{1,2,3,4,5}}}
//        );
//    }

    @Test
    public void test1(){
        Assert.assertArrayEquals(changer.changeArray(arr),new int[]{5});
    }

}
