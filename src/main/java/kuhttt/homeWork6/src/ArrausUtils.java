/**
 * Created by Asus on 30.03.2017.
 */
public final class ArrausUtils {

    private ArrausUtils() {
    }

    public static int max(int[] array){
        if (array.length == 0 || array == null) {
            throw new IllegalArgumentException ("Array is empty!");
        }
        int max = 0;
        for (int element : array) {
            if (element > max) {
                max = element;
            }
        }
        return max;
    }

    public static double max(double[] array){
        if (array.length == 0 || array == null) {
            throw new IllegalArgumentException ("Array is empty!");
        }
        double max = array[0];
        for (double element : array) {
            if (element > max) {
                max = element;
            }
        }
        return max;
    }

    public static int min(int[] array) {
        if (array.length == 0 || array == null) {
            throw new IllegalArgumentException ("Array is empty!");
        }
        int min = array[0];
        for (int element : array) {
            if (element < min)
                min = element;
        }
        return min;
    }

    public static double min(double[] array){
        if (array.length == 0 || array == null) {
            throw new IllegalArgumentException ("Array is empty!");
        }
        double min = 0;
        for (double element : array) {
            if (element < min)
                min = element;
        }
        return min;
    }

    public static int sum(int[] array){
        if (array.length == 0 || array == null) {
            throw new IllegalArgumentException ("Array is empty!");
        }
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        return sum;
    }

    public static double sum(double[] array){
        if (array.length == 0 || array == null) {
            throw new IllegalArgumentException ("Array is empty!");
        }
        double sum = 0;
        for (double element : array) {
            sum += element;
        }
        return sum;
    }

    public static int maxPositive(int[] array){
        if (array.length == 0 || array == null) {
            throw new IllegalArgumentException ("Array is empty!");
        }
        int max = array[0];
        for (int element : array) {
            if (element > 0 && max < element) {
                max = element;
            }
        }
        return max;
    }

    public static double maxPositive(double[] array) {
        if (array.length == 0 || array == null) {
            throw new IllegalArgumentException ("Array is empty!");
        }
        double max = array[0];
        for (double element : array) {
            if (element > 0 && max < element)
                max = element;
        }
        return max;
    }

    public static int multiplication(int[] array){
        if (array.length == 0 || array == null) {
            throw new IllegalArgumentException ("Array is empty!");
        }
        int mult = array[0];
        for(int i = 1; i < array.length; i++){
            mult *= array[i];
        }
        return mult;
    }

    public static double multiplication(double[] array){
        if (array.length == 0 || array == null) {
            throw new IllegalArgumentException ("Array is empty!");
        }
        double mult = array[0];
        for(int i = 1; i < array.length; i++){
            mult *= array[i];
        }
        return mult;
    }

    public static int modulus(int[] array){
        if (array.length == 0 || array == null) {
            throw new IllegalArgumentException ("Array is empty!");
        }
        if (array[array.length-1]==0) {
            throw new IllegalArgumentException("Error! Division by zero!");
        }
        return array[0] % array[array.length - 1];
    }


    public static double modulus(double[] array){
        if (array.length == 0 || array == null) {
            throw new IllegalArgumentException ("Array is empty!");
        }
        if (array[array.length-1]==0) {
            throw new IllegalArgumentException("Error! Division by zero!");
        }
        return array[0] % array[array.length - 1];
    }


    public static int secondLargest(int[] array){
        if (array.length == 0 || array == null) {
        throw new IllegalArgumentException ("Array is empty!");
        }
        int max = array[0];
        int secMax = array[0];
        for (int i = 1; i < array.length; i++) {
        if(array[i] > max) {
        secMax = max;
        max = array[i];
        } else if(array[i] > secMax) {
        secMax = array[i];
        }
        }
        return secMax;
        }

    public static double secondLargest(double[] array){
        if (array.length == 0 || array == null) {
        throw new IllegalArgumentException ("Array is empty!");
        }
        double max = array[0];
        double secMax = array[0];
        for (int i = 1; i < array.length; i++) {
        if(array[i] > max) {
        secMax = max;
        max = array[i];
        } else if(array[i] > secMax) {
        secMax = array[i];
        }
        }
        return secMax;

        }

    public static int[] reverse(int[] array) {
        int[] result = new int[array.length];
        int j = 0;
        for(int i = array.length; i > 0; i--){
            result[j] = array[i];
            j++;
        }
        return  result;
    }

    public static int[] findEvenElements(int[] array) {
        int[] result = new int[array.length];
        int j = 0;
        for (int i : array) {
            if(i % 2 == 0) {
                result[j] = i;
                j++;
            }
        }
        return result;
    }

}
