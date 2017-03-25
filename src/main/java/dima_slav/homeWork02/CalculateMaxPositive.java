package dima_slav.homeWork02;

public class CalculateMaxPositive {
    public int maxPositive(int array[]) {
        if (array.length == 0){
            throw new IllegalArgumentException("The array 1 is empty");
        }
        int max = 0;
        for (int i=0; i<array.length; i++) {
            if (array[i] > max) {
            max = array[i];
            }
        }
        return max;

    }

    public double maxPositive(double array[]) {
        if (array.length == 0){
            throw new IllegalArgumentException("The array 2 is empty");
        }
        double max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max){
            max = array[i];
            }
        }
        return max;

    }
}
