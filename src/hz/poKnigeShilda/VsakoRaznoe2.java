package hz.poKnigeShilda;

/**
 * Created by Администратор on 22.11.2016.
 */
public class VsakoRaznoe2 {


   // public static void ocheredNe (){
      String infoOClasse = "Данный метод реализовывает не циклическую очередь";

        char q []; // Массив для хранения данных
        int putloc, getloc; // переменные для хранения индексов вставки и извлечения

    // конструктор. При создании обьекта указываются эти параметры
        VsakoRaznoe2 (int size){   // При создании обьекта указываем
            q = new char[size+1];  // создаем массив с указанным размером(длиной). один индекс остается зарезервирован
            putloc = getloc = 0;    // присваиваем начальные значения индексам установки и извлечения в очереди.
        }

        public void put (char ch){
         // метод пут ложит даннhые в очередь.
        if (putloc == q.length -1){
            System.out.println("Очередь заполнена!!");
            return;
        }
            // можно потавить проверку на занятность с помощью ифов
            putloc++; // при каждом вызове метода переменная буtloc увеличевается на 1 еденицу.
          q[putloc]= ch; // в индекс хранящий в переменной putloc подставляется(присвайвается) новые данные.
            System.out.println("Проверочнное сообщение добавленно в очередь "+q[putloc] );
        }

        public char get () {
            // Данный метод позволяет получить данные из очереди.

            if (putloc == getloc) { //проверка на заполненость. Если переменные равны то это значит что
                System.out.println("Очередь пустая");
            }

            boolean dasd = false;
            getloc++; // увеличиается на 1 при каждом цикле.


            if (q[getloc] != 0) {
                if (q[getloc] == 0) {
                    System.out.println("индекс = 0");

                }
                dasd = true;
                int pam = q.length;
                while (dasd)

                    for (int i = 0; i< pam ;i++) {
                      //  System.out.println("Полное соднржимое массива = " + q[i]);
                        if (q.length == 0){
                            dasd = true;
                        }
                    }

               // return q[getloc]; // выводит хранимое значение при помощи переменной getloc

            }
            return q[getloc]; // выводит хранимое значение при помощи переменной getloc

        }





  //  }// конец класса




} // Конец класса
