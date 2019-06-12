import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import part2.ArrayChanger;

import java.util.Arrays;

public class ArrayChangerTest {
    private static ArrayChanger changer;

    @BeforeClass
    public static void init(){
        System.out.println("init changer");
        changer = new ArrayChanger();
    }

    @Test
    public void test1(){
        //Assert.assertArrayEquals(new int[]{1,2,3,4,5},new int[]{5});
        Assert.assertArrayEquals(changer.changeArray(new int[]{1,2,3,4,5}),new int[]{5});
    }

    @Test
    public void test2(){
        Assert.assertArrayEquals(changer.changeArray(new int[]{1,2,4,98,5,47,6,4,25,0,7}),new int[]{25,0,7});
    }

    @Test(expected = RuntimeException.class)
    public void test3(){
        changer.changeArray(new int[]{5,78,44,247,5});
    }

    @Test(expected = RuntimeException.class)
    public void test4(){
        changer.changeArray(new int[]{4,4,4,4,4,4,4,4,4});
    }

    @Test(expected = RuntimeException.class)
    public void test5(){
        changer.changeArray(new int[]{15,4,89,6,78,2,4});
    }
}
