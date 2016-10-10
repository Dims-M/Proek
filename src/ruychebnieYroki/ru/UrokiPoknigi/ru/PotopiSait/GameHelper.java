package ruychebnieYroki.ru.UrokiPoknigi.ru.PotopiSait;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

/**
 * Created by Администратор on 19.07.2016.
 */
public class GameHelper {

    public String getUserImput (String prompt){

        String imputLine = null;

        System.out.println(" ");

        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));

            imputLine = is.readLine() ;

            if (imputLine.length() ==0 ) return null;
        } catch (IOException e){
            System.out.println("В Ведены НЕ коректные значения!!!! ");
        }

        return imputLine;
}
}