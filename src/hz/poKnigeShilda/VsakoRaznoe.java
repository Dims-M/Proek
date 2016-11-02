package hz.poKnigeShilda;

import ruychebnieYroki.com.moyRoboti.Robot;

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


        } // коннец класса
