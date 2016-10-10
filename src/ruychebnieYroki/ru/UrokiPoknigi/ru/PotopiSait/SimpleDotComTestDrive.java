package ruychebnieYroki.ru.UrokiPoknigi.ru.PotopiSait;

import static ruychebnieYroki.ru.UrokiPoknigi.ru.PotopiSait.MyArreyList.MoyArreyList;

/**
 * Created by Администратор on 13.07.2016.
 */
public class SimpleDotComTestDrive {

    // проверочный метод для рандома.

    public static void metodRandom (){
        System.out.println("Заполняем массив Рандомными значениями и выводим их с помощью цикла фор ич");
       // int [] ints;

        int znach = (int) (Math.random()*30);

        //int [] ints = {(int) (Math.random()*10)};

        int [] ints = {znach+1, znach+12, znach+3, znach+5};

        for (int perebor: ints){

            System.out.println(" В Массиве находится = " + perebor);
        }
    }



    public static void main(String[] args) {

        String vistrel = "2";
      int[] locations = {2,3,4}; // массив для хранения ( сайтов караблей)

       SimpleDotCom simpleDotCom = new SimpleDotCom(); // создали  новый обьект
        simpleDotCom.setLocationCells( locations) ;  // передали массив с адресами в метод

       simpleDotCom.checkYourself(vistrel);
        System.out.println(vistrel);

       // metodRandom ();
        MoyArreyList ();




    } // конец метода main

}
