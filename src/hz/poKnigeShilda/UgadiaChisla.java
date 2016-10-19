package hz.poKnigeShilda;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Администратор on 11.10.2016.
 */
public class UgadiaChisla {

    public static void main(String[] args) {

        ugadai();

    }
    public static void ugadai() {
        int znach = 8;
        boolean proverka = true;

        while (proverka) {

            Random random = new Random();

            znach = random.nextInt(10);
            System.out.println("*************************");
            System.out.println("VIKING SOFT представляют");
            System.out.println("*************************");
            System.out.println("Введите цифру от 0 - 10. \nПроверьте Свою Удачу :))");
          //  System.out.println("Подсказка " + znach);
            Scanner scanner = new Scanner(System.in);
            //  Scanner scanner1 = new Scanner(System.in);

            int counter = scanner.nextInt();

            if (znach == counter) {
                System.out.println("ВЫ угадали. Вы везунчик");
                // proverka = false;
            } else {
                System.out.println("Вы не угадали \nНе растраиваетесь )))");
                // System.out.println("Хотите продолжить нажмите 2");
                if (znach<=5){
                    System.out.println("Подсказка нужное число находится ближе к началу :)))");
                }
                else {
                    System.out.println("Подсказка нужное число находится ближе к концу списка :)))");
                }
            }
            System.out.println("Хотите продолжить нажмите 1 \nВыход из игры нажмите 2");
            counter = scanner.nextInt();

            if (counter == 1) {

            } else if (counter == 2){
                System.out.println("Вы закончили игру");
                System.out.println("Exit");
                proverka = false;
            }
        }


    }
}