package hz.poKnigeShilda;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Администратор on 19.10.2016.
 */
public class UgadivaemChisli_S_While {

    public static void main(String[] args) {

        ugadivaemChisli_S_While();

    }

    public static void ugadivaemChisli_S_While (){

        boolean proverka = true;

        System.out.println("Угадываем введенное число с помощью цикла While");
        Random random = new Random();
        int chislo = random.nextInt(10);
        System.out.println("Подсказка "+ chislo);

        while (proverka){

            System.out.println("Введите цифру и нажмите Ентер\n" +" Для выхода нажмите 0");

            Scanner scanner = new Scanner(System.in);
            int vedenieChisla = scanner.nextInt();

           // System.out.println("Введите цифру и нажмите Ентер");
            if (chislo == vedenieChisla && chislo > 0 ){
                System.out.println("Вы угадали! Поздравляем");
                proverka = false;
               break;
            }
            if (chislo == 0  ){
                System.out.println("Выходим из программы");
                proverka = false;
                break;
            }
            else {
                System.out.println("Вы не угадали. Попробуйте еще");
              //  break;
            }

            if (chislo == 10 && chislo > 0 ){
                System.out.println("********************");
            }

        } // конец цикла

    }
}
