package ruychebnieYroki.com.moyRoboti;

/**
 * Created by Администратор on 02.09.2016.
 */
public class Robot {

    // Текущая координаты
    private   double x =  0;
    private double y =  0;

    // Текущий курс движения в градусах
    protected double course = 0;
    private double vector = 0;

    String nameModel = " Модель не установлена! ";

    public Robot(double x, double y) {

        this.x = x;
        this.y = y;

        //Конструктор
    }

    public Robot(double x, double y,double course) {

        this.x = x;
        this.y = y;
        this.course = course;

        //Конструктор
    }

// Cеттеры и геттеры

    public String getNameModel() {
        return nameModel;
    }

    public void setNameModel(String nameModel) {
        this.nameModel = nameModel;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getCourse() {
        return course;
    }

    public void setCourse(double course) {
        this.course = course;
    }

    public double getVector() {
        return vector;
    }

    public void setVector(int vector) {
        this.vector = vector;
    }


   public void  infaOPeremenih () {

       String infa = " Переменные x и у отвечают за координаты." +
               "" + " Переменная course отвечает за курс движения." +
               " Worward отвечает за количество 'условных' шагов. ";
       System.out.println(infa);
   }

    public void dvijenieCouse (int znach){
        course = znach;
        System.out.println("На курс установлен на "+ course+ " %");
    }

    public void worward (int znachWorard){
        System.out.println("Данный метод Устарел!!!");
        System.out.println("Двигаемся на "+ znachWorard+" шагов");
        vector = znachWorard;
    }

    public void tekushieMestopolojenie (){

        System.out.println("Текущие местоположение Робота "+nameModel);
        System.out.println("Координаты X = " + getX() + " Координаты У =  "+getY() );
    }


    public void worwardSuper (int distansia){
        System.out.println("______");
        x = x + distansia * Math.cos(course / 180 * Math.PI);
        y = y + distansia * Math.sin(course / 180 * Math.PI);
        //y = y + distansia * Math.sin(course / 180 * Math.PI);
        System.out.println(getX()+ getY());
    }

    @Override
    public String toString() {
        return "Robot{" +
                "x=" + x +
                ", y=" + y +
                ", course=" + course +
                ", vector=" + vector +
                ", nameModel='" + nameModel + '\'' +
                '}';
    }
} // конец класса
