package homeWork06.arrayUtilsPack;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

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
        double[] dAr = {};
        Assert.assertNull(ArrayUtils.reverse(array));
        Assert.assertNull(ArrayUtils.reverse(dAr));

        Assert.assertNull(ArrayUtils.findEvenElements(array));
        Assert.assertNull(ArrayUtils.findEvenElements(dAr));

        try{ArrayUtils.modulus(array);}
        catch (InvalidValueException e){System.out.println("Invalid value error " + e);}
        try{ArrayUtils.max(array);}
        catch (InvalidValueException e){System.out.println("Invalid value error " + e);}
        try{ArrayUtils.min(array);}
        catch (InvalidValueException e){System.out.println("Invalid value error " + e);}
        try{ArrayUtils.sum(array);}
        catch (InvalidValueException e){System.out.println("Invalid value error " + e);}
        try{ ArrayUtils.multiplication(array);}
        catch (InvalidValueException e){System.out.println("Invalid value error " + e);}
        try{ArrayUtils.secondLargest(array);}
        catch (InvalidValueException e){System.out.println("Invalid value error " + e);}

        try{ArrayUtils.modulus(dAr);}
        catch (InvalidValueException e){System.out.println("Invalid value error " + e);}
        try{ArrayUtils.max(dAr);}
        catch (InvalidValueException e){System.out.println("Invalid value error " + e);}
        try{ArrayUtils.min(dAr);}
        catch (InvalidValueException e){System.out.println("Invalid value error " + e);}
        try{ArrayUtils.sum(dAr);}
        catch (InvalidValueException e){System.out.println("Invalid value error " + e);}
        try{ArrayUtils.multiplication(dAr);}
        catch (InvalidValueException e){System.out.println("Invalid value error " + e);}
        try{ArrayUtils.secondLargest(dAr);}
        catch (InvalidValueException e){System.out.println("Invalid value error " + e);}
    }

    @Test
    public void reverse() throws Exception {
        Assert.assertEquals(10, ArrayUtils.reverse(intArray)[0]);
    }

    @Test
    public void findEvenElements() throws Exception {
        Assert.assertEquals(6, ArrayUtils.findEvenElements(intArray).length);
    }

    @Test
    public void findEvenElementsdouble() throws Exception {
        Assert.assertEquals(1, ArrayUtils.findEvenElements(doubleArray).length);
    }

    @Test
    public void sum() throws Exception {
        Assert.assertEquals(6916, ArrayUtils.sum(intArray));

    }

    @Test
    public void min() throws Exception {
        Assert.assertTrue( Double.compare(-125, ArrayUtils.min(doubleArray))==0);
        Assert.assertEquals(-125, ArrayUtils.min(intArray));
    }

    @Test
    public void max() throws Exception {
        Assert.assertTrue(Double.compare( 3258.1, ArrayUtils.max(doubleArray)) == 0);
        Assert.assertEquals(3258, ArrayUtils.max(intArray));

    }

    @Test
    public void maxPositive() throws Exception {
        Assert.assertEquals(3258, ArrayUtils.maxPositive(intArray));
        Assert.assertTrue(Double.compare(3258.1, ArrayUtils.maxPositive(doubleArray))==0);
    }

    @Test
    public void multiplication() throws Exception {
        try{
            int i = ArrayUtils.multiplication(intArray);
        }
        catch (InvalidValueException e) {
            System.out.println(e);
        }
    }

    @Test
    public void modulus() throws Exception {
        Assert.assertEquals(5, ArrayUtils.modulus(intArray));
    }

    @Test
    public void secondLargest() throws Exception {
        Assert.assertTrue(Double.compare(3258.1, ArrayUtils.secondLargest(doubleArray))==0);
    }

    @Test
    public void reverse1() throws Exception {
        Assert.assertTrue(Double.compare(4,ArrayUtils.reverse(doubleArray)[0]) == 0 );
    }

    @Test
    public void findEvenElements1() throws Exception {
        Assert.assertEquals(1, ArrayUtils.findEvenElements(doubleArray).length);
    }

    @Test
    public void sum1() throws Exception {
        Assert.assertTrue(Double.compare(6665.905, ArrayUtils.sum(doubleArray)) == 0);
    }

    @Test
    public void min1() throws Exception {
        Assert.assertTrue(Double.compare(-125, ArrayUtils.min(doubleArray)) == 0);

    }

    @Test
    public void max1() throws Exception {
        Assert.assertTrue(Double.compare(ArrayUtils.max(doubleArray), 3258.1) == 0);
    }

    @Test
    public void maxPositive1() throws Exception {
        Assert.assertTrue(Double.compare(ArrayUtils.maxPositive(doubleArray), 3258.1) == 0);
    }

    @Test
    public void multiplication1() throws Exception {
        Assert.assertTrue(Double.compare(ArrayUtils.multiplication(doubleArray), -156078051440309.0178471) == 0);
    }

    @Test
    public void modulus1() throws Exception {
        Assert.assertTrue(Double.compare(ArrayUtils.modulus(doubleArray),2.2) == 0);
    }

    @Test
    public void secondLargest1() throws Exception {
        Assert.assertTrue(Double.compare(ArrayUtils.secondLargest(doubleArray), 3258.1) == 0);
    }

}