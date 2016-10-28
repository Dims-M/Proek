package hz.poKnigeShilda;

import java.util.Scanner;

/**
 * Created by Администратор on 24.10.2016.
 */
public class Randomm {

    int hranenie [] = new int[10];

    public static void main(String[] args) {

        Randomm  nandomm = new Randomm();
        nandomm.raschetRandom();

    }

    public void raschetRandom (){

        zapolnenie (); // 1111111
        boolean medodWhile = true;

        int viborIgrokov, nachalo = 0;

       // int hranenie [] = new int[10];

        String igrok1 = "Выбран игрок № 1";
       String igrok2 = "Выбран игрок № 2";
       String igrok3 = "Выбран игрок № 3";

       // Scanner scanner = new Scanner(System.in);
      //  viborIgrokov = scanner.nextInt();
        //Scanner scanner1 = new Scanner(System.in);
       // nachalo = scanner1.nextInt();

        while (medodWhile) {

          //  System.out.println("Запустился рандомный метод");

            System.out.println("Для выбора игроков нажмите 1 для выхода 0");

            Scanner scanner = new Scanner(System.in);
            viborIgrokov = scanner.nextInt();
           // System.out.println("Выбирайте игроков из списка");

            if (viborIgrokov == 1) {
                System.out.println("Выбирайте игроков из списка");
                Scanner scanner1 = new Scanner(System.in);
                nachalo = scanner1.nextInt();

                // Scanner scanner = new Scanner(System.in);
                // viborIgrokov = scanner.nextInt();
                // System.out.println("Выбирайте игроков из списка");

                if (nachalo == 0) {
                    System.out.println("Выход");
                    vivodIgrokov();
                    medodWhile = false;
                    break;
                }

                if (nachalo == 1) {

                    switch (viborIgrokov) {

                        case 1: {
                            System.out.println(igrok1);
                            hranenieMassiva(1);
                            break;
                        }

                        case 2: {
                            System.out.println(igrok2);
                            hranenieMassiva(2);
                            break;
                        }

                        case 3: {
                            System.out.println(igrok3);
                            hranenieMassiva(3);
                            break;
                        }

                        default:
                            System.out.println("Выберите игроков");

                    } //клнец свича

                } //конец начального Ифа

            } // конец выбора 1 или 0

            if (viborIgrokov ==0){
                System.out.println("Выход");
                vivodIgrokov();
                medodWhile = false;
                break;
            }
            else {
                System.out.println("DFDFFFFFFF0");
                break;
            }


        }// конец корневого метода Вайл

       // vivodIgrokov ();




    } // конец метода


    public void zapolnenie (){
        for (int i = 0; i < hranenie.length ; i++ ){
            hranenie[i] = 0;
        }
    }


    public void hranenieMassiva (int count) {

        int chetchik = count;

        for (int i = 0; i < hranenie.length; i++) {

            if (hranenie[i] == 0) {
               // for (int y = 0; y < hranenie.length; i++)
                    hranenie[i] = chetchik;
                break;
            }
    }
       }


    public void vivodIgrokov (){
        for (int i = 0; i< hranenie.length; i++){

            if (hranenie[i] !=0 ){
                System.out.println(hranenie[i]);
            }

          //  for (int x = 0; x<hranenie.length; x++)

        }


    }





}




