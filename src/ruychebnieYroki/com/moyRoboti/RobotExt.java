package ruychebnieYroki.com.moyRoboti;

/**
 * Created by Администратор on 06.09.2016.
 */
public class RobotExt extends Robot{

    private int numberHashCode;

    private int proidenniyPut;

    // Конструктор с параметрами
    public RobotExt(double x, double y, double course) {
        // вызов конструктора родительского класса
        super(x, y); // переопределяем родительский конструктор
        this.setCourse(course);


    }

    public String numberHashCode (Object object){
         numberHashCode = object.hashCode();
       return ("Хеш код объекта = " + numberHashCode);
    }


    public void back(int distance) {
        worwardSuper(-distance);
    }

    public void infaORobotExt (){
        System.out.println("Инвормация о классе RobotExt");
        System.out.println("Имеет переопределенный конструктор.");
        System.out.println("Имеются Метод: back, infaORobotExt ");

    }
    @Override
    public String toString(){
        return "Модель" + getNameModel()+ "\n" + "Курс движения "+ getCourse()+ "Пройденный путь "+ proidenniyPut;
    }

    @Override
    public void worward (int znachWorard){

        super.worward(znachWorard);
        proidenniyPut = +znachWorard;


    }

    public int getProidenniyPut() {

        if (proidenniyPut == 0 ){
            System.out.println("Проуденного пути нет.");
        }

        return proidenniyPut;
    }

    public void setProidenniyPut(int proidenniyPut) {
        this.proidenniyPut = proidenniyPut;
    }
}
