package dima_slav.homework06;

import java.util.Arrays;

public class ArraysMain {
    public static void main(String[] args) {
        int array[] = {36, 21, 24, 65, -10, -21, -14, 33, 26, 10};
        int [] newArray = ArrayUtils.reverse(array);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(newArray));

        int[] evenElements = ArrayUtils.findEvenElements(array);
        System.out.println(Arrays.toString(evenElements));

        System.out.println("The sum of array elements = " + ArrayUtils.sum(array));
        System.out.println("The smallest number of array = " + ArrayUtils.min(array));
        System.out.println("The largest number of array = " + ArrayUtils.max(array));
        System.out.println("The maximal positive number of array = " + ArrayUtils.maxPositive(array));
        System.out.println("The multiplication result of array elements = " + ArrayUtils.multiplication(array));
        System.out.println("The modulus result of first and last elements of array = " + ArrayUtils.modulus(array));
        System.out.println("The second largest element of array = " + ArrayUtils.secondLargest(array));

    }
}
