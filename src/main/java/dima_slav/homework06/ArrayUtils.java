package dima_slav.homework06;

public final class ArrayUtils {
    private ArrayUtils(){
    }

    public static int sum(int[] array){
        if (array.length == 0){
            throw new IllegalArgumentException("The array is empty");
        }
        int sum = 0;
        for(int i=0; i<array.length; i++){
            sum = sum + array[i];
        }
        return sum;
    }

    public static int min(int[] array){
        if (array.length == 0){
            throw new IllegalArgumentException("The array is empty");
        }
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public static int max(int[] array){
        if (array.length == 0){
            throw new IllegalArgumentException("The array is empty");
        }
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public static int maxPositive(int[] array){
        if (array.length == 0){
            throw new IllegalArgumentException("The array is empty");
        }
        int max = array[0];
        for (int i=0; i<array.length; i++) {
            if (array[0] > 0 && array[i] > max) {
            }
        }
        return max;
    }

    public static int multiplication(int[] array){
        if (array.length == 0){
            throw new IllegalArgumentException("The array is empty");
        }
        int mult = 1;
        for (int i = 0; i < array.length; i++) {
            mult = mult * array[i];
        }
        return mult;
    }

    public static int modulus(int[] array){
        if (array.length == 0) {
            throw new IllegalArgumentException("The array is empty");
        }
        if (array[array.length - 1] == 0){
            throw new IllegalArgumentException("Invalid value of last element of array ");
        }
        int firstElement = array[0];
        int lastElement = array[array.length - 1];
        int result = firstElement % lastElement;
        return result;
    }

    public static int secondLargest(int[] array){
        if (array.length == 0){
            throw new IllegalArgumentException("The array is empty");
        }
        int maxSec = array[0];
        int max = array[0];
        for (int i=0; i<array.length; i++){
            if (array[i] > max){
                maxSec = max;
                max = array[i];
            }
            else if (array[i] > maxSec){
                maxSec = array[i];
            }
        }
        return maxSec;
    }

    public static int[] reverse(int[] array) {
        int reversed = 0;
        int[] rev = new int[array.length];
        for (int i = array.length-1; i >= 0; i--) {
            rev[reversed] = array[i];
            reversed++;
        }
        return rev;
    }

    public static int[] findEvenElements(int[] array){
        int [] elements= new int[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2==0){
                int [] same = new int[elements.length+1];
                System.arraycopy(elements,0,same,0,elements.length);
                elements=same;
                elements[elements.length-1]=array[i];
            }
        }
        return elements;
    }
}
