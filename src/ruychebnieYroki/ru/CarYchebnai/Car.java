package ruychebnieYroki.ru.CarYchebnai;

/**
 * Created by Администратор on 22.05.2016.
 */
public class Car {

    // Переменные
    private String tipAvto = "Спортивная";
    private String color = "Красный";
    private String cope = "Купе";
    private String proizvoditel = "Запарозец";

    int prais = 10000000;

    // конструкторы
    public Car(String tipAvto, String color, String cope, String proizvoditel) {
        this.tipAvto = tipAvto;
        this.color = color;
        this.cope = cope;
        this.proizvoditel = proizvoditel;
    }

    // Метод типа консткурктора
    public  void setCarUstanovitZnach (String tip,String cvetAvto,String kuzov, String proz ){
        tipAvto = tip;
        color = cvetAvto;
        cope = kuzov ;
        proizvoditel = proz;
    }

    // Методы
    public void uskorenie (){
        System.out.println(proizvoditel+ "Резко ускорилось вперед.....");
    }

    public int ezda (int znachenie ) {

        System.out.println("Начальная Скорость машины  0 км в час");
        uskorenie();

        if (znachenie <= 120) {
            for (int i = 0; i <= znachenie; i++) {
                System.out.println("Скорость " + i + "Км/чвс"); // Выводим скорость машины
            }
            System.out.println("Машина разогналась до " + znachenie + " Км за 3,5 Секунды");
        }
        if (znachenie > 120  & znachenie < 250){
            for (int i = 0; i <= znachenie; i++) {
                System.out.println("Скорость " + i + "Км/чвс"); // Выводим скорость машины
            }
            System.out.println("Машина разогналась до " + znachenie + " за 8,5 Секунды");
        }




        return znachenie;
    }

    public void infaOCar (){
        System.out.println( "Тип авто: "+ tipAvto);
        System.out.println("Тип кузова: "+ cope);
        System.out.println( "Цвет авто: "+ color);
        System.out.println("Производитель автомобиля: "+ proizvoditel);
    }

    // конец класса
}
