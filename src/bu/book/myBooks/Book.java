package bu.book.myBooks;

import java.util.Scanner;

/**
 * Created by Администратор on 17.03.2017.
 */
public class Book {

    String avtor;
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

    protected void infaOKnige() {
        System.out.println("Автор книги " + avtor + "\n" +
                "Жанр книги " + janr + "\n" +
                "Издатель книги " + izdatel + "\n" +
                "Качество книги " + kachestvo + "\n" +
                "Количество страниц в книге " + kolichestvoStranich + "\n" +
                "Цена книги " + prais + "\n" +
                "Год выпуска книги " + godVipuska + "\n");

    }

    protected void sozdanieKnigi() {

        boolean meny = true;
        boolean glavnoeMeny = true;
        int a = 0;
        while (glavnoeMeny) {

            while (meny)
                System.out.println("Вы хотите зарегистрировать новую книгу?" + "\n" +
                        "Если ДА нажмите(введите) 1(Да) и ENTR, \n" + "Если отменить то нажмите(введите) 0(Нет) ");

            Scanner vvod = new Scanner(System.in);

            if (vvod.equals(a)) {
                int viborRegistracii = vvod.nextInt();

                switch (viborRegistracii) {

                    case 1: {
                        System.out.println("Создание новой книги");

                        break;
                    }

                    case 0: {
                        System.out.println("Отмена...выход..из меню...");
                        meny = false;
                        break;
                    }
                }
            } else {
                String viborRegistracii = vvod.nextLine();

                switch (viborRegistracii) {

                    case "Да":
                    case "да": {
                        System.out.println("Создание новой книги");

                        break;
                    }

                    case "Нет":
                    case "нет": {
                        System.out.println("Отмена...выход..из меню...");
                        meny = false;
                        break;
                    }
                }
            }


            System.out.println("Выход из программы...");
            glavnoeMeny = false;

        } // кокею.нец вайла главного м
    }
} // коней класса Book