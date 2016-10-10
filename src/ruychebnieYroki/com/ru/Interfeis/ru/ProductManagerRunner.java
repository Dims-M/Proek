package ruychebnieYroki.com.ru.Interfeis.ru;

/**
 * Created by Администратор on 17.08.2016.
 */
public class ProductManagerRunner {

    public static void main(String[] args) {

      // int zvezdaCaunt = 10;

ProductManager productManager = new ProductManager("Михалыч");


        System.out.println("Инфа о Начальнике!!!");
        System.out.println(productManager);

        System.out.println("Product Manager's methods:");
        productManager.doJob();
        productManager.getPowerOverDevelopers();
        //provtrka ();
      //  zvezbochka ();
       // pereschetChisla(200);
        poluyPramougolnik (25);
        poluyTreugolnik(10);
        poluyTreugolnikObr (10);

    }

    public static void provtrka (){

        int x = 10;
        int a = x++; // сначало а присваивается значение х. А потом в переменную х присваиваются значенние ++
        System.out.println("x=" + x);
        System.out.println("a=" + a);

        System.out.println("*****");
        int b = 5;
        int a1 = 12;
        int c = ++a1 - b++; // 13 - 5 // 9
        System.out.println(c);
        int d = b++ * 2; // 12
        System.out.println(d);

        System.out.println("*****");
        boolean a2 = true;
        boolean b2 = false;
        boolean c2 = true;
        boolean result = a2 && (b2 || c2);
        System.out.println(result);


    }

    public static void zvezbochka (){
        int zvezdaCaunt = 10;

        for (int x = 0; x < zvezdaCaunt; x++){

            for (int i = 0; i< zvezdaCaunt; i++  ) {
                 System.out.print("*");

              }

              System.out.println("");
             }

           }

    public static void treugolnikZveda (){
        int zvezdaCaunt = 10;

        for (int n =0; n<zvezdaCaunt; n++){
            System.out.println("*");
        }

    }


    public static void pereschetChisla (int znach){
        int number = 1;   // Начальное число
        int sum = 0;      // Переменная для хранения суммы
        int count = 0;    // Количество чисел - в начале ни одного
        int max = znach;    // Предел суммы

        for(;;) {
            sum += number;    // Увеличиваем сумму // = 1
            if(sum > max) {   // Проверяем сумму - если больше
                break;            // То эта точка является точкой выхода при достижении числа нужной суммы в переменной sum
            }
            if (number >= 31 && number<35){
                System.out.println("Cработал оператор continue");
                count++;
                continue;

            }
            else {
                count++;          // А здесь просто увеличиваем количество чисел
                // узнаем количество циклов
                System.out.println("Количество циклов "+number);
            }
            number += 10;    // Увеличиваем число на 10

        }
        System.out.println("Количество циклов = " + count + " Общая сумма "+ sum);
    }

    public static void poluyPramougolnik (int znach ){

        int count = znach;

        // Внешний zцикл
        for(int i=0; i < count; i++) {
            // Внутренний цикл для печати одной строки
            for(int k=0; k < count; k++) {
                // Вот наше сложное условие
                if(k==0 || k==count-1 || i==1 || i==count-1) {
                    //
                    System.out.print("*");
                } else {
                    System.out.print("-");
                }
            }
            // Переход на следующую строку
            System.out.println();
        }

    }

    public static void  poluyTreugolnik (int znach) {
        int count = znach;

        // Внешний цикл
        for (int i = 0; i < count; i++) {
            for (int k = 0; k < i + 1; k++) {
                // Здесь условие даже немного проще
                if (k == 0 || k == i || i == count - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // Переход на следующую строку
            System.out.println();
        }
    }

    public static void  poluyTreugolnikObr (int znach){
        int count = znach;

        // Внешний цикл
        for (int i = 0; i < count; i++) {
            for (int k = 0; k < i + 1; k++) {
                // Здесь условие даже немного проще
                if (k == 0 || k == i || i == count - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // Переход на следующую строку
            System.out.println();
        }
    }






  } // конец класса

