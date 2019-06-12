import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import part2.ArrayChanger;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class ArrayChangerTestParams {
    private static ArrayChanger changer = null;
    private int[] res;

    private int[] arrNormal;
    private int[] arrExcept;

    public ArrayChangerTestParams(int[] arrNormal, int[] arrExcept, int[] res) {
        this.arrNormal = arrNormal;
        this.arrExcept = arrExcept;
        this.res = res;
    }

    @Before
    public void init() {
        System.out.println("init changer");
        changer = new ArrayChanger();
    }


    @Parameters
    public static Collection array1() {
        return Arrays.asList(new Object[][]{
                {new int[]{1,2,3,4,5},new int[]{4,4,4,4,4},new int[]{5}},
                {new int[]{4,58,44,9,6,4,25,78,9,5},new int[]{1,2,3,4},new int[]{25,78,9,5}},
                {new int[]{4,25,100,9,2},new int[]{9,25,8,7,2,3,5},new int[]{25,100,9,2}}}
        );
    }

    @Test()
    public void changeArrayNormal(){
        Assert.assertArrayEquals(changer.changeArray(arrNormal),res);
    }

    @Test(expected = RuntimeException.class)
    public void changeArrayException(){
        Assert.assertArrayEquals(changer.changeArray(arrExcept),res);
    }

    @After
    public void closeObject(){
        changer = null;
    }

}
