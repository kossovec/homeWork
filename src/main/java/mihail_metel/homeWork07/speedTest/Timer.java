package mihail_metel.homeWork07.speedTest;

import java.util.List;

/*Сгенерируйте Integer и String ArrayList и LinkedList с 1000 и 10000 элементами.

Измерьте время выполнения этих методов и выведите их в консоль:
- add
- set
- get
- remove*/

public class Timer {

    public static <L extends List> void measureTime(L list, int size){
        long timeStart, timeEnd;

        timeStart = System.nanoTime();
        for (int i = 0; i < size; i++) {list.add(i);}
        timeEnd = System.nanoTime();
        System.out.println(list.getClass() + "\tsize\t" + size +
                "\tOperation:\tADD, Time:\t" + (timeEnd - timeStart));

        timeStart = System.nanoTime();
        for (int i = 0; i < size; i++) {list.get(i);}
        timeEnd = System.nanoTime();
        System.out.println(list.getClass() + "\tsize\t" + size +
                "\tOperation:\tGET, Time:\t" + (timeEnd - timeStart));

        timeStart = System.nanoTime();
        for (int i = 0; i < size; i++) {list.set(i,i);}
        timeEnd = System.nanoTime();
        System.out.println(list.getClass() + "\tsize\t" + size +
                "\tOperation:\tSET, Time:\t" + (timeEnd - timeStart));

        timeStart = System.nanoTime();

        for (int i = 0; i < size; i++) {list.remove(0);}
        timeEnd = System.nanoTime();
        System.out.println(list.getClass() + "\tsize\t" + size +
                "\tOperation:\tREM, Time:\t" + (timeEnd - timeStart));
    }

}
