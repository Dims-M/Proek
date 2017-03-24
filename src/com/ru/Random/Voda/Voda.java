package com.ru.Random.Voda;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Администратор on 14.03.2017.
 */
public class Voda {

   static String mestoHraneniaLoga = "Log.txt";

    public static void main(String[] args) {
        raschetRandoma();

    }

    public static void raschetRandoma() {

        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        int[] random = new int[9];
        String[] randomIgr = new String[9];


        int dlina = 0;
        String itog = "лгннг";
        String vihodIzProgrammi = " ";


        boolean proverka = true;
        boolean vihod = true;
        boolean Proveka2 = true;

        Random myRandom = new Random();
        //  int rezultat =  myRandom.nextInt(random.length);

        System.out.println("Выберите игроков");

        try {


            while (proverka) {
                System.out.println(
                        "1) - Булат \n" +
                                "2) - Ринат \n" +
                                "3) - Руслан \n" +
                                "4) - Дима \n" +
                                "5) - Максим \n" +
                                "6) - Адель \n" +
                                "7) - Марат\n" +
                                "8) - Искандер\n" +
                                "***********************************\n" +
                                "9) - Просмотреть кто выйграл ранее \n" +
                                "0) - Все игроки выбраны? \n"+
                                "15) - Удаление истории \n"+
                                "10)- Выход \n");


                int igrok = scanner.nextByte();


                switch (igrok) {

                    case 1: {

                        System.out.println("В игре участвует Булат");

                        byte idBulat = 1;
                        random[1] = 1;
                        dlina++;

                        System.out.println("Еще?");
                        randomIgr[0] = "Булат";
                        continue;
                    }

                    case 2: {
                        System.out.println("В игре участвует Ринат");
                        dlina++;
                        random[2] = 2;
                        System.out.println("Еще?");
                        randomIgr[1] = "Ринат";
                        continue;
                    }

                    case 3: {
                        System.out.println("В игре участвует Руслан");
                        dlina++;
                        random[3] = 3;
                        randomIgr[2] = "Руслан";
                        System.out.println("Еще?");
                        continue;
                    }

                    case 4: {
                        System.out.println("В игре участвует Дима");
                        dlina++;
                        random[4] = 4;
                        randomIgr[3] = "Дима";
                        System.out.println("Еще?");
                        continue;
                    }

                    case 5: {
                        System.out.println("В игре участвует Максим");
                        dlina++;
                        random[2] = 2;
                        System.out.println("Еще?");
                        randomIgr[1] = "Максим";
                        continue;
                    }

                    case 6: {
                        System.out.println("В игре участвует Адель");
                        dlina++;
                        random[2] = 2;
                        System.out.println("Еще?");
                        randomIgr[1] = "Адель";
                        continue;
                    }

                    case 7: {
                        System.out.println("В игре участвует Марат");
                        dlina++;
                        random[2] = 2;
                        System.out.println("Еще?");
                        randomIgr[1] = "Марат";
                        continue;
                    }

                    case 8: {
                        System.out.println("В игре участвует Искандер");
                        dlina++;
                        random[2] = 2;
                        System.out.println("Еще?");
                        randomIgr[1] = "Искандер";
                        continue;
                    }


                    case 9: {
                        chenieFaila();
                        //  proverka = false;
                        Proveka2 = false;
                        break;
                    }
                    case 10: {

                        if (igrok == 0) {
                            System.out.println("-------------------------------");
                            System.out.println("Вы не выбрали ни одну жертву?? ");
                            System.out.println("Хотите выбрать Руслана?? ))) \n");
                            System.out.println("-------------------------------");

                        }
                        proverka = false;
                        Proveka2 = false;
                        vihod = false;
                        break;
                    }

                    case 15: {
                      //  udalenieLoga ();
                        File file = new File("Log.txt");
                        File  newFile = new File("LogHistoriOld.txt");
                        //***************
                        copy(file,newFile );
                        ///////////////////

                        System.out.println("Удаление файлов истории");
                        proverka = false;
                        Proveka2 = false;
                        vihod = false;
                        break;
                    }


                        case 0: {

                            for (int i = 0; i < randomIgr.length; i++) {
                                if (randomIgr[i] == null) {
                                    // System.out.println("Никто не участвует");
                                    break;
                                }

                                System.out.println("В игре участвуют  " + randomIgr[i]);
                                System.out.println("*************");
                                // System.out.println("Выясняем, кто идет за водkой.... ");
                                //  proverka = false;
                                //  break;
                            }
                            proverka = false;
                            break;

                        }

                    default: {
                        System.out.println("Нажaли не туда и не то");
                        proverka = false;
                        break;
                    }
                    // System.out.println("Выясняем, кто идет за водkой.... ");
                    // proverka = false;


                } // конец вайла
            }


            while (Proveka2) {
                System.out.println();
                //  System.out.println("Выясняем, кто идет за водkой.... ");
                int rezultat = myRandom.nextInt(dlina);

                for (int i = 0; i < random.length; i++) {
                    //  for (int i = 0; i < random.length;i++ ){

                    if (random[i] == rezultat) {

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

                            case 0: {
                                itog = "Викинг";
                                break;
                                // itog = "Никто не идет";
                            }

                        }

                    }
                }

                System.out.println("Выясняем, кто идет за водkой.... ");
                System.out.println(itog);
                zapisFaila(itog);
                System.out.println("*************");
                System.out.println("Для Выхода из программы наберите exit или 0");
                Proveka2 = false;
            } // конец проверка Proveka2

            while (vihod) {
                vihodIzProgrammi = scanner2.nextLine();
                // System.out.println("Для Выхода из программы наберите exit или 0");
                //vihodIzProgrammi = scanner2.nextLine();

                switch (vihodIzProgrammi) {
                    case "exit":
                    case "выход":
                    case "0":
                    case "Выход":
                        vihod = false;
                        System.out.println("Выход....");
                        break;
                }
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Ошибка епте");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Ошибка при копировании файла");
        } finally {
            System.out.println("Началось форматирование диска С:");
        }
        System.out.println();
        // конец метода
    }


    public static void zapisFaila(String logirovanie) {

       // String mestoHraneniaLoga = "Log.txt";

        // Работа с датой
        Date myData = new Date();
        // создаем обьект для форматирования даны(с помощью патерна(шаблона))
        SimpleDateFormat simpleFormatData = new SimpleDateFormat("'ДАТА Игры: 'E dd.MM.yyyy' Time: ' hh:mm:ss \n");
        String vivodDate = simpleFormatData.format(myData);

        try {
            File moiFail = new File(mestoHraneniaLoga);

            if (!moiFail.exists()) {
                // если файл не существует то созадем его
                moiFail.createNewFile();
            }

            // создаем файл для открыт ия текстового файла.
            FileWriter writer = new FileWriter(mestoHraneniaLoga, true);

            String zapisV_log = "За водицей ходил " + logirovanie + "\n";

            // добавить(записать) данные в файл.
            writer.append(zapisV_log);
            writer.append(vivodDate);
            writer.append("\n");

            // Запись из буфера в файл
            writer.flush();
            //закрыть поток
            writer.close();


        } // конец "тру"
        catch (IOException e) {
            System.out.println("Ошибка при записи файла");
        } finally {
            System.out.println("Программа будет закрыта. ");
        }
    } // конец метода


    public static void chenieFaila() {
        String obejtChenia = "Log.txt";

        try {


            FileReader fileReader = new FileReader(obejtChenia);

            int c;
            // Записываем в переменную int c байтовые значения. Пока
            // в обьекте fileReader есть какие либо значения. И ОНИ НЕ равны -1
            while ((c = fileReader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (Exception e) {
            System.out.println("Ошиька при чтении файла");
        }
    }

    public static void udalenieLoga () {
        boolean her = true;
        while (her) {
            Scanner scanner = new Scanner(System.in);

            String pass = scanner.nextLine();
            String parol = "123";


            if (pass.equals(parol)) {
                System.out.println("Удаление истории Позора");

                try {

                    copyFileUsingJava7Files();


                } catch (Exception e) {
                    System.out.println("Ошибка при копировании файла");
                }

            }
            Scanner scanner1 = new Scanner(System.in);
            int temp123 = scanner1.nextInt();
            if (temp123 == 12345){
                her = false;
            }
        }

    }


    public static void copy(File source, File dest) throws IOException {
        Files.copy(source.toPath(), dest.toPath());
    }

    private static void copyFileUsingJava7Files() {

        //переуменование файла
        File file = new File("Log.txt");
        File  newFile = new File("LogHistoriOld.txt");

       try {
       if (!newFile.exists()) {
            // если файл не существует то созадем его
            newFile.createNewFile();
         //  file.renameTo(new java.io.File("LogHistoriOld.txt"));
       }
        }
        catch (Exception ex){
            System.out.println("Ошибка создания файла при переименования лога");
        }


        if(file.renameTo(newFile)){
            System.out.println("Файл перемещен успешно");;
        }else{
            System.out.println("Файл не был перемещен");
        }
    }


} // конец класса

