package main.java.mihail_metel.homeWork02;


public class HomeWork021 {
//            •	sum(int array[]), sum(double[])
//            •	min(int array[]), min(double[])
//            •	max(int array[]), max(double[])
//            •	maxPositive(int array[]), maxPositive(double array[]),
//            •	multiplication  (int array[]), multiplication (double[])
//            •	modulus(int array[]), modulus(double[])
//            •	secondLargest(int array[]), secondLargest(double[])
private int[] myIntArray;
private double[] myDoubleArray;

    public static void main(String[] args) throws ExceptionEmptyArray {

        HomeWork021 arrAct = new HomeWork021();
        arrAct.setMyIntArray(new int[]{//1,1,2,2});/*
                15,
                6,
                10,
                125,
                358,
                3258,
                1,
                3258,
                -125,
                10});
        arrAct.setMyDoubleArray(new double[]{
                10,2,
                6.5,
                1.2,
                250.365,
                3258.1,
                1.11,
                1.33,
                3258.1,
                -125,
                4});

        try {
            for (int i = 0; i < arrAct.getMyIntArray().length; i++) {
                System.out.println(arrAct.getMyIntArray()[i]);
            }

            System.out.println("Инты: ");
            System.out.println("Сумма масива: " + arrAct.sum(arrAct.getMyIntArray()));
            System.out.println("Минимальное значение массива: " + arrAct.min(arrAct.getMyIntArray()));
            System.out.println("Максимальное значение массива: " + arrAct.max(arrAct.getMyIntArray()));
            System.out.println("Максимальное положительное значение массива: " + arrAct.maxPositive(arrAct.getMyIntArray()));
            System.out.println("Результат перемножения массива: " + arrAct.multiplication(arrAct.getMyIntArray()));
            System.out.println("Остаток от деления первого элемента массива на последний: "
                    + arrAct.modulus(arrAct.getMyIntArray()));
            System.out.println("Второе по величине число массива: " + arrAct.secondLargest(arrAct.getMyIntArray()));

            System.out.println("\nДаблы: ");
            for (int i = 0; i < arrAct.getMyIntArray().length; i++) {
                System.out.println(arrAct.getMyDoubleArray()[i]);
            }

            System.out.println("Сумма масива: " + arrAct.sum(arrAct.getMyDoubleArray()));
            System.out.println("Минимальное значение массива: " + arrAct.min(arrAct.getMyDoubleArray()));
            System.out.println("Максимальное значение массива: " + arrAct.max(arrAct.getMyDoubleArray()));
            System.out.println("Максимальное положительное значение массива: " + arrAct.maxPositive(arrAct.getMyDoubleArray()));
            System.out.println("Результат перемножения массива: " + arrAct.multiplication(arrAct.getMyDoubleArray()));
            System.out.println("Остаток от деления первого элемента массива на последний: "
                    + arrAct.modulus(arrAct.getMyDoubleArray()));
            System.out.println("Второе по величине число массива: " + arrAct.secondLargest(arrAct.getMyDoubleArray()));
            arrAct.setMyDoubleArray(null);
        }
        catch (ExceptionEmptyArray e){
            System.out.println(e.toString());
        }
        catch (Exception e){
            System.out.println("Error");
        }

    }


    public int[] getMyIntArray() throws ExceptionEmptyArray {
        if ( (myIntArray == null) || (myIntArray.length == 0) ){
                throw new ExceptionEmptyArray();
        }
        return myIntArray;
    }

    public void setMyIntArray(int[] myIntArray) throws ExceptionEmptyArray {
        if ( (myIntArray == null) || (myIntArray.length == 0) ){
            throw new ExceptionEmptyArray();
        }
        this.myIntArray = myIntArray;
    }

    public double[] getMyDoubleArray() throws ExceptionEmptyArray {
        if ( (myDoubleArray == null) || (myDoubleArray.length == 0) ){
            throw new ExceptionEmptyArray();
        }
        return myDoubleArray;
    }

    public void setMyDoubleArray(double[] myDoubleArray) throws ExceptionEmptyArray {
        if ( (myDoubleArray == null) || (myDoubleArray.length == 0) ){
            throw new ExceptionEmptyArray();
        }
        this.myDoubleArray = myDoubleArray;
    }

    public int sum(int array[]){
        int sum=0;

        for (int anArray : array) {
            sum += anArray;
        }
        return sum;
    }

    public int min(int array[]){
        int minimum = array[0];

        for (int anArray : array) {
            if (minimum > anArray) {
                minimum = anArray;
            }
        }
        return minimum;
    }

    public int max(int array[]){
        int maximum = array[0];

        for (int anArray : array) {
            if (maximum < anArray) {
                maximum = anArray;
            }
        }
        return maximum;
    }

    public int maxPositive(int array[]){
        int max_positive = 0;

        for (int anArray : array) {
            if (max_positive < anArray) {
                max_positive = anArray;
            }
        }
        return max_positive;
    }

    public int multiplication(int array[]){
        int multip = 1;

        for (int anArray : array) {
            multip *= anArray;
        }
        return multip;
    }

    public int modulus(int array[]){
        return array[0] % array[array.length - 1];
    }

    public int secondLargest(int array[]){
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

    public double sum(double[] array){
        double sum = 0;

        for (double anArray : array) {
            sum += anArray;
        }
        return sum;
    }

    public double min(double[] array){
        double minimum = array[0];

        for (double anArray : array) {
            if (minimum > anArray) {
                minimum = anArray;
            }
        }
        return minimum;
    }

    public double max(double[] array){
        double maximum = array[0];

        for (double anArray : array) {
            if (maximum < anArray) {
                maximum = anArray;
            }
        }
        return maximum;
    }

    public double maxPositive(double[] array){
        double max_positive = 0;

        for (double anArray : array) {
            if (max_positive < anArray) {
                max_positive = anArray;
            }
        }
        return max_positive;
    }

    public double multiplication(double[] array){
        double multip = 1;

        for (double anArray : array) {
            multip *= anArray;
        }
        return multip;
    }

    public double modulus(double[] array){
        return array[0] % array[array.length - 1];
    }

    public double secondLargest(double[] array){
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

class ExceptionEmptyArray extends Exception{
    public String toString(){
        return "Error. Empty Array";
    }
}

