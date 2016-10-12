package hz.poKnigeShilda;

import java.util.Scanner;

/**
 * Created by Администратор on 11.10.2016.
 */
public class SkorostZvuka {

   final double skorostZvuka = 331;

    double count = 0;


    public  void raschetZvuka (){

        System.out.println("Введите число через сколько секунд вы услышили звуки грома после вспbшки. ");
        Scanner scanner = new Scanner(System.in);

        count = (int)scanner.nextInt();

        System.out.println("Растояние до источника звука = "+ (skorostZvuka*count+ " метров"));

    }

}
