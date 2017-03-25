package crazyjedi.homeWork7.Task5;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Vlad on 23.03.2017.
 */
public class EfficiencyDemo {
    public static void main(String[] args) {
        long startTime = 0;

        long arrayListTime = 0;
        long linkedListTime = 0;

        List<Integer> intArrayList = new ArrayList<>();
        List<String> stringArrayList = new ArrayList<>();
        List<Integer> intLinkedList = new LinkedList<>();
        List<String> stringLinkedList = new LinkedList<>();
        int intVal=1;

        //INTEGER LISTS
        System.out.println("INTEGER LISTS\n");
        System.out.println("1000 iterations\n");
        System.out.println("\nadd");
        startTime=System.nanoTime();
        for(int i=0;i<1000;i++){
            intArrayList.add(i);
        }
        arrayListTime=System.nanoTime()-startTime;

        startTime=System.nanoTime();
        for(int i=0;i<1000;i++) {
            intLinkedList.add(i);
        }
        linkedListTime=System.nanoTime()-startTime;

        arrayListTime=TimeUnit.NANOSECONDS.toMicros(arrayListTime);
        linkedListTime=TimeUnit.NANOSECONDS.toMicros(linkedListTime);
        System.out.println(String.format("ArrayList: %d microseconds; LinkedList: %d microseconds;", arrayListTime,linkedListTime));

        System.out.println("\nset");

        startTime=System.nanoTime();
        for(int i=0;i<1000;i++){
            intArrayList.set(i,2);
        }
        arrayListTime=System.nanoTime()-startTime;

        startTime=System.nanoTime();
        for(int i=0;i<1000;i++) {
            intLinkedList.set(i,2);
        }
        linkedListTime=System.nanoTime()-startTime;
        System.out.println(String.format("ArrayList: %d microseconds; LinkedList: %d microseconds;", arrayListTime,linkedListTime));

        System.out.println("\nget");

        startTime=System.nanoTime();
        for(int i=0;i<1000;i++){
            intArrayList.get(i);
        }
        arrayListTime=System.nanoTime()-startTime;

        startTime=System.nanoTime();
        for(int i=0;i<1000;i++) {
            intLinkedList.get(i);
        }
        linkedListTime=System.nanoTime()-startTime;
        System.out.println(String.format("ArrayList: %d microseconds; LinkedList: %d microseconds;", arrayListTime,linkedListTime));

        System.out.println("\nremove");

        startTime=System.nanoTime();
        Iterator<Integer> iter = intArrayList.iterator();
        while(iter.hasNext()){
            iter.next();
            iter.remove();
        }
        arrayListTime=System.nanoTime()-startTime;

        startTime=System.nanoTime();
        iter = intLinkedList.iterator();
        while(iter.hasNext()){
            iter.next();
            iter.remove();
        }
        linkedListTime=System.nanoTime()-startTime;
        System.out.println(String.format("ArrayList: %d microseconds; LinkedList: %d microseconds;", arrayListTime,linkedListTime));



        //STRING LISTS
        System.out.println("\nSTRING LISTS");
        System.out.println("\n1000 iterations");
        System.out.println("\nadd");
        startTime=System.nanoTime();
        for(int i=0;i<1000;i++){
            stringArrayList.add("a");
        }
        arrayListTime=System.nanoTime()-startTime;

        startTime=System.nanoTime();
        for(int i=0;i<1000;i++) {
            stringLinkedList.add("a");
        }
        linkedListTime=System.nanoTime()-startTime;

        arrayListTime=TimeUnit.NANOSECONDS.toMicros(arrayListTime);
        linkedListTime=TimeUnit.NANOSECONDS.toMicros(linkedListTime);
        System.out.println(String.format("ArrayList: %d microseconds; LinkedList: %d microseconds;", arrayListTime,linkedListTime));

        System.out.println("\nset");

        startTime=System.nanoTime();
        for(int i=0;i<1000;i++){
            stringArrayList.set(i,"b");
        }
        arrayListTime=System.nanoTime()-startTime;

        startTime=System.nanoTime();
        for(int i=0;i<1000;i++) {
            stringLinkedList.set(i,"b");
        }
        linkedListTime=System.nanoTime()-startTime;
        System.out.println(String.format("ArrayList: %d microseconds; LinkedList: %d microseconds;", arrayListTime,linkedListTime));

        System.out.println("\nget");

        startTime=System.nanoTime();
        for(int i=0;i<1000;i++){
            stringArrayList.get(i);
        }
        arrayListTime=System.nanoTime()-startTime;

        startTime=System.nanoTime();
        for(int i=0;i<1000;i++) {
            stringLinkedList.get(i);
        }
        linkedListTime=System.nanoTime()-startTime;
        System.out.println(String.format("ArrayList: %d microseconds; LinkedList: %d microseconds;", arrayListTime,linkedListTime));

        System.out.println("\nremove");

        startTime=System.nanoTime();
        Iterator<String> strIter = stringArrayList.iterator();
        while(strIter.hasNext()){
            strIter.next();
            strIter.remove();
        }
        arrayListTime=System.nanoTime()-startTime;

        startTime=System.nanoTime();
        strIter = stringLinkedList.iterator();
        while(strIter.hasNext()){
            strIter.next();
            strIter.remove();
        }
        linkedListTime=System.nanoTime()-startTime;
        System.out.println(String.format("ArrayList: %d microseconds; LinkedList: %d microseconds;", arrayListTime,linkedListTime));


        //INTEGER LISTS
        System.out.println("INTEGER LISTS\n");
        System.out.println("10000 iterations\n");
        System.out.println("\nadd");
        startTime=System.nanoTime();
        for(int i=0;i<10000;i++){
            intArrayList.add(i);
        }
        arrayListTime=System.nanoTime()-startTime;

        startTime=System.nanoTime();
        for(int i=0;i<10000;i++) {
            intLinkedList.add(i);
        }
        linkedListTime=System.nanoTime()-startTime;

        arrayListTime=TimeUnit.NANOSECONDS.toMicros(arrayListTime);
        linkedListTime=TimeUnit.NANOSECONDS.toMicros(linkedListTime);
        System.out.println(String.format("ArrayList: %d microseconds; LinkedList: %d microseconds;", arrayListTime,linkedListTime));

        System.out.println("\nset");

        startTime=System.nanoTime();
        for(int i=0;i<10000;i++){
            intArrayList.set(i,2);
        }
        arrayListTime=System.nanoTime()-startTime;

        startTime=System.nanoTime();
        for(int i=0;i<10000;i++) {
            intLinkedList.set(i,2);
        }
        linkedListTime=System.nanoTime()-startTime;
        System.out.println(String.format("ArrayList: %d microseconds; LinkedList: %d microseconds;", arrayListTime,linkedListTime));

        System.out.println("\nget");

        startTime=System.nanoTime();
        for(int i=0;i<10000;i++){
            intArrayList.get(i);
        }
        arrayListTime=System.nanoTime()-startTime;

        startTime=System.nanoTime();
        for(int i=0;i<10000;i++) {
            intLinkedList.get(i);
        }
        linkedListTime=System.nanoTime()-startTime;
        System.out.println(String.format("ArrayList: %d microseconds; LinkedList: %d microseconds;", arrayListTime,linkedListTime));

        System.out.println("\nremove");

        startTime=System.nanoTime();
        iter = intArrayList.iterator();
        while(iter.hasNext()){
            iter.next();
            iter.remove();
        }
        arrayListTime=System.nanoTime()-startTime;

        startTime=System.nanoTime();
        iter = intLinkedList.iterator();
        while(iter.hasNext()){
            iter.next();
            iter.remove();
        }
        linkedListTime=System.nanoTime()-startTime;
        System.out.println(String.format("ArrayList: %d microseconds; LinkedList: %d microseconds;", arrayListTime,linkedListTime));



        //STRING LISTS
        System.out.println("\nSTRING LISTS");
        System.out.println("\n10000 iterations");
        System.out.println("\nadd");
        startTime=System.nanoTime();
        for(int i=0;i<10000;i++){
            stringArrayList.add("a");
        }
        arrayListTime=System.nanoTime()-startTime;

        startTime=System.nanoTime();
        for(int i=0;i<10000;i++) {
            stringLinkedList.add("a");
        }
        linkedListTime=System.nanoTime()-startTime;

        arrayListTime=TimeUnit.NANOSECONDS.toMicros(arrayListTime);
        linkedListTime=TimeUnit.NANOSECONDS.toMicros(linkedListTime);
        System.out.println(String.format("ArrayList: %d microseconds; LinkedList: %d microseconds;", arrayListTime,linkedListTime));

        System.out.println("\nset");

        startTime=System.nanoTime();
        for(int i=0;i<10000;i++){
            stringArrayList.set(i,"b");
        }
        arrayListTime=System.nanoTime()-startTime;

        startTime=System.nanoTime();
        for(int i=0;i<10000;i++) {
            stringLinkedList.set(i,"b");
        }
        linkedListTime=System.nanoTime()-startTime;
        System.out.println(String.format("ArrayList: %d microseconds; LinkedList: %d microseconds;", arrayListTime,linkedListTime));

        System.out.println("\nget");

        startTime=System.nanoTime();
        for(int i=0;i<10000;i++){
            stringArrayList.get(i);
        }
        arrayListTime=System.nanoTime()-startTime;

        startTime=System.nanoTime();
        for(int i=0;i<10000;i++) {
            stringLinkedList.get(i);
        }
        linkedListTime=System.nanoTime()-startTime;
        System.out.println(String.format("ArrayList: %d microseconds; LinkedList: %d microseconds;", arrayListTime,linkedListTime));

        System.out.println("\nremove");

        startTime=System.nanoTime();
        strIter = stringArrayList.iterator();
        while(strIter.hasNext()){
            strIter.next();
            strIter.remove();
        }
        arrayListTime=System.nanoTime()-startTime;

        startTime=System.nanoTime();
        strIter = stringLinkedList.iterator();
        while(strIter.hasNext()){
            strIter.next();
            strIter.remove();
        }
        linkedListTime=System.nanoTime()-startTime;
        System.out.println(String.format("ArrayList: %d microseconds; LinkedList: %d microseconds;", arrayListTime,linkedListTime));


    }
}
