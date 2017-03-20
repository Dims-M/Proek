package bu.book.myBooks;

import java.io.*;
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

/**
 * Created by Администратор on 17.03.2017.
 */
public class Book {

    String avtor;
    String nameKniga;
    String janr;
    String izdatel;
    String kachestvo;
    int kolichestvoStranich;
    int prais;
    int godVipuska;

    String infaOClasse = "Родительский класс 'Книги'\n";

    // Конструктор
    Book() {

    }

    public String infaOKnige() {
        String infaOknige =
        "Название книги" +nameKniga+
                "Автор книги " + avtor + "\n" +
                "Жанр книги " + janr + "\n" +
                "Издатель книги " + izdatel + "\n" +
                "Качество книги " + kachestvo + "\n" +
                "Количество страниц в книге " + kolichestvoStranich + "\n" +
                "Цена книги " + prais + "\n" +
                "Год выпуска книги " + godVipuska + "\n" ;

        //System.out.println(infaOknige);
        return infaOknige;
    }


    protected void sozdanieBooks(){

        Scanner scannerVoda = new Scanner(System.in);
        System.out.println("Происходит создание книги... \n");

        System.out.println("Введите Название книги и нажмите ENTER \n");
        nameKniga = scannerVoda.nextLine();

        System.out.println("Введите Автора книги и нажмите ENTER \n");
        avtor = scannerVoda.nextLine();

        System.out.println("Введите Жанр книги и нажмите ENTER \n");
        janr = scannerVoda.nextLine();

        System.out.println("Введите Издателя книги и нажмите ENTER \n");
        izdatel = scannerVoda.nextLine();

        System.out.println("Определите Качество книги и нажмите ENTER \n");
        kachestvo = scannerVoda.nextLine();

        System.out.println("Введите количество страниц в этой книги и нажмите ENTER \n");
        kolichestvoStranich = scannerVoda.nextInt();

        System.out.println("Введите стоимость книги и нажмите ENTER \n");
        prais = scannerVoda.nextInt();

        System.out.println("Введите год выпуска книги и нажмите ENTER \n");
        godVipuska = scannerVoda.nextInt();

        zapisDannihKnigiVfail(infaOKnige());

    }

    protected void zapisDannihKnigiVfail(String kniga){

             // место сохоанения лога
            String mestoHranenieFails = "C:\\zadachki\\Myknigi_"+ nameKniga+".txt";
            String myObject = kniga;

        // работаем с Датой
        Date myDate = new Date();
        // Создали обьект для вывода форматирования датой
        SimpleDateFormat mysimpleDateFormat = new SimpleDateFormat("'ДАТА Cоздания: 'E dd.MM.yyyy' Time: ' hh:mm:ss \n");
        // В строке записываем настройки форматирования
        String myDateFormat =  mysimpleDateFormat.format(myDate);

        try {

            // обьект для создания
            File moiFail = new File(nameKniga);

            // проверяем. Если файл с таким именем не существует то создаем новый файл
            if (!moiFail.exists()) {
                // если файл не существует то созадем его
                moiFail.createNewFile();
            }
            // обьект для фактичекой записи текста в файд. 2й параметр указывает на дозапись данных в конец строки
            FileWriter myZapisFaila = new FileWriter(mestoHranenieFails, true);

            myZapisFaila.append(myDateFormat);
            myZapisFaila.append(" \n");
            myZapisFaila.append(myObject);
            myZapisFaila.append(" \n");
            myZapisFaila.flush();


        } // конец трая
        catch (IOException e) {
            System.out.println("Ошибка при создании файла файла");
            e.printStackTrace();
        }
    }

    protected void cheniefaila (String str){

        String obektChenia =  str;

       try {
          FileReader fileWriter = new FileReader(obektChenia);
           // Создаем оьект для чтение файла. В качестве парамтера указываес в стринге откуда роизводить чтение

           // читаем посимвольно
           int c;
           // В переменную с запысываем символьный тип данных.
           while((c = fileWriter.read())!=-1){
               // перебераем в цикле построчно с помощью метода reader.read() все сттроки и символы в текстовом файле.
               System.out.print((char)c);
               // выводим  и приводим интовые значения к симловам
           }
       }
        catch (Exception E){
            System.out.println("Ошибка чтения");
        }

    }

    protected void glavnoeMenu() {

        boolean meny = true;
        boolean glavnoeMeny = true;

        String str =" " ;
        int a = 5;
        while (glavnoeMeny) {
            System.out.println("Добавления Книги");

            while (meny) {
                System.out.println("Вы хотите зарегистрировать новую книгу?" + "\n" + "\n" +
                        "Если ДА нажмите(введите) 1(Да) и ENTR, \n" + "Если отменить то нажмите(введите) 0(Нет) ");

                Scanner vvod = new Scanner(System.in);
                int viborRegistracii = vvod.nextInt();

                if (viborRegistracii > 0) {

                    switch (viborRegistracii) {

                        case 1: {
                            System.out.println("Создание новой книги");
                            // Создаем книгу с заполнением параметров
                            sozdanieBooks();
                            meny = false;
                            break;
                        }

                        case 0: {
                            System.out.println("Отмена...выход..из меню...");

                            meny = false;
                            break;
                        }
                    }
                }


            } // конец вайла


            { // Тестовой блок

                System.out.println("Просмотреть созданную книгу? ");
                System.out.println("Да (1)");
                System.out.println("Нет, выход из программы (0)");
                Scanner scannerPeredVihodjv = new Scanner(System.in);

                int proverkaPeredVihodom = scannerPeredVihodjv.nextInt();

                switch (proverkaPeredVihodom){

                    case 1 : {
                        infaOKnige();
                    }

                    case 0: {
                        System.out.println("Выход из программы");
                        glavnoeMeny = false;
                    }

                } // конец свича


            }


        } // конец главного вайпа
    }
} // коней класса Book