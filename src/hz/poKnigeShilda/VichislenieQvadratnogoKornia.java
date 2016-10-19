package hz.poKnigeShilda;

/**
 * Created by Администратор on 14.10.2016.
 */
public class VichislenieQvadratnogoKornia {


    public void vichisleniQvadratKornia () {
        System.out.println("Для вычисления квадратного корня");

        double num, sroot, res;

        for (num = 1.0; num < 100; num++){

            sroot = Math.sqrt(num);

            System.out.println("Квардратный корень из "+ num+" = "+ sroot);

            res = num - (sroot * sroot); // вычисляем ошибку огруглению
            System.out.println("Ошибка округления "+ res);



        }

    }

}
