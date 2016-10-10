package ruychebnieYroki.ru.UrokiPoknigi.ru.PotopiSait2;

import java.util.ArrayList;

/**
 * Created by Администратор on 12.07.2016.
 */
public class DotCom {

    // Место обьявления переменных

    //  private int locationCells[]; // массив для хранеиния адреса ячеек . Размерность будем определять во время заполнеия(инициализации)

    private ArrayList<String> locationCells;//      = new ArrayList<String>();

    private int numOfHits = 0; // переменная для хранения количество попаданий  или выстрелов


    // Cеттеры и Геттеры
    public ArrayList<String> getLocationCells() {
        return locationCells;
    }

    public void setLocationCells(ArrayList locationCells) {
        //if (locationCells ) // Проверка на отрицательные значения
        this.locationCells = locationCells;
    }

    // Методы
    public String checkYourself(String userGues) { // метод обрабатывает веденные данные(ходы игрока)

        // int gues = Integer.parseInt(userGues); // Приведение типов стринг в инт
        // System.out.println(userGues);

        String result = "Мимо цели";

        int index = locationCells.indexOf(userGues);

        if (index >= 0) { // проверяем на нахождение числа в массиве. Если оно есть то фиксируется попадание
            // и ячейка удаляется из массива
            locationCells.remove(index);
        }

        if (locationCells.isEmpty()) { //проверяем массив на отсуствие данных. Если их нет то считается что все цели
            // поражены
            result = " Потопил";
        } else {
            result = "Пападание";
        }

        return result;

    }

} // конец класса