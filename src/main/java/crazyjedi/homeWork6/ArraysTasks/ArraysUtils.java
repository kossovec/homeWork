package crazyjedi.homeWork6.ArraysTasks;

import java.util.Stack;

/**
 * Created by Vlad on 05.03.2017.
 */
final public class ArraysUtils {

    private ArraysUtils() {
    }

    public static int sum(int array[]){
        if(array==null){
            throw new IllegalArgumentException("Array must not be null.");
        }
        int result = 0;
        for (int elt : array) {
            if (Integer.MAX_VALUE - result < elt) {
                throw new IllegalArgumentException("Sum is out of int bounds!");
            } else
            {
                result += elt;
            }
        }
        return result;
    }

    public static int min(int array[]){
        if(array==null){
            throw new IllegalArgumentException("Array must not be null.");
        }
        if (array.length == 0) {
            throw new IllegalArgumentException("The array is empty");
        }
        int result = array[0];
        for (int anArray : array) {
            if (anArray < result) {
                result = anArray;
            }
        }
        return result;
    }

    public static int max(int array[]){
        if(array==null){
            throw new IllegalArgumentException("Array must not be null.");
        }
        if (array.length == 0) {
            throw new IllegalArgumentException("The array is empty");
        }
        int result = array[0];
        for (int anArray : array) {
            if (anArray > result) {
                result = anArray;
            }
        }
        return result;
    }

    public static int maxPositive(int array[]){
        if(array==null){
            throw new IllegalArgumentException("Array must not be null.");
        }
        if (array.length == 0) {
            throw new IllegalArgumentException("The array is empty");
        }
        int result = 0;
        for (int anArray : array) {
            if (anArray > result) {
                result = anArray;
            }
        }
        return result;
    }

    public static int multiplication(int array[]){
        if(array==null){
            throw new IllegalArgumentException("Array must not be null.");
        }
        if (array.length == 0) {
            throw new IllegalArgumentException("The array is empty");
        }
        int result=1;
        for (int elt : array) {
            if(Integer.MAX_VALUE/elt<result){
                throw new IllegalArgumentException("Sum is out of Long bounds!");
            }
            result*=elt;
        }
        return result;
    }

    public static int modulus(int array[]){
        if(array==null){
            throw new IllegalArgumentException("Array must not be null.");
        }
        if(array.length==0){
            throw new IllegalArgumentException("The array is empty");
        }
        if(array[array.length-1]==0){
            throw new IllegalArgumentException("Devision by zero.");
        }
        return array[0]%array[array.length-1];
    }

    public static int secondLargest(int array[]){
        if(array==null){
            throw new IllegalArgumentException("Array must not be null.");
        }
        if (array.length <= 1) { //Если длина массива меньше 2, у него не может быть второго максимального значения.
            throw new IllegalArgumentException("The array length < 2");
        }
        int largest = array[0];
        int secondLargest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                secondLargest=largest;
                largest = array[i];
            }
            else if(array[i] > secondLargest){
                secondLargest = array[i];
            }
        }
        return secondLargest;
    }

    public static int[] reverse(int[] array){
        Stack<Integer> myStack = new Stack<Integer>();
        int[] temp = new int[array.length];
        for (int i : array) {
            myStack.add(i);
        }
        for (int i = 0; i < array.length; i++) {
            temp[i] = (int) myStack.pop();
        }
        return temp;
    }

    public static int[] findEvenIndexElements(int[] array){
        int[] evenElements = new int[array.length/2+1];
        int lastInserted = -1;
        for (int i = 0; i < array.length; i++) {
            if(i%2==0){
                evenElements[++lastInserted]=array[i];
            }
        }
        return evenElements;
    }

    /*
    Я считаю, что так намного эффективней, чем все время переопределять массив и копировать в него все элементы.
    С другой стороны, имея список, элементы которого хранят адрес предыдущего, следующего и последнего элемента,
    можно вообще свести затраты на добавление элемента к О(1). Кстати, почему на курсе вообще не затрагивается
    тема анализа алгоритмов? :с
     */
    private static int countEven(int[] array) {
        int evenCounter = 0;
        for (int i : array) {
            if (i % 2 == 0) {
                evenCounter++;
            }
        }
        return evenCounter;
    }

    public static int[] findEvenElements(int[] array) {
        int evenCounter = countEven(array);
        int[] evenElements = new int[evenCounter];
        int lastInserted = -1;
        for (int i : array) {
            if(i%2==0){
                evenElements[++lastInserted]=i;
            }
        }
        return evenElements;
    }



}