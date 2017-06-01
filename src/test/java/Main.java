/**
 * Created by Абдусамеъ on 01.06.2017.
 */
public class Main {
    public static void main(String[] args){
        TestGetClass tg = new TestGetClass();
        tg.before();
        tg.testGetMethod();

        TestChangeClass tc = new TestChangeClass();
        tc.before();
        tc.testChangeMethod(2,"test");
    }
}
