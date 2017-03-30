package mihail_metel.homeWork07.speedTest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*Сгенерируйте Integer и String ArrayList и LinkedList с 1000 и 10000 элементами.

Измерьте время выполнения этих методов и выведите их в консоль:
- add
- set
- get
- remove*/

public class SpeedOfCollections {
    public static void main(String[] args) {
        List<Integer> integerArrayList = new ArrayList<Integer>();
        List<Integer> integerLinkedList = new LinkedList<Integer>();
        List<String> stringsArrayList = new ArrayList<String>();
        List<String> stringsLinkedList = new LinkedList<String>();

        Timer.measureTime(integerArrayList,1000);
        Timer.measureTime(integerLinkedList,1000);

        Timer.measureTime(integerArrayList,10000);
        Timer.measureTime(integerLinkedList,10000);

        Timer.measureTime(stringsArrayList,1000);
        Timer.measureTime(stringsLinkedList,1000);

        Timer.measureTime(stringsArrayList,10000);
        Timer.measureTime(stringsLinkedList,10000);

    }
}
