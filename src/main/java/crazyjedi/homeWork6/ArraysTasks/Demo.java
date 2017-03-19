package crazyjedi.homeWork6.ArraysTasks;

import java.util.Arrays;


/**
 * Created by Vlad on 05.03.2017.
 */
public class Demo {
    public static void main(String[] args) {
        int[] array = new int[] {1,2,3,4,5};
        int[] newArray = ArraysUtils.reverse(array);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(newArray));

        int[] evenIndexElements = ArraysUtils.findEvenIndexElements(array);
        System.out.println(Arrays.toString(evenIndexElements));

        int[] evenElements = ArraysUtils.findEvenElements(array);
        System.out.println(Arrays.toString(evenElements));
        
        System.out.println("\nINT\n");
        System.out.println(ArraysUtils.sum(array));
        System.out.println(ArraysUtils.min(array));
        System.out.println(ArraysUtils.max(array));
        System.out.println(ArraysUtils.maxPositive(array));
        System.out.println(ArraysUtils.multiplication(array));
        System.out.println(ArraysUtils.modulus(array));
        System.out.println(ArraysUtils.secondLargest(array));

        
    }
}
