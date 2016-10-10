package ruychebnieYroki.ru.UrokiPoknigi;

import ruychebnieYroki.ru.UrokiPoknigi.ru.PotopiSait.SimpleDotCom;
import ruychebnieYroki.ru.UrokiPoknigi.ru.VsakieClassi.Clock;
import ruychebnieYroki.ru.UrokiPoknigi.ru.VsakieClassi.Tempp;

import static ruychebnieYroki.ru.UrokiPoknigi.RaznieMetodi.histori;
import static ruychebnieYroki.ru.UrokiPoknigi.RaznieMetodi.razdelitel;
import static ruychebnieYroki.ru.UrokiPoknigi.RaznieMetodi.summaChisla1;

/**
 * Created by Администратор on 06.07.2016.
 */
public class Zapuskator {

    public static void main(String[] args) {



        Dogi dog = new Dogi();
        Dogi dog1 = new Dogi();
        Dogi dog2 = new Dogi();

        dog.getName();
        System.out.println("*************");
        dog.setVozrast(0);

        Dogi  gogiii[] = new Dogi[4]; // массив переменных типа Dogi

        gogiii[0] = new Dogi();
        gogiii[1] = new Dogi(); // В переменную массива под индексом [1] записали ссылку на объект Dogi
        gogiii[2] = dog1; // В переменную массива под индексом [1] записали ссылку на объект Dogi

        gogiii[0].getName();
        gogiii[0].setName("657257857275254");

        gogiii[0].name = "Чарли";
        gogiii[1].name = "Арго";
        gogiii[2].name  = "Эрика"; //
        gogiii[0].setName("657257857275254");


        System.out.println(gogiii[1].name); // вывели результат
        System.out.println(gogiii[0].name); // вывели результат
        System.out.println(gogiii[2].getName()); //


        int x = 0;

        while (x < gogiii.length){

          //  gogiii[x].laet(1);     // при каждом витке цикла. При изменении счетчика х будет подставлятся
                                   //индекс массива и выводить его метод

            x++; // увеличиваем счетчик
        }

        dog1.laet(2);


        // Запуск празных мнтодов
        //summaChisla1 ();

       // histori(0);с


        System.out.println(gogiii[1].getName());


        System.out.println("***********************************");
        System.out.println(dog2.getName());
        dog2.setName("11111111111111111");
        dog2.getName();
        System.out.println(dog2.getName());

        razdelitel();

        Clock clock = new Clock(); // Создаем объект слок типа класса Клок. Указываем место в куче и сылку на это место в памяти
        clock.getTime();
        clock.setTime("11/7/2016");
        System.out.println(clock.getTime());
        Tempp tempp = new Tempp();
        System.out.println(tempp.getStringTemp());
        clock.tempFun();

        razdelitel();


        SimpleDotCom simpleDotCom = new SimpleDotCom();
        simpleDotCom.checkYourself("1000");



    } // конец метода майн
} // конец класса