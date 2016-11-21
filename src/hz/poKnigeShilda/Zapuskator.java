
package hz.poKnigeShilda;


import ruychebnieYroki.ru.UrokiPoknigi.ru.Car;

import static hz.poKnigeShilda.VsakoRaznoe.*;

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
        Car car1 = car;
        car.maxSkorost();
        car.kolichestvoPasajirov = 15;
        car.fuelToplivo = 50;
        car.kolichestvoPasajirov = 5;
        car.tekushaiScorost = 80;
        car.rashodTopliva = 12;

        car.infaOClasse();
        car1.infaOClasse();
        System.out.println("*************************************");

        zapusk (2);
        System.out.println("*************************************");
      //  RabotaSFinalizatoromq(0);

        System.out.println(intov (5,5));
        System.out.println("*************************************");

        // rabotaSMassivom ();

        buble();
        viviod();




    } //  метода Майн


    // метод вызывает создание пустых обьектов с последущим уничтожение сборщиком и с вызовом функции finalize
    public static  void RabotaSFinalizatoromq ( int znach){

        int count = 0;
        RabotaSFinalizatorom rabotaSFinalizatorom = new RabotaSFinalizatorom (10);

        for (count = znach; count <= 1000000; count++){
            rabotaSFinalizatorom.generasiaObekta(count);
            // указываем какое количество обьекто нужно создать.
        }

    }

    public static double intov (int a, int b){

       // double dobli = (double)a;

        return a + b ;

    }


    }

