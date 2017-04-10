package crazyjedi.homeWork10;

/**
 * Created by Vlad on 10.04.2017.
 */
public class MyException extends Exception {

    private String myMessage;

    public MyException() {
    }

    public MyException(String message) {
        super(message);
        myMessage = message;
    }

    public String getMyMessage() {
        return myMessage;
    }
}
