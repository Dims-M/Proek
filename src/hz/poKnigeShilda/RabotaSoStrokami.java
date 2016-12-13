package hz.poKnigeShilda;

/**
 * Created by Администратор on 13.12.2016.
 */
public class RabotaSoStrokami {

    public static void main(String[] args) {

        String poiskk ="ст";
        String infaOClasse = "Класс для работы со строками!";
        String test = "Тестовая строка!";
        String test2 = "Тестовая строка#2!";
        boolean proverka = false;

        System.out.println("Эксперементы над строками!");
        System.out.println("Длинна текущей строкм = "+test.length());
        System.out.println("Cравнение двух строк "+"Равны ли две строи: test и test2");
        System.out.println("Происходит сравнение двух срок.... ");
        System.out.println( proverkaNaRavenstvo(test,test2));
       // proverka=  test.equals(test2);

        razdelitelZvedochek();
        proverkaNdline(test,test2);
        System.out.println(test.compareTo(test2));
        razdelitelZvedochek();

        System.out.println("В текущем индексе содержится символ = "+ test.charAt(2));
        System.out.println("Начальное вхождение первого символа "+test.indexOf(poiskk));
        razdelitelZvedochek();

        int temp1 = test.length();
        String nowStr =   test.substring(0 , temp1);
        System.out.println("Созданна новая строка по индексу от 0 до 1");
        System.out.println(nowStr);
        razdelitelZvedochek();

        rabotaSoSwitch("Один");



    }


    // методы
    public static void razdelitelZvedochek(){
        System.out.println("*******************************1");
    }

    public static String proverkaNaRavenstvo(String string1, String string2){
         String strVivod = "";
       boolean prov = string1.equals(string2);

        if (prov != true){
            strVivod =   "Данные строки НЕ равны!!";
        }
        else {
            strVivod =  "Данные строки равны!!";
        }
        return strVivod;
    }

    public static void proverkaNdline(String string1, String string2){
        int chis = string1.compareTo(string2);
      //  System.out.print( int chis = string1.compareTo(string2));

        if (chis < 0){
            System.out.println("Первая строка меньше второй!!!");
        }
        else {
            System.out.println("Первая строка больше втророй!!");
        }
    }

    public static void rabotaSoSwitch (String string){
        System.out.println("Работа со свичем");
        switch (string){

            case "Один":{
                String qwe = "Один";
                System.out.println("Сработал свитч Значение = "+ qwe);
                break;
            }


            case "Тестовая строка!":{
                String qwe = "Тестовая строка!";
                System.out.println("Сработал свитч Значение = "+ qwe);
                break;
            }

            case "Тестовая строка#2!":{
                String qwe = "Тестовая строка#2!";
                System.out.println("Сработал свитч Значение = "+ qwe);
                break;
            }


        }// конец

    }



}
