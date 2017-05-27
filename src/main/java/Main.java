/**
 * Created by Абдусамеъ on 27.05.2017.
 */
public class Main {
    public static void main(String[] args){
        Singleton sing = Singleton.getInstance();
        sing.populate();
        System.out.println("lalalalallalallallal");
        sing.populate();
    }
}
