package com.ru.Random.Voda.com.com.ru.Zadachki;

/**
 * Created by Администратор on 17.02.2017.
 */
public class Book {

   private String name = "Не задано" ;
   private String avtor = "Не задано";
   private int colichestvoStranic;
   private int stoinost;
   private  int kolichestvProdaj;
   private int godVipuska;

    public int getGodVipuska() {
        return godVipuska;
    }

    public void setGodVipuska(int godVipuska) {
        this.godVipuska = godVipuska;
    }

    public String getName() {

        if (name == null) {
            setName("Bvz Не задано");
        }

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvtor() {
        return avtor;
    }

    public void setAvtor(String avtor) {
        this.avtor = avtor;
    }

    public int getColichestvoStranic() {
        return colichestvoStranic;
    }

    public void setColichestvoStranic(int colichestvoStranic) {
        this.colichestvoStranic = colichestvoStranic;
    }

    public int getStoinost() {
        return stoinost;
    }

    public void setStoinost(int stoinost) {
        this.stoinost = stoinost;
    }

    public int getKolichestvProdaj() {
        return kolichestvProdaj;
    }

    public void setKolichestvProdaj(byte kolichestvProdaj) {
        this.kolichestvProdaj = kolichestvProdaj;
    }

    @Override
    public String toString() {
        return
                "Содержимое обьекта Book{" +
                "name='" + name + '\'' +
                ", avtor='" + avtor + '\'' +
                ", colichestvoStranic=" + colichestvoStranic +
                ", stoinost=" + stoinost +
                ", kolichestvProdaj=" + kolichestvProdaj +
                ", godVipuska=" + godVipuska +
                '}';
    }
}
