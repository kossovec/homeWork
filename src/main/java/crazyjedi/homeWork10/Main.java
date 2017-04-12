package crazyjedi.homeWork10;

/**
 * Created by Vlad on 10.04.2017.
 */
public class Main {
    public static void main(String[] args) {

        try{
            throw new Exception("I am a new exception!");
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
        finally {
            System.out.println("Finally!");
        }

        try{
            throw new MyException("I am a MyException!");
        }
        catch(MyException e){
            System.out.println(e.getMyMessage());
            System.out.println(e.toString());
        }

        String forNullPointerException = null;
        try {
            forNullPointerException.charAt(1);
        }
        catch (NullPointerException e) {
            System.out.println(e.toString());
        }

        try {
            ExceptionWrapper.f();
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        try {
            TreeExceptionsThrower.throwThreeExceptions(1);
        }
        catch (MyEx1|MyEx2|MyEx3 e) {
            System.out.println(e.toString());
        }


    }
}
