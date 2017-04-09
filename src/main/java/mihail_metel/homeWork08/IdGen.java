package mihail_metel.homeWork08;

public class IdGen{
    static private int id = 0;

    public static int id(){
        return id++;
    }
}
