package ruychebnieYroki.ru.UrokiPoknigi;

/**
 * Created by Администратор on 06.07.2016.
 */
public class Dogi {

    String name = " ";
    String poroda = " ";

    int vozrast = 0;

    public String getName() {
        return name;
    } //Получить Имя!!!

    public void setName(String name) {
        this.name = name;
    } // Установить записать Имя


    public String getPoroda() {
        return poroda;
    }

    public void setPoroda(String poroda) {
        this.poroda = poroda;
    }

    public int getVozrast() {
        return vozrast;
    }

    public void setVozrast(int vozrast) {

        if (vozrast<20)
        this.vozrast = vozrast;

        if (vozrast <=0){
            System.out.println("Не коректный возрарст.");
        }

        else {
            System.out.println(" Кошки не живут 20 лет");

        }
    }

    public void laet (int x) {
        int a = x;
        int i = 0;
        if (a != 0) {

            while (i < a) {
                System.out.println("Собака " + name + " Лает");
                i++;
            }
        }
        else {
            System.out.println("Собака " + name + " Лает");
        }
    }
    public void begaet() {
        System.out.println("Собака бежит");
    }


}

