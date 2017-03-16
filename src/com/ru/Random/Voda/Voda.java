package com.ru.Random.Voda;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Администратор on 14.03.2017.
 */
public class Voda {

    public static void main(String[] args) {
        raschetRandoma ();
    }

    public static void raschetRandoma (){

        Scanner scanner = new Scanner(System.in);
        int[] random = new int[5];

        String[] randomIgr = new String[5];

        int dlina = 1;
        String itog = " ";
        boolean proverka = true;
        Random myRandom = new Random();

        System.out.println("Выберите игроков");

        while (proverka){
            System.out.println(
                            "1) - Булат \n" +
                            "2) - Ринат \n" +
                            "3) - Руслан \n" +
                            "4) - Дима \n" +

                            "0) - Все игроки выбраны? \n");

               int igrok =  scanner.nextByte();


                switch (igrok){

                    case 1:{

                        System.out.println("В игре участвует Булат");

                        byte idBulat = 1;
                        random[1]=1;
                        dlina++;

                        System.out.println("Еще?");
                        randomIgr [0] = "Булат";
                        continue;
                    }

                    case 2:{
                        System.out.println("В игре участвует Ринат");
                        dlina++;
                        random[2]=2;
                        System.out.println("Еще?");
                        randomIgr [1] =  "Ринат";
                        continue;
                    }

                    case 3:{
                        System.out.println("В игре участвует Руслан");
                        dlina++;
                        random[3]=3;
                        randomIgr [2] = "Руслан";
                        System.out.println("Еще?");
                        continue;
                    }

                    case 4:{
                        System.out.println("В игре участвует Дима");
                        dlina++;
                        random[4]=4;
                        randomIgr [3] = "Дима";
                        System.out.println("Еще?");
                        continue;
                    }

                    case 0: {

                        for (int i = 0; i < randomIgr.length; i++) {
                            if (randomIgr[i] == null) {
                               // System.out.println("Никто не участвует");
                                break;
                            }

                            System.out.println("В игре участвуют  " + randomIgr[i]);
                            // System.out.println("Выясняем, кто идет за водkой.... ");
                          //  proverka = false;
                          //  break;
                        }
                        proverka = false;
                        break;
                    }
                    // System.out.println("Выясняем, кто идет за водkой.... ");
                   // proverka = false;
                   // break;
                }

            } // конец вайла

        System.out.println();
        System.out.println("Выясняем, кто идет за водkой.... ");

       int rezultat = myRandom.nextInt( random.length);

        for (int i = 0; i < random.length;i++ ){
            //  for (int i = 0; i < random.length;i++ ){

          if ( random[i] == rezultat) {

              switch (rezultat) {

                  case 1: {
                      itog = "Булат";
                      break;
                  }

                  case 2: {
                      itog = "Ринат";
                      break;
                  }

                  case 3: {
                      itog = "Руслан";
                      break;
                  }

                  case 4: {
                      itog = "Дима";
                      break;
                  }

                  case 10: {
                      itog = "Никто";
                      break;
                  }
                 // default:{
                     // itog = "Никто не идет";
                    //  break;
                //  }
              }
              break;
          }
           // System.out.println("Никто не идет");
           // break;
            }


        System.out.println(itog);


        } // конец метода



} // конец класса
