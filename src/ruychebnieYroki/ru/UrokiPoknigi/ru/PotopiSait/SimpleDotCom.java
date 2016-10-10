package ruychebnieYroki.ru.UrokiPoknigi.ru.PotopiSait;

import java.util.Random;

/**
 * Created by Администратор on 12.07.2016.
 */
public class SimpleDotCom {

    // Место обьявления переменных

    private int locationCells[]; // массив для хранеиния адреса ячеек . Размерность будем определять во время заполнеия(инициализации)

   private int numOfHits = 0; // переменная для хранения количество попаданий  или выстрелов

    int randomm = (int) (Math.random ()*5); // c помощью метода рандом заполняем случайным числом от 0 до 4  и приводим к типу инт

  int [] locationCells1 = {randomm, randomm+1, randomm+2}; // c помощью рандомной функции заполняем массив случайным даными

    // Cеттеры и Геттеры
    public int[] getLocationCells() {
        return locationCells;
    }

    public void setLocationCells(int[] locationCells) {
        //if (locationCells ) // Проверка на отрицательные значения
        this.locationCells = locationCells;
    }

    // Методы
    public String checkYourself(String userGues) { // метод обрабатывает веденные данные(ходы игрока)

        int gues = Integer.parseInt(userGues); // Приведение типов стринг в инт
        System.out.println(userGues);

        boolean isActive = true; // для цикла while . Цикл будет идти пока не потопим корабль
        String result = "Мимо цели ";
        final String result123 = "Ваш выстрел: ";

        while (isActive == true) {

            for (int cell : locationCells1) {  // цикл фор ич для перебора данных в массиве. Поиск овпадений в массиве

                if (gues == cell) { // сравнение веденного пользователя числа с сохраненными координатами корабля.
                    System.out.println(result123 + "Попадание");

                    numOfHits++; // сохраняем реальные попадания
                    // break; // выход из условного оператора.
                }

                if (numOfHits > 0 & numOfHits < locationCells.length) {
                    System.out.println("Вы подбили корабль");
                }

                if (numOfHits == locationCells.length) { // Проверка попfдани с массивоa адресов кораблей
                    // если они равны то корабль полностью потоплен.
                    result = "Потопили";
                    System.out.println("Gjnjgbkb нахрен");
                    isActive = false;
                }

                System.out.println("Корабль еще на плаву.");

                return result;

            }
        }
           return userGues;


        //логики методов
    }

}

