package bu.book.myBooks;

import java.util.Scanner;

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

    public void infaOKnige() {
        System.out.println("Название книги" +nameKniga+
                "Автор книги " + avtor + "\n" +
                "Жанр книги " + janr + "\n" +
                "Издатель книги " + izdatel + "\n" +
                "Качество книги " + kachestvo + "\n" +
                "Количество страниц в книге " + kolichestvoStranich + "\n" +
                "Цена книги " + prais + "\n" +
                "Год выпуска книги " + godVipuska + "\n");

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

    }

    protected void zapisDannihKnigiVfail(){

        // место сохоанения лога
            String mestoHranenieFails = "C:\\zadachki"+ nameKniga+"txt";


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