package main.java.mihail_metel.homeWork06.arrayUtilsPack;

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

    private ArrayUtils() {
    }

    public static int[] reverse(int[] array){
        if (array == null || array.length == 0) {return null;}

        int[] r = new int[array.length];
        for (int i = 0; i < r.length; i++) {
            r[i] = array[array.length - 1 - i ];
        }
        return r;
    }

    public static int[] findEvenElements(int[] array){
        if (array == null || array.length == 0) {return null;}

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


    public static int sum(int array[]) throws InvalidValueException {
        if (array == null || array.length == 0) {throw new InvalidValueException("Sum-null");}

        int sum=0;
        for (int anArray : array) {
            sum += anArray;
        }
        return sum;
    }

    public static int min(int array[]) throws InvalidValueException {
        if (array == null || array.length == 0) {throw new InvalidValueException("min-null");}

        int minimum = array[0];
        for (int anArray : array) {
            if (minimum > anArray) {
                minimum = anArray;
            }
        }
        return minimum;
    }

    public static int max(int array[]) throws InvalidValueException {
        if (array == null || array.length == 0) {throw new InvalidValueException("max-null");}

        int maximum = array[0];
        for (int anArray : array) {
            if (maximum < anArray) {
                maximum = anArray;
            }
        }
        return maximum;
    }

    public static int maxPositive(int array[]) throws InvalidValueException {
        if (array == null || array.length == 0) {throw new InvalidValueException("maxpositive-null");}

        int max_positive = 0;
        for (int anArray : array) {
            if (max_positive < anArray) {
                max_positive = anArray;
            }
        }
        return max_positive;
    }

    public static int multiplication(int array[]) throws InvalidValueException {
        if (array == null || array.length == 0) {throw new InvalidValueException("multiplication-null");}

        //int multip = 1;
        long multip = 1;
        long minInt = -2147483648;
        long maxInt  = 2147483647;
        for (int anArray : array) {
            multip *= anArray;
            if (multip > maxInt || multip < minInt) {throw new InvalidValueException("Int overflow in multiplication");}
        }
        return (int)multip;
    }

    public static int modulus(int array[]) throws InvalidValueException {
        if (array == null || array.length == 0) {throw new InvalidValueException("modulus-null");}
        if (array[array.length - 1] == 0){throw new InvalidValueException("modulus-null, div by 0");}

        return array[0] % array[array.length - 1];
    }

    public static int secondLargest(int array[]) throws InvalidValueException {
        if (array == null || array.length == 0) {throw new InvalidValueException("Second largest-null");}

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
        if (array == null || array.length == 0) return null;

        double[] r = new double[array.length];
        for (int i = 0; i < r.length; i++) {
            r[i] = array[array.length - 1 - i ];
        }
        return r;
    }

    public static double[] findEvenElements(double[] array){
        if (array == null || array.length == 0) return null;

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

    public static double sum(double[] array) throws InvalidValueException {
        if (array == null || array.length == 0) {throw new InvalidValueException("sum-null");}

        double sum = 0;
        for (double anArray : array) {
            sum += anArray;
        }
        return sum;
    }

    public static double min(double[] array) throws InvalidValueException {
        if (array == null || array.length == 0) {throw new InvalidValueException("min-null");}

        double minimum = array[0];
        for (double anArray : array) {
            if (minimum > anArray) {
                minimum = anArray;
            }
        }
        return minimum;
    }

    public static double max(double[] array) throws InvalidValueException {
        if (array == null || array.length == 0) {throw new InvalidValueException("max-null");}

        double maximum = array[0];
        for (double anArray : array) {
            if (maximum < anArray) {
                maximum = anArray;
            }
        }
        return maximum;
    }

    public static double maxPositive(double[] array) throws InvalidValueException {
        if (array == null || array.length == 0) {throw new InvalidValueException("maxPositive-null");}

        double max_positive = 0;
        for (double anArray : array) {
            if (max_positive < anArray) {
                max_positive = anArray;
            }
        }
        return max_positive;
    }

    public static double multiplication(double[] array) throws InvalidValueException {
        if (array == null || array.length == 0) {throw new InvalidValueException("multiplication-null");}

        double multip = 1;
        for (double anArray : array) {
            multip *= anArray;
        }
        return multip;
    }

    public static double modulus(double[] array) throws InvalidValueException {
        if (array == null || array.length == 0) {throw new InvalidValueException("modulus-Null");}
        if (array[array.length - 1] == 0){throw new InvalidValueException("modulus-div by 0");}

        return array[0] % array[array.length - 1];
    }

    public static double secondLargest(double[] array) throws InvalidValueException {
        if (array == null || array.length == 0) {throw new InvalidValueException("secondLaNull");}

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
