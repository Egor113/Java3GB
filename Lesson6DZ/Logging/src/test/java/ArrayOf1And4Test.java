import org.junit.After;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import part3.ArrayOf1And4;

public class ArrayOf1And4Test {
    private static ArrayOf1And4 array;

    @BeforeClass
    public static void init(){
        System.out.println("init array");
        array = new ArrayOf1And4();
    }

    @Test
    public void test1() {
        Assert.assertEquals(array.checkArray(new int[]{1,2,3,4,5,6,7}),true);
    }

    @Test
    public void test2() {
        Assert.assertEquals(array.checkArray(new int[]{1,2,3}),false);
    }

    @Test
    public void test3() {
        Assert.assertEquals(array.checkArray(new int[]{2,3,4}),false);
    }

    @Test
    public void test4() {
        Assert.assertEquals(array.checkArray(new int[]{1,1,1,4,4,4,4}),true);
    }

}
