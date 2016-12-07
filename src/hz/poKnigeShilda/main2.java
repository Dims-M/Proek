package hz.poKnigeShilda;

import static hz.poKnigeShilda.RabotaS_Massivami.infaOKlasse;
import static hz.poKnigeShilda.RabotaS_Massivami.randomIntMassiva;

/**
 * Created by Администратор on 06.12.2016.
 */
public class main2 {

    public static void main(String[] args) {

        int  massiv2 [] [] = new int [5][2];
        String massivS [] = {"Один","Два","Три","четыре", "хрень"};


        RabotaS_Massivami rabotaS_massivami = new RabotaS_Massivami();

        int [] test  = new int[10];
        String poisk = "хрень";
       // infaOKlasse;

        rabotaS_massivami.randomIntMassiva(test);
        rabotaS_massivami.vivod_Dannih_Massiva(test);

        System.out.println(rabotaS_massivami.schetIntovihMassivof(test));
     //   rabotaS_massivami.randomIntMassivaDvuhmernoho(massiv2);
       // rabotaS_massivami.vivodMnogomernogoMassiv(massiv2);

       // rabotaS_massivami.poiskPoZnacheniyString(massivS,poisk);
        rabotaS_massivami.poiskPoZnacheniyStringSkaner (massivS);




    }

}
