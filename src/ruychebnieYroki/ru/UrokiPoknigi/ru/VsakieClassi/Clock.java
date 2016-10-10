package ruychebnieYroki.ru.UrokiPoknigi.ru.VsakieClassi;

/**
 * Created by Администратор on 11.07.2016.
 */
public class Clock {

    private String time;
    private String tempFild;

    public String getTime() { // Получить или узнать время

        if (time == null)
            System.out.println("Неустановленный, пустой параметр");

            return time;

    }

    public void setTime(String time) { // установить иди записать время
        this.time = time;
       tempFild=time;

    }

    public void tempFun (){
        System.out.println(tempFild);
    }


}
