package homeWork06.arrayUtilsPack;

/*
TASK 1
Create ArraysUtils with following methods
sum(int array[])
min(int array[])
max(int array[])
maxPositive(int array[])
multiplication  (int array[])
modulus(int array[])
secondLargest(int array[])

these should be just copied from your HW2.

In addition add new methods

int[] reverse(int[] array)
int[] findEvenElements(int[] array)

*/

import java.util.Arrays;

public final class ArrayUtils {

    public static int[] reverse(int[] array){
        if (array == null || array.length == 0) return null;

        int[] r = new int[array.length];
        for (int i = 0; i < r.length; i++) {
            r[i] = array[array.length - 1 - i ];
        }
        return r;
    }

    public static int[] findEvenElements(int[] array){
        if (array == null || array.length == 0) return null;

        int evenCount = 0;
        int[] even = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if ((array[i] % 2) == 0) {
                evenCount++;
                even[evenCount-1] = array[i];
            }
        }
        return Arrays.copyOf(even, evenCount);
    }


    public static int sum(int array[]){
        int sum=0;

        for (int anArray : array) {
            sum += anArray;
        }
        return sum;
    }

    public static int min(int array[]){
        int minimum = array[0];

        for (int anArray : array) {
            if (minimum > anArray) {
                minimum = anArray;
            }
        }
        return minimum;
    }

    public static int max(int array[]){
        int maximum = array[0];

        for (int anArray : array) {
            if (maximum < anArray) {
                maximum = anArray;
            }
        }
        return maximum;
    }

    public static int maxPositive(int array[]){
        int max_positive = 0;

        for (int anArray : array) {
            if (max_positive < anArray) {
                max_positive = anArray;
            }
        }
        return max_positive;
    }

    public static int multiplication(int array[]){
        int multip = 1;

        for (int anArray : array) {
            multip *= anArray;
        }
        return multip;
    }

    public static int modulus(int array[]) throws InvalidValueException {
        if (array[array.length - 1] == 0){throw new InvalidValueException("Division by 0");}
        return array[0] % array[array.length - 1];
    }

    public static int secondLargest(int array[]){
        int firstMax = array[0];
        int secondMax = array[0];

        for (int anArray : array) {
            if (firstMax < anArray) {
                firstMax = anArray;
            } else if (secondMax < anArray) {
                secondMax = anArray;
            }
        }
        return secondMax;
    }

    public static double[] reverse(double[] array){
        double[] r = new double[array.length];
        for (int i = 0; i < r.length; i++) {
            r[i] = array[array.length - 1 - i ];
        }
        return r;
    }

    public static double[] findEvenElements(double[] array){
        int evenCount = 0;
        double[] even = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            if ((array[i] % 2) == 0) {
                evenCount++;
                even[evenCount-1] = array[i];
            }
        }
        return Arrays.copyOf(even, evenCount);
    }

    public static double sum(double[] array){
        double sum = 0;

        for (double anArray : array) {
            sum += anArray;
        }
        return sum;
    }

    public static double min(double[] array){
        double minimum = array[0];

        for (double anArray : array) {
            if (minimum > anArray) {
                minimum = anArray;
            }
        }
        return minimum;
    }

    public static double max(double[] array){
        double maximum = array[0];

        for (double anArray : array) {
            if (maximum < anArray) {
                maximum = anArray;
            }
        }
        return maximum;
    }

    public static double maxPositive(double[] array){
        double max_positive = 0;

        for (double anArray : array) {
            if (max_positive < anArray) {
                max_positive = anArray;
            }
        }
        return max_positive;
    }

    public static double multiplication(double[] array){
        double multip = 1;

        for (double anArray : array) {
            multip *= anArray;
        }
        return multip;
    }

    public static double modulus(double[] array){
        return array[0] % array[array.length - 1];
    }

    public static double secondLargest(double[] array){
        double firstMax = array[0];
        double secondMax = array[0];

        for (double anArray : array) {
            if (firstMax < anArray) {
                firstMax = anArray;
            } else if (secondMax < anArray) {
                secondMax = anArray;
            }
        }
        return secondMax;
    }
}
