package hz.poKnigeShilda;

/**
 * Created by Администратор on 11.10.2016.
 */
public class Zapuskator {

    public static void main(String[] args) {


        SkorostZvuka skorostZvuka = new SkorostZvuka();
       // skorostZvuka.raschetZvuka();

        UgadiaChisla ugadiaChisla = new UgadiaChisla();

        VsakoRaznoe vsakoRaznoe = new VsakoRaznoe();
        //vsakoRaznoe.preodrazovanieTipov_V_INT();
        //vsakoRaznoe.preodrazovanieTipov_V_double();
        vsakoRaznoe.preobrozovanieV_vurazenia();
        vsakoRaznoe.prostoMetod ();
        System.out.println("****************");
      //  vsakoRaznoe.proverkaDeleniaNaNol();
      //  ugadiaChisla.ugadai();

        vsakoRaznoe.rabotaSoSwichem ();

        VichislenieQvadratnogoKornia vichislenieQvadratnogoKornia = new VichislenieQvadratnogoKornia();
        vichislenieQvadratnogoKornia.vichisleniQvadratKornia();

    }


}
