package hz.poKnigeShilda;

/**
 * Created by Администратор on 09.11.2016.
 */
public class RabotaSFinalizatorom {

    String name = "Работа с финализатором ";
    int asd;

        RabotaSFinalizatorom (int f)  {
            asd = f;
        }

    protected void finalize (){
       // System.out.println(asd);
        System.out.println("Процедура финализирована " + asd);
    }

    void generasiaObekta (int f){ // создаются обьекты которые ни куда не видут. Почти пустые обьекты
        RabotaSFinalizatorom o   = new RabotaSFinalizatorom (f );

    }


}