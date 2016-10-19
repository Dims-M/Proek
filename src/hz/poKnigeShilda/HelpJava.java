package hz.poKnigeShilda;

import java.util.Scanner;

/**
 * Created by Администратор on 13.10.2016.
 */
public class HelpJava {

   private static boolean vihodIzukla = true;


    public static void main(String[] args) {

        spravkaPoJave ();

    }
    public static void spravkaPoJave () {

        while (vihodIzukla) {

            System.out.println("Краткая справка по Jave \n");

            System.out.println("По управляющими операторами if  Нажмите 1");
            System.out.println("По управляющими оператору switch Нажмите 2");
            System.out.println("Для выхода нажмите 0  ");

            Scanner scanner = new Scanner(System.in);
            Scanner scanner1 = new Scanner(System.in);
            int znach = scanner.nextInt();

            switch (znach) {

                case 1: {
                    System.out.println(" if Это оператор условного перехода. Он направляет выполнение программы по двум разным маршрутам. В зависимости от истиности условия \n ");
                    break;
                }

                case 2: {
                    System.out.println("Команду switch часто называют командой выбора. " +
                            "Оператор switch Это Java - оператор множественного ветвления. " +
                            "Он переключает выполнение на различные части кода программы, основываясь на значении выражения, и часто обеспечивает лучшую альтернативу, чем длинный ряд операторов if-eise-if.\n  ");
                    break;
                }

                case 0: {
                    System.out.println("Выход из справки...");
                    System.out.println("Exit");
                    vihodIzukla = false;
                }

            }

        }
    }
}
