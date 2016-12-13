package hz.poKnigeShilda;

/**
 * Created by Администратор on 13.12.2016.
 */
public class RabotaSoStrokami {

    public static void main(String[] args) {

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



}
