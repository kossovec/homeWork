package crazyjedi.homeWork10;

/**
 * Created by Vlad on 10.04.2017.
 */
public class TreeExceptionsThrower {

    public static void throwThreeExceptions(int exNum) throws MyEx1, MyEx2, MyEx3 {
        if(exNum<=0){
            throw new MyEx1("Exception 1");
        }
        else if(exNum==1){
            throw new MyEx2("Exception 2");
        }
        else {
            throw new MyEx3("Exception 3");
        }
    }

}
