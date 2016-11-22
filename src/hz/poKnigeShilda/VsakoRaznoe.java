package hz.poKnigeShilda;

import ruychebnieYroki.com.moyRoboti.Robot;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Администратор on 11.10.2016.
 */
public class VsakoRaznoe {

    double dobledov = 15.45;
    int intov = 55;
    byte byteov = 126;




        public void preodrazovanieTipov_V_INT (){
            System.out.println("В переменной типа double dobledov находится "+ dobledov);
            int count = (int) dobledov;

            System.out.println("Преобразовали тип double в int "+ count);
        }

    public void preodrazovanieTipov_V_double (){
        System.out.println("В переменной типа int intov находится "+ intov);
        double count = intov;

        System.out.println("Преобразовали тип int d double  "+ count+ "\n"+ "Это нисходящие автомачическое приобразование или Разширение типа");
    }

    public void preobrozovanieV_vurazenia (){

        int i;

        for (i = 0; i< 5; i++ ){
            System.out.println("Переменная / на 3 =  "+ i/3);
            System.out.println("Переменная / на 3 c дробной частью  "+ (double)i/3);
        }
    }

    public void prostoMetod (){

        int a =10;
        int b = 2;
        int x =2;

        x = a / b * (127 /x);

        System.out.println(x);
    }

    public void  proverkaDeleniaNaNol (){
        int n,d, g;

        n = 200;
        d= 5;

        System.out.println("Используется укороченная логическая операция &&");

        if (d != 0 && (n % d) ==0){ //используется укороченная логическая операция &&
            System.out.println(d+ " является делитилем "+n);
        }
        if (d==0){
            System.out.println("Первый оператор = 0 и Второй операнд не высчитывается");
        }

        System.out.println("*************");
       // d=0;
        if (d != 0 & (n % d) ==0){ //используется обычная логическая операция &
            System.out.println(d+ " является делитилем "+n);
        }
        d = 2;

        for (int i = 0; i<500; i++ ) {

            if (d != 0 && (n % d) == 0) { //используется укороченная логическая операция &&
                System.out.println(d + "является делитилем " + n);
            }
            d++;
        }

    }

    String slovo = "Привет";

        public void rabotaSoSwichem () {
            System.out.println("Работа со Свичем ");

          //  String slovo = "Привет";

            switch (slovo) {

                case "Привет":
                    System.out.println("Свитчь");
                    break;

                        default:
                            System.out.println("Данных нет");

            }
        }



    public void rabotaS_Metodami (){

        Robot robot = new Robot(10, 50);
        Robot robot1 = robot; // Присваиваем объектной переменной ссылку на другой обьект

        System.out.println("Присваиваем объектной переменной ссылку на другой обьект");

        System.out.println("Выводим содержимое ссылок " + robot+ "\n" + robot1);

        System.out.println("Или");

        PustoiClass pustoiClass = new PustoiClass();
        PustoiClass pustoiClass1 = pustoiClass;

        System.out.println("Cодержимое класса" + pustoiClass + " и "+ pustoiClass1);

    }

    public boolean rabotaSParametrom (int count){
     //  VichislenieOstatkaOtDelenia(count);

        if ( count <=10){
            return true;
        }

       else   return false;


    }


    public void rabotaSPeredacheiParametrov (int znach){

       // VichislenieOstatkaOtDelenia(znach);

        if (znach <= 5){
            rabotaSParametrom (znach) ;
        }

        if (znach == 10){
            rabotaSParametrom (znach) ;
        }

        if (znach >= 11){
            rabotaSParametrom (znach) ;
        }

    }

    public static void zapusk (int abs) {
        VsakoRaznoe rabotaSparametramiMetoda = new VsakoRaznoe();
        // rabotaSparametramiMetoda.rabotaSPeredacheiParametrov(10);
        //  S/tem.out.println(rabotaSparametramiMetoda.rabotaSParametrom(10));


        System.out.println("Результат работы равен " + rabotaSparametramiMetoda.rabotaSParametrom(abs));


        if (rabotaSparametramiMetoda.rabotaSParametrom(abs)) {
            System.out.println("Результат работы равен " + rabotaSparametramiMetoda.rabotaSParametrom(5));
        }

        if (rabotaSparametramiMetoda.rabotaSParametrom(abs)) {
            System.out.println("Результат работы равен " + rabotaSparametramiMetoda.rabotaSParametrom(12));
        }

        if (rabotaSparametramiMetoda.rabotaSParametrom(abs)) {
            System.out.println("Результат работы равен " + rabotaSparametramiMetoda.rabotaSParametrom(5));
        }

        else {
            System.out.println("abuyz");
        }
        VichislenieOstatkaOtDelenia(abs);

    }


    public static void VichislenieOstatkaOtDelenia (int znach1){

        double asd = znach1 % 2;
        if ((znach1 % 2) == 0){

            System.out.println("Число четное Остаток от деления = " + asd);

        }
        else {
            System.out.println("Число НЕЧЕТНОЕ Остаток от деления = " + asd);
        }
    }




    public static void rabotaSMassivom (){
        System.out.println("Работаем с массивами");

        String sozdanieMassiva = "Сначало указывается базовый тип, потом имя массива, с помощью new выделяется место и присваивается ссылка " +
                "на переменную массива ";
        String sozdanieMassiva2= "Создать переменную можно 2 способами. " +
                " int [] moiMassivi = new int[10];" +
                "и " +
                " int [] moiMassivi " +
                " moiMassivi = new int[10];";

        boolean proverka = true;
        int [] moiMassivi = new int[10];
        int max, min = 0;
        Randomm randomm = new Randomm();
        Scanner scanner = new Scanner(System.in);

        for (int a = 0; a < moiMassivi.length; a++) {

            if (moiMassivi[a] == 0) {
                moiMassivi[a] = (int) (Math.random() * 10);
            }
            //    int randomm = (int) (Math.random ()*10);
            // c помощью метода рандом заполняем случайным числом от 0 до 10  и приводим к типу инт
            System.out.println("Содержимое массива " + moiMassivi[a]);

        }
        for (int a = 0; a < moiMassivi.length; a++) {
            int count = a;
            if (moiMassivi[a] == 0) {
                System.out.println("Содержимое массива под индексом "+ count + " равно = 0" + moiMassivi[a]);
            }
          //  System.out.println("Содержимое массива под индексом "+ moiMassivi[a] + " равно = 0" + moiMassivi[a]);
        }

        while (proverka) {
            System.out.println(" Вычисление Максмимального и Минимального значения в массиве\n Нажмите на клавишу 1 для вычесления значений\n" +
                    " или клавищу 0 для завершения работы метода \n И нажмите кнопку ЕНТР");
            int znach = scanner.nextInt();
            //Обьект Сканер для перехвата введенного значения

            if (znach == 1) {
                // Вычиляем максимальное и минимальное значение

                min = max = moiMassivi[0];

                for (int i = 0; i < moiMassivi.length; i++){

                    System.out.println("Текущие содержание массива = "+moiMassivi[i]);

                    if (min < moiMassivi[i]){
                        min = moiMassivi[i];
                    }

                    if (max > moiMassivi[i]){
                        max = moiMassivi[i];
                    }

                }

                System.out.println("Максимальное значение массива = " + max);
                System.out.println("Минимальное значение массива = " + min);
                System.out.println("Программа закончила свою работу!!!!!1");
                proverka = false;

            }

            if (znach == 0) {
                System.out.println(" Программа завершила свою работу.");
                proverka = false;
            }
        }

    } // конец метода работа с массивом


   public static int sortirivka[] = new int[10];

    public static void  buble () {
        // метод пузерьковой сортировки


        Random random = new Random();

        for (int a = 0; a < sortirivka.length; a++) {
            // c помощью метода рандом заполняем случайным числом от 0 до 10  и приводим к типу инт
            if (sortirivka[a] == 0) {
                sortirivka[a] = (int) (Math.random() * 100);
            }
        }
        for (int sort : sortirivka) {
            System.out.println("Текущие Неотсортированные данные в массиве " + sort);

        }


        System.out.println("***********************");


        // сортируем массив по возрастанию от 0 -> 10
        int temp; // временная переменная для хранения значений
        int b = 0;

        for (int i = 0; i < sortirivka.length ; i++) {
            for (b = 0; b < i; b++) { // уменьшаем длину массива при каждой итерации
                // temp = sortirivka[0];

                if (sortirivka[b] > sortirivka[b + 1]) {
                    temp = sortirivka[b];

                    sortirivka[b] = sortirivka[b + 1];
                    sortirivka[b + 1] = temp;
                }

            }
        }
            for (int sort1 : sortirivka) {
                System.out.println("Текущие Отсортированные Данные = " + sort1);
            }

        } // конец метода

    public static void viviod() {
        System.out.println("Присваиваем ссылки на массивы");

        for (int sort1 : sortirivka) {
            System.out.println("Текущие Отсортированные Данные = " + sort1);
        }

        int [] sdfsdf;
        sdfsdf = sortirivka;

        for (int sort1 : sdfsdf) {
            System.out.println("Текущие Отсортированные Данные = " + sort1);
        }

    }


    public static int[] randomMassivov (){
        System.out.println("Заполнение массивов");

       int [] znach= new int[10];
        Random random = new Random();
        for (int i = 0; i < znach.length; i++){
            znach[i] = random.nextInt(100);
        }

        for (int temp : znach){
           System.out.println(temp);
        }

        return znach;
    }


    public static int [] sortMassiv (int massiv []){
        System.out.println("Сортировка массивов");

        int dlinaMassiva = massiv.length;


        int [] temp1 = new int[dlinaMassiva];
        temp1 = massiv;

        for (int i = 0; i < temp1.length ; i++) {
            for (int b = 0; b < i; b++) { // уменьшаем длину массива при каждой итерации
                // temp = sortirivka[0];

                if (temp1[b] < temp1[b + 1]) {
                    int temp = sortirivka[b];

                    temp1[b] = temp1[b + 1];
                    sortirivka[b + 1] = temp;
                }

            }
        }
        for (int countMassiva : temp1){
            System.out.println("Текущий порядок " + countMassiva);
        }

        System.out.println("Длина массива = "+ temp1.length);

        return temp1;
    }


    public static void copyMassiv (int copy []){
        System.out.println("Копирование массивов");



      //  int dlinaMassiva =(int)  (copy[].length());

        int  copySors [] = new int[10];
        int [] copyS  = new int[10];;
        copySors = copy;

        if (copySors.length == copy.length){

            for (int i = 0; i < copyS.length;i++){
                copyS[i] = copySors[i];
            }
        }

        for (int znoch : copyS){
            System.out.println(""+znoch);
        }

       // int copii [] = new int copi[10];


    }



 } // коннец класса
