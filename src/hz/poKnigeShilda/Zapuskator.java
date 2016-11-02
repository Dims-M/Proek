
package hz.poKnigeShilda;


import ruychebnieYroki.ru.UrokiPoknigi.ru.Car;

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

        System.out.println("*************************************");
        vsakoRaznoe.rabotaS_Metodami();
        System.out.println("*************************************");

        Car car = new Car();
        car.maxSkorost();
        car.kolichestvoPasajirov = 15;
        car.fuelToplivo = 50;
        car.kolichestvoPasajirov = 5;
        car.tekushaiScorost = 80;
        car.rashodTopliva = 12;

        car.infaOClasse();

    }


}
