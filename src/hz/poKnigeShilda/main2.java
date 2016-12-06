package hz.poKnigeShilda;

import static hz.poKnigeShilda.RabotaS_Massivami.infaOKlasse;
import static hz.poKnigeShilda.RabotaS_Massivami.randomIntMassiva;

/**
 * Created by Администратор on 06.12.2016.
 */
public class main2 {

    public static void main(String[] args) {

        int  massiv2 [] [] = new int [5][2];

        RabotaS_Massivami rabotaS_massivami = new RabotaS_Massivami();

        int [] test  = new int[10];

       // infaOKlasse;

        rabotaS_massivami.randomIntMassiva(test);
        rabotaS_massivami.vivod_Dannih_Massiva(test);

        System.out.println(rabotaS_massivami.schetIntovihMassivof(test));
        rabotaS_massivami.randomIntMassivaDvuhmernoho(massiv2);
        rabotaS_massivami.vivodMnogomernogoMassiv(massiv2);




    }

}
