package dima_slav.homeWork02;

public class CalculateModulus {
    public  int modulus(int array[]){
        if (array.length == 0) {
            throw new IllegalArgumentException("The array 1 is empty");
        }
        if (array[array.length - 1] == 0){
            throw new IllegalArgumentException("Invalid value of last element of array 1 ");
        }

        int firstIntElement = array[0];
        int lastIntElement = array[array.length - 1];
        int result = firstIntElement % lastIntElement;
        return result;
    }


    public double modulus(double array[]){
        if (array.length == 0){
            throw new IllegalArgumentException("The array 2 is empty");
        }
        if (array[array.length - 1] == 0){
            throw new IllegalArgumentException("Invalid value of the last element of array 2");
        }

        double firstDoubleElement = array[0];
        double lastDoubleElement = array[array.length - 1];
        double result = firstIntElement % lastIntElement;
        return result;

    }
}
