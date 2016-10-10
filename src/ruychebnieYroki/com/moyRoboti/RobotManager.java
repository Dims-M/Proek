package ruychebnieYroki.com.moyRoboti;

import ruychebnieYroki.MoiMetodi;
import java.util.Random;

/**
 * Created by Администратор on 02.09.2016.
 */
public class RobotManager {

public int massivi [] = {10,5,25,3};
 public int massivi55 [] = {1000,45,25,3,5,474};

 public static int summaMassiva = 0;
 public static int summaMassiva1 = 0;

    public static void main(String[] args) {

    Robot robot  = new Robot(10,25);
     Robot robot2 = new Robot(10,50);
     RobotExt robotExt = new RobotExt(10,50,500);
     //vsakoRazno();
     System.out.println(robot.toString());
     System.out.println(robot2.toString());
     robotExt.setNameModel("Модель V.0.2");
     robotExt.worward(100);
     System.out.println(robotExt.toString());
     robotExt.back(10);
     robotExt.worward(500);
     robotExt.toString();

     System.out.println("*********************************");

     int primerInta[] = new int[10];

     Robot[] rbts = new Robot[10]; // создали массив на хранение 10  объектов
     System.out.println("В текущем массиве по индексу [0] хранится "+rbts[0]);
     obrabotkaMassiva (rbts); // вывод содержимое массива

     zapolnenieaMassiva(primerInta); // Заполнение массива с помощью рандома

     zapolnenieObektnogoMassiva(rbts);
     obrabotkaMassiva (rbts); // вывод содержимое массива


    }

 public static void vsakoRazno (){

  Robot robot = new Robot(10,25);
  robot.nameModel="Прототип v0000.1";
  robot.infaOPeremenih();

  RobotExt robot1 = new RobotExt(50,100,90);
  // robot1.nameModel =" " ;

  robot.setX(10);
  robot.setY(20);
  robot.dvijenieCouse(100);
  //robot.worward(50);
  robot.worwardSuper(100);
  robot.tekushieMestopolojenie();
  robot.infaOPeremenih();
  System.out.println(robot.getX()+robot.getY());


  //  robot1.back(10);
  //   robot1.setNameModel(" V 0.3");
  //  robot1.infaORobotExt();
  //  robot1.infaORobotExt();
  //  System.out.println(robot1.toString());

  VsakoRaznoe vsakoRaznoe = new VsakoRaznoe();
  System.out.println(vsakoRaznoe.ferst);
  vsakoRaznoe.testFerst(100);

  System.out.println("Сравнение 2х обьектов");
  System.out.println("Равен ли обект robot объекту robot1: "+ robot.equals(robot1));

  Robot robot2 = new RobotExt(100,500,20);
  RobotExt Temprobot2 = new RobotExt(100,500,20);
  RobotExt Temprobot3 = new RobotExt(100,500,20);
  // Temprobot2 = robot1;

  robot2 = robot1;

  System.out.println("Сравнение 2х обьектов");
  System.out.println("Равен ли обект robot2 объекту robot1: "+robot1.numberHashCode(robot));
  // вывод хеш строк
  System.out.println( robot1.numberHashCode(robot2));
  System.out.println("Сравнение 2 одинаковых оъектов ");

  System.out.println(robot1.numberHashCode(Temprobot2));
  System.out.println( robot1.numberHashCode(Temprobot3));
  System.out.println("*");
  System.out.println( Temprobot2.numberHashCode(Temprobot2));
  System.out.println( Temprobot3.numberHashCode(Temprobot3));

  robot.toString();



 }
  public static void obrabotkaMassiva(Robot [] robots){

   for (int i =0 ; i < robots.length;i++ ){
    System.out.println("Выводим содержимое массива: " + robots[i] );
   }
   System.out.println("Длина текущего массива: "+ robots.length);
  }


 public static void zapolnenieObektnogoMassiva(Robot [] robots){
  System.out.println("Заполним обьект в массивах [*]" );

  for (int i =0 ; i < robots.length;i++ ){

   robots[i] = new Robot(i *10, i * 10, 50);
   //summaMassiva = +summaMassiva;

  }
  //summaMassiva(summaMassiva);
 }


 public static void zapolnenieaMassiva(int [] robotsInt){
  //int summaMassiva1 = 0;
  Random random = new Random(50);

  for (int i =0 ; i < robotsInt.length;i++ ){

   robotsInt[i] = random.nextInt(100);
   summaMassiva1 += robotsInt[i];
   System.out.println("Выводим содержимое массива: " + robotsInt[i] );

  }
  System.out.println("Длина текущего массива: ***"+ robotsInt.length);
  summaMassiva(summaMassiva1);

 }

 public static void summaMassiva (int summaMas ){
  System.out.println("Сумма всех индексов массива = "+summaMas);
 }


 MoiMetodi moiMetodi = new MoiMetodi();

// moiMetodi.rabotaSMassivami (massivi55[], massivi[]);

} // конец метода
