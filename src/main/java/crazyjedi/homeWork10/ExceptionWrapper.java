package crazyjedi.homeWork10;

/**
 * Created by Vlad on 10.04.2017.
 */
public class ExceptionWrapper {

    public static void g() throws MyException {
        throw new MyException("Senceless exception!");
    }

    public static void f() {
        try{
            g();
        } catch (MyException e) {
            throw new IllegalArgumentException("WTF?!");
        }
    }


}
