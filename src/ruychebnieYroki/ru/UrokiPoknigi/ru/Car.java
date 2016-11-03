package ruychebnieYroki.ru.UrokiPoknigi.ru;

/**
 * Created by Администратор on 02.11.2016.
 */
public class Car {

  public   int fuelToplivo ;
   public int kolichestvoPasajirov;
   public double rashodTopliva;
   public int maxScorost = 210;


   public double tekushaiScorost;
   public double stoimostLitraTopliva = 35;

   public String model ;
    public String svetAvto;


    public double dlinaPuti(){
        return fuelToplivo / rashodTopliva;
    }

    public double maxSkorost (){

        return fuelToplivo * tekushaiScorost;
    }

    public void infaOClasse (){
        System.out.println("Информация о класса CAR");

        System.out.println("Модель машины " + svetAvto +"\n" + "Цвет машины  "+ "\n"+ "Количество пасажиров "+ kolichestvoPasajirov+"\n"+
                "Емкость топливного бака "+ fuelToplivo + "\n" + "" + "Максимальная скорость "+ maxScorost + "\n"+
                "Текущая скорость = "+ tekushaiScorost +"\n"+
                "Текущий расход топлива состявляет "+ tekushiyRashod ()+"\n"+
                "Запас хода на текущий момен состовляет = " + dlinaPuti()+"\n"+
                "Стоимость 1 литра топлива =  " + stoimostLitraTopliva + " руб"+ "\n"+
                "Стоимость содержимого топливного бака состовляет = " + (fuelToplivo *stoimostLitraTopliva) + "\n"+
                " ");


    }

    public double tekushiyRashod (){

      return   tekushaiScorost / rashodTopliva;

    }


}
