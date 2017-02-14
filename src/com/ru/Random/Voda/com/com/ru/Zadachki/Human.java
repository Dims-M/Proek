package com.ru.Random.Voda.com.com.ru.Zadachki;

/**
 * Created by Администратор on 14.02.2017.
 */
public class Human {

    //
    String name;
    String opit;
    int vozrast;

    public Human(String name, String opit, int vozrast) {
        // Коннструктор
        this.name = name;
        this.opit = opit;
        this.vozrast = vozrast;
    }

    @Override
    public String toString() {
        return "\n Имя " + name+"(a) "+
                "\n Опыт " + name+"(a) " + opit+
                "\n Возраст " + name+"(a) " + vozrast+ "";
    }


}
