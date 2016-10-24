package hz.poKnigeShilda;

import java.util.Scanner;

/**
 * Created by Администратор on 24.10.2016.
 */
public class Randomm {


    public void raschetRandom (){

        boolean medodWhile = true;

        int viborIgrokov, nachalo = 0;

        int hranenie [] = new int[10];

        String igrok1 = "Выбран игрок № 1";
       String igrok2 = "Выбран игрок № 2";
       String igrok3 = "Выбран игрок № 3";

       // Scanner scanner = new Scanner(System.in);
      //  viborIgrokov = scanner.nextInt();
        //Scanner scanner1 = new Scanner(System.in);
       // nachalo = scanner1.nextInt();

        while (medodWhile) {

            System.out.println("Запустился рандомный метод");

            System.out.println("Для выбора игроков нажмите 1 для выхода 0");

            Scanner scanner1 = new Scanner(System.in);
            nachalo = scanner1.nextInt();

            Scanner scanner = new Scanner(System.in);
            viborIgrokov = scanner.nextInt();

            if (nachalo == 1) {

                switch (viborIgrokov) {

                    case 1: {
                        System.out.println(igrok1);

                        break;
                    }

                    case 2: {
                        System.out.println(igrok2);
                        break;
                    }

                    case 3: {
                        System.out.println(igrok3);
                        break;
                    }

                    default:
                        System.out.println("Выберите игроков");

                } //клнец свича

            } //конец начального Ифа



        }// конец корневого метода Вайл






    } // конец метода



    public void hranenieMassiva (int count){

        int chetchik = count;

        for (int i = 0; ; ){

        }


    }




}




