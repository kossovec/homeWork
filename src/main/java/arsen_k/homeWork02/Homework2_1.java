import java.util.Arrays;

public class Homework2_1 {

    public static void main(String[] args) {

        int myArray[] = {3, 2, 3, -12, -45, 1, -3, 7, -9, -4};
        double myArray2[] = {3, 2, 3, -12, -45, 1, -3, 7, -9, -4};

        System.out.println("sum " + sum(myArray) + ", sum " + sum(myArray2));
        System.out.println("min " + min(myArray) + ", min " + min(myArray2));
        System.out.println("max " + max(myArray) + ", max " + max(myArray2));
        System.out.println("maxPositive " + maxPositive(myArray) + ", maxPositive " + maxPositive(myArray2));
        System.out.println("multiplication " + multiplication(myArray) + ", multiplication " + multiplication(myArray2));
        System.out.println("modulus " + Arrays.toString(modulus(myArray)) + ", modulus " + Arrays.toString(modulus(myArray2)));
        System.out.println("secondLargest " + secondLargest(myArray) + ", secondLargest " + secondLargest(myArray2));
    }

    public static int sum(int[] arr) {
        return sum(arr, 0, 0);
    }

    public static int sum(int[] arr, int sum, int count) {
        sum = sum + arr[count];

        if (count < arr.length - 1) return sum(arr, sum, count + 1);
        return sum;
    }

    public static double sum(double[] arr) {
        return sum(arr, 0, 0);
    }

    public static double sum(double[] arr, double sum, int count) {
        sum = sum + arr[count];
        if (count < arr.length - 1) return sum(arr, sum, count + 1);
        return sum;

    }

    public static int min(int[] arr) {
        return min(arr, 0, 0);
    }

    public static int min(int[] arr, int min, int count) {
        min = arr[0];

        for (int i = 0; i != arr.length; i++) {
            if (arr[i] <= min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static double min(double[] arr) {
        return min(arr, 0, 0);
    }

    public static double min(double[] arr, double min, int count) {
        min = arr[0];

        for (int i = 0; i != arr.length; i++) {
            if (arr[i] <= min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int max(int[] arr) {
        return max(arr, 0);
    }

    public static int max(int[] arr, int max) {
        max = arr[0];

        for (int i = 0; i != arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static double max(double[] arr) {
        return max(arr, 0);
    }

    public static double max(double[] arr, double max) {
        max = arr[0];

        for (int i = 0; i != arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int maxPositive(int[] arr) {
        return maxPositive(arr, 0);
    }

    public static int maxPositive(int[] arr, int maxPositive) {
        for (int i = 0; i != arr.length; i++) {

            if (arr[i] >= maxPositive) {
                maxPositive = arr[i];
            }
        }
        return maxPositive;
    }


    public static double maxPositive(double[] arr) {
        return maxPositive(arr, 0);
    }

    public static double maxPositive(double[] arr, double maxPositive) {
        for (int i = 0; i != arr.length; i++) {

            if (arr[i] >= maxPositive) {
                maxPositive = arr[i];
            }
        }
        return maxPositive;
    }

    public static int multiplication(int[] arr) {
        return multiplication(arr, 1, 0);
    }

    public static int multiplication(int[] arr, int multiplication, int count) {
        multiplication = multiplication * arr[count];
        if (count < arr.length - 1) return multiplication(arr, multiplication, count + 1);
        return multiplication;
    }

    public static double multiplication(double[] arr) {
        return multiplication(arr, 1, 0);
    }

    public static double multiplication(double[] arr, double multiplication, int count) {
        multiplication = multiplication * arr[count];
        if (count < arr.length - 1) return multiplication(arr, multiplication, count + 1);
        return multiplication;
    }

    public static int[] modulus(int[] arr) {
        return modulus(arr, arr, 0, 0);
    }

    public static int[] modulus(int[] arr, int[] modulus, int firstelement, int lastelement) {
        firstelement = (Math.abs(arr[0]));
        lastelement = (Math.abs(arr[arr.length - 1]));
        modulus = new int[]{firstelement, lastelement};
        return modulus;
    }

    public static double[] modulus(double[] arr) {
        return modulus(arr, arr, 0, 0);
    }

    public static double[] modulus(double[] arr, double[] modulus, double firstelement, double lastelement) {
        firstelement = (Math.abs(arr[0]));
        lastelement = (Math.abs(arr[arr.length - 1]));
        modulus = new double[]{firstelement, lastelement};
        return modulus;
    }

    public static int secondLargest(int[] arr) {
        return secondLargest (arr, 0, 0);
    }

    public static int secondLargest(int[] arr, int largest, int secondLargest) {

        largest = arr[0];
        secondLargest = arr[0];
        for (int number : arr)
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest) {
                secondLargest = number;
            }
        return secondLargest;
                }
    public static double secondLargest(double[] arr) {
        return secondLargest (arr, 0, 0);
    }

    public static double secondLargest(double[] arr, double largest, double secondLargest) {

        largest = arr[0];
        secondLargest = arr[0];
        for (double number : arr)
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest) {
                secondLargest = number;
            }
        return secondLargest;
    }

}

