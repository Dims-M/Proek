package ruychebnieYroki;

import ruychebnieYroki.ru.CarYchebnai.Car;

import javax.swing.text.DateFormatter;
import java.io.*;
import java.nio.channels.NotYetBoundException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.text.*;

/**
 * Created by Администратор on 22.05.2016.
 */
public class MoiMetodi {


    public static void myMetodi() {
        System.out.println("Изучаем методы");
    }

    public static void myStroka() {
        String strokaVMetode = "Моя строка, Обьявлена внутре методаэ. такие строки наываются локальными"; // Локальная переменная
        // System.out.println(gloalString);
        System.out.println(strokaVMetode);
    }

    public static void myStrokaSparametrami(String str) {
        System.out.println(str);
    }

    public static void myPERegruzka(String str) {

        try {
            //if (str == "") {
            System.out.println("Метод перегрузки возращает(принимает, или работает) с разнми строковое значениями");
            //  }
            // else {
            //   System.out.println("Вы ввеи пустую строку");
            //  }
        } catch (Exception e) {
            System.out.println("Вы ввели не коректное значение...");
        }
    }

    public static void myPERegruzka(int intova) {
        System.out.println("Метод перегрузки возращает(принимает, или работает) с разнми Интовыми значениями значениями");
    }

    public static void myPERegruzka(double dobkea) {
        System.out.println("Метод перегрузки возращает(принимает, или работает) с разнми double значениями значениями");
    }

    public static void myRadelitel() {
        System.out.println("********************************");
    }

    public static void mySozdanieCara() {

        Car car1 = new Car("'Спортивная'", "Красный", "Купе", "Запарозец"); // Создали экземпляр объекта Типа(Класса) Сар и указали ссылку на кучу

        car1.infaOCar();
        // car1.ezda(200); // Методы объекта!
        myRadelitel();
        Car car2 = new Car("Обычный", "Желный", "хечбек", "Лада-Калина");
        car2.infaOCar();

        car1.infaOCar();
        // метод где переопределяем переменные
        myRadelitel();
        car1.setCarUstanovitZnach("Обычный Pfgjh", "<ehvjkbyjdsq", "хечбек", "Лада-Калина");
        car1.infaOCar();
    }


    public static void mysozdanieFile() throws IOException {

        RabotaSFaiami file = new RabotaSFaiami(); // Создали объект Экземпляр Класса RabotaSFaiami
        // Для работы с  виртуальным файлом

        file.sozdanieFaila();
//***************************************************
        File file1 = new File("123.bat");
        file1.exists();
        file1.length();
        file1.createNewFile();


        System.out.println(file1.length());
        System.out.println();
        System.out.println(file1.exists());
    }

    public static void myfailDIR() {

        File dir = new File("1");

        if (dir.exists()) { // условие сработает если dir.exists == trye
            String[] files = dir.list(); // Присвоим в массив все данные из Lbh лисьа (перечень файлов)

            System.out.println(files.length + "найдено файлов"); // Вывод размера массива с количеством файлов

            for (int i = 0; i < files.length; i++) { // Цикл работает пока не пройдет по всей длине массива.
                System.out.println(files[i]);
            }
        } else {
            System.out.println("Каталог не найден");
        }
    }

    // Методы Рабботы с вводом через командную консоь
    public static void MyReadString() {

        System.out.println("Введите названия этой книги!!!!!");
        // Создаем специальный объек типа
        /*
        Добавьте оператор, создающий объект InputStreamReader, позво-
ляющий читать вводимые с командной строки данные
         */
        InputStreamReader ist = new InputStreamReader(System.in);  // Метод лтвечает за ввод данных с клавиатуры

        /*
        Создайте объект BufferedReader для чтения декодированного ввода
         */
        BufferedReader buffer = new BufferedReader(ist); // C параметром ist

        String impud = " "; // переменной будем хранить ввод данных с клавы

        try {
            impud = buffer.readLine(); //  В переменную сохраняем введеные данные с помощью объекта buffer и его методв чтения readLine()
            buffer.close(); // Закрываем метод. Он больше не нужен. Занмимает место в памяти
        } catch (IOException e) {
            System.out.println("Произошла ошибка ввода ");
        }
        System.out.println("******************");
        System.out.println("Вы чиаете " + impud);

    }

    // Метод для чтения файлов с поомщью класса  FileReader  предназначен для чтения текстовых файлов
  /*
    public static void myReadFile() {
        try {
            FileReader file = new FileReader("123.txt"); // Создали объект для чтение файла FileReader. В качестве параметров указали имя и путь к файлу
            BufferedReader buffer = new BufferedReader(file); // Объект буфер читает то что считал и сохранил в себе объект FileReader
            String line = " "; // Создали переменную для хранения данных в цикле

            while ((line = buffer.readLine()) != null) { // выводимм считаные данные из объекта buffer построчно. Условие цикла что есть какие то данные и файл не пусой
                System.out.println(line);
                // Выодим построчно данные из стринговой переменной
            }
            // buffer.close(); // В конце цикла закрываем метод.
            catch(IOException e){ // если файла нет то пишется
                System.out.println("Произошла непредвидемая ошибка чтения");
            }
        }
        }
       */


    public static void myArrayList (){

        ArrayList <String> list = new ArrayList<String>(); // Создали объект который хранит в себе список массивов

        list.add("Aльфа");
        list.add("Gthdsq"); // Заполняем нужными значениями.
        list.add("Лист");

        System.out.println("Работаем с ArrayList");
        System.out.println(list); //Выводим значения

        System.out.println("Заменяем в массиве:  "+ list.get(1)); //Заменяем в массиве. Указываемнужный индекс

         list.set(1, "Начальный"); //записываем данные в нужный индекс(и указываем что именно вносить)

        list.forEach(( x ) -> System.out.println("Элемент массива " + x)); // Лямба выражения
        // Обод чписка листа массива И Вывод каждого элемента массива на экран
    }

        //Работа с датой
    public static void myRabotaSTime (){

        LocalDateTime data =  LocalDateTime.now(); //Создали экземпляр(объект) для работы с текущей датой

        System.out.println("Текущая дата: "+ data); // Вывод текущей даты

        data = data.withYear(2018);
        System.out.println("\n Теперь текущеей врем равно "+ data);
    }

    // Форматирование Чисел для работы с датой
    //добавление разделителей, символов валют, а также знаков процента.
    public static void myRabotaSTimeFormatirovaanie (){

        // метод getNumberInstance() для разделителей

        // getCurren-cyInstance()

        // getPercentInstance()

        NumberFormat nf = NumberFormat.getNumberInstance(); // Создаем обьект NumberFormat для работы с форматированием

        System.out.println( " \nЧисло: " + nf.format(1234.50)+ " Вывод форматированного числа. С помощью метода NumberFormat.getCurrencyInstance"); // Вывод числа флоат с помошью экемпляра объекта NumberFormat

        NumberFormat cf = NumberFormat.getCurrencyInstance(); // Выод отформатиованого значения

        System.out.println("\nВалюта: " + cf.format(555.100f) + " Выод отформатированого чимла с помощью метода NumberFormat.getCurrencyInstance()");

        NumberFormat pf = NumberFormat.getPercentInstance();

        System.out.println("\nпроцент: " + pf.format(0.75f) + " Вывод с помощью метода NumberFormat.getPercentInstance");

    }

    public static void myRabotaSTimeFormatirovaanieTime (){
        System.out.println("Работаем с форматированием  текущей ДАТЫ");

        LocalDateTime now  =  LocalDateTime.now() ;

        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMM d, yyy"); // cjplgkb 'rptvgkzh
        System.out.println("\nСегодняшняя Дата: " + now.format(df)); // выводим переменную c датой

        // Время

        DateTimeFormatter tf = DateTimeFormatter.ofPattern("h;m a"); //Выводим время
        System.out.println("\n Текущие время: "+ now.format(tf));
    }

    public static void rabotaSMassivami (int a [],int b[] ){

        if (a.length > b.length) {
            for (int s : a) {
                System.out.println("Содержимое массива " + s);
            }
        }
        else {
            for (int s : b) {
                System.out.println("Содержимое массива " + s);
            }
        }

    }


}// конец класса

