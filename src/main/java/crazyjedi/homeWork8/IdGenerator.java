package crazyjedi.homeWork8;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Vlad on 28.03.2017.
 */
public class IdGenerator {
    AtomicInteger elements_counter = new AtomicInteger(0);
    public int generateId(){
        return elements_counter.addAndGet(1);
    }
}
