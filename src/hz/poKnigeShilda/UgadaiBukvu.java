package hz.poKnigeShilda;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Администратор on 19.10.2016.
 */
public class UgadaiBukvu {

    public static void main(String[] args) {

        ugadaiBukvy();
    }

    public static void ugadaiBukvy (){

        char bukva = 'd';

        char qwert = 'q';

         Random random = new Random();
        qwert = (char) random.nextInt(125); // Генерирует символы с клавы!!

        boolean proverka = true;
        System.out.println("Введите букву с клавиатуры");

        System.out.println("Подсказка "+ qwert);
        Scanner scanner = new Scanner(System.in);
        String tempBukva =  scanner.nextLine();

        Character abs = '0';



        char a = tempBukva.charAt(0);
    //    abs.charValue(tempBukva);
        while (proverka){



            int qwe =0 ; qwe++;
            if (bukva == a){
                System.out.println("Значение а = "+ a);

                if (qwe == 5){
                    proverka = false;
                    break;
                }
                break;
            }

            else {
                System.out.println("Вы ввели не правельный символ");
                break;
            }

        }

    }

}
