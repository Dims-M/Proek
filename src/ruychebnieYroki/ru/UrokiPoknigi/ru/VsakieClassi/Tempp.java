package ruychebnieYroki.ru.UrokiPoknigi.ru.VsakieClassi;

/**
 * Created by Администратор on 11.07.2016.
 */
public class Tempp {

    private String stringTemp;

    public String getStringTemp() {
        return stringTemp;
    }

    public void setStringTemp(String stringTemp) {
        this.stringTemp = stringTemp;
    }

    public void vivodTemp() {
        System.out.println(stringTemp);
    }


    public static void go() {

        int y = 7;

        for (int x = 1; x < 8; x++) {

            y++;

            if (x > 4){
                System.out.println("Значение y = " + y);
        }

            if (y>=14){
                System.out.println("Значение x = " + x);
                break;
            }

    }

}

} // конец класса
