package ruychebnieYroki.com.moyRoboti;

/**
 * Created by Администратор on 08.09.2016.
 */
public class VsakoRaznoe {

    double ferst = 99;

    public  void testFerst (double count){
        System.out.println("Текущие значение =  "+ count);
        count++;
        System.out.println("Текущие значение =  "+ count);

        System.out.println("Текущие значение локальной переменной =  "+ ferst);
    }

}
