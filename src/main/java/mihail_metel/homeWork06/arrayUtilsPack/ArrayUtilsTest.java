package homeWork06.arrayUtilsPack;

import org.junit.Assert;
import org.junit.Test;

public class ArrayUtilsTest {

    int[] intArray = new int[]{
            15,
            6,
            10,
            125,
            358,
            3258,
            1,
            3258,
            -125,
            10};

    double[] doubleArray = new double[]{
            10.2,
            6.5,
            1.2,
            250.365,
            3258.1,
            1.11,
            1.33,
            3258.1,
            -125,
            4};

    @Test
    public void nullTest() throws Exception {
        int[] array = {};
        ArrayUtils.reverse(array);
        ArrayUtils.modulus(array);
        ArrayUtils.max(array);
        ArrayUtils.min(array);
        //ArrayUtils.
    }

    @Test
    public void reverse() throws Exception {
        Assert.assertEquals(4,ArrayUtils.reverse(doubleArray)[0]);

    }

    @Test
    public void findEvenElements() throws Exception {

    }

    @Test
    public void sum() throws Exception {

    }

    @Test
    public void min() throws Exception {

    }

    @Test
    public void max() throws Exception {

    }

    @Test
    public void maxPositive() throws Exception {

    }

    @Test
    public void multiplication() throws Exception {

    }

    @Test
    public void modulus() throws Exception {

    }

    @Test
    public void secondLargest() throws Exception {

    }

    @Test
    public void reverse1() throws Exception {

    }

    @Test
    public void findEvenElements1() throws Exception {

    }

    @Test
    public void sum1() throws Exception {

    }

    @Test
    public void min1() throws Exception {

    }

    @Test
    public void max1() throws Exception {

    }

    @Test
    public void maxPositive1() throws Exception {

    }

    @Test
    public void multiplication1() throws Exception {

    }

    @Test
    public void modulus1() throws Exception {

    }

    @Test
    public void secondLargest1() throws Exception {

    }

}