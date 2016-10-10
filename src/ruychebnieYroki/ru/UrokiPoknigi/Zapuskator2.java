package ruychebnieYroki.ru.UrokiPoknigi;

import java.util.Scanner;

/**
 * Created by Администратор on 01.08.2016.
 */
public class Zapuskator2 {
    public static void main(String[] args) {

        int[] myMassiv = new int[]{10,50,25,45,18,1};

        String string ;
        char x = 'F';

        Character ch = new Character(x);

        System.out.println(ch);

        ch.charValue();

        string = String.valueOf(ch);
        System.out.println(string);

        raboSMassivami (new int[]{10,50,100,5000} );

        //raboSMassivami123 (new int[] {100,500,5,25,30});

        raboSMassivami123(myMassiv);


    }

    public void pupAge(){
        int age = 0;

        age = age+7;

    }

    public static void raboSMassivami (int[] myArr){
      //  int [] myArr =  myArr[];
        System.out.println(" ");
        System.out.println("Передали массив в метод ");
        int summa = 0;
        int min = 0;
        int max = 0 ;

        for (int i = 0; i < myArr.length; i++){

//            if (myArr[0] == 0){
//
//            }
             min = myArr[0];
             max = myArr[0];
            System.out.println("Значение элемента массива = "+myArr[i]);
            summa += myArr[i];

            if (min > myArr[i]){
                min = myArr[i];
            }

            if (max < myArr[i]){
                max = myArr[i];
            }
        }
        System.out.println("Сумма всез значений массива = " + summa);
        System.out.println("Минимальное значений массива = " + min);
        System.out.println("Максимальнон значений массива = " + max);
    }

    public static void raboSMassivami123 (int[] myArr){
        //  int [] myArr =  myArr[];
        System.out.println(" ");
        System.out.println("Передали массив в метод ");
         System.out.println("*");
        int summa = 0;
        int min = 0;
        int max = 0 ;
        int kolichestvoCikle = 0 ;
       boolean shethic = true;

        for (int i = 0; i < myArr.length; i++){

            min = myArr[0];
            max = myArr[0];
            kolichestvoCikle++;
            System.out.println("Значение элемента массива = "+myArr[i]);

            summa += myArr[i];

            if (min > myArr[i]){
                min = myArr[i];
            }

            if (max < myArr[i]){
                max = myArr[i];
            }
        }
        System.out.println(" ");
        Scanner scanner = new Scanner(System.in);

        while (shethic) {

            System.out.println("Если хотите узнать общую сумму всех элементов! То нажмите 1 или наберите summa");
            System.out.println("Если хотите узнать Минимльное значение элементо массива! То нажмите 2 или наберите min ");
            System.out.println("Если хотите узнать Максимальное значение элементо массива! То нажмите 3 или наберите max ");
            System.out.println("Если хотите узнать Количество циклов данном массиве! То нажмите 5 или наберите количество ");
            System.out.println("Полная инфа о Массиве Нажмите 6 или наберите infa");
            System.out.println("Для выхода напишите 0 или выход");
            System.out.println(" ");

            String vVedenieDannie = scanner.nextLine();

            switch (vVedenieDannie) {

                case "1":
                case "summa": {
                    System.out.println("Сумма всез значений массива = " + summa);
                    break;
                }
                case "2":
                case "min": {
                    System.out.println("Минимальное значений массива = " + min);
                    break;
                }

                case "3":
                case "max": {
                    System.out.println("Максимальнон значений массива = " + max);
                    break;
                }

                case "0":
                case "выход": {
                    shethic = false;
                    System.out.println("Вы вышли из метода работы с массивом");
                    break;
                }

                case "количествa":
                case "5":{
                    System.out.println("Количество циклов отработавщим в данном массиве "+ kolichestvoCikle);
                    System.out.println(" ");
                    break;
                }

                case "infa":
                case "6":{
                    System.out.println("Полная инфа о Массиве");
                    for (int chetchi : myArr ){
                        System.out.println(chetchi);
                    }
                    System.out.println(" ");
                    System.out.println("Сумма всез значений массива = " + summa);
                    System.out.println("Минимальное значений массива = " + min);
                    System.out.println("Максимальнон значений массива = " + max);
                    System.out.println("Количество циклов отработавщим в данном массиве "+ kolichestvoCikle);
                    break;


                }

                default:{
                    System.out.println("Введены не коректные даные");
                }

            }
        }

      //  System.out.println("Сумма всез значений массива = " + summa);
       // System.out.println("Минимальное значений массива = " + min);
        //System.out.println("Максимальнон значений массива = " + max);
    }

}//конец класса
