package hz.poKnigeShilda;

import java.util.Scanner;

/**
 * Created by Администратор on 24.10.2016.
 */
public class Randomm {


    public void raschetRandom (){

        boolean medodWhile = true;

        int viborIgrokov, nachalo = 0;

       // Scanner scanner = new Scanner(System.in);
      //  viborIgrokov = scanner.nextInt();
        //Scanner scanner1 = new Scanner(System.in);
       // nachalo = scanner1.nextInt();

        while (medodWhile) {

            System.out.println("Запустился рандомный метод");

            System.out.println("Для выбора ингроков нажмите 1 для выхода 0");

            Scanner scanner1 = new Scanner(System.in);
            nachalo = scanner1.nextInt();

            Scanner scanner = new Scanner(System.in);
            viborIgrokov = scanner.nextInt();

            if (nachalo == 1) {

                switch (viborIgrokov) {

                    case 1: {
                        System.out.println("Выбран игрок № 1");
                        break;
                    }

                    case 2: {
                        System.out.println("Выбран игрок № 2");
                        break;
                    }

                    case 3: {
                        System.out.println("Выбран игрок № 3");
                        break;
                    }

                    default:
                        System.out.println();

                } //клнец свича

            } //конец начального Ифа



        }// конец корневого метода Вайл






    } // конец метода







}




