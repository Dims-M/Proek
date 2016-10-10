package ruychebnieYroki.ru.MoiRobotu;

/**
 * Created by Администратор on 09.08.2016.
 */
public class RobotTotal extends Robot {

    // Вводим поле дляхранения пройденной дистанции
    private double totalDistance = 0;

    // Конструктор тоже надо переопределить
    public RobotTotal(double x, double y) {
        super(x, y);
    }

    public RobotTotal(){ // Будет вызыватся если при создании обьекта мы не укажем параметры объекта
        super(0,0);
    } // конструктор без параметров

    @Override // Переопределение метода который наследуется из родительского класса!!!!!
    public void forward(int distance) {
        // Вызов нашего метода у класса предка
        // Нужно указать зарезервированное слово super

        super.forward(distance);// вызываем метод из родительского (супер класса) класса
        totalDistance += distance; // в переменную запысываем знаяения которые находятся в самой переменной totalDistance и складываются со
        // значением которое хронится в переменной distance. totalDistance = totalDistance + distance
    }

    public double getTotalDistance() {
        if (totalDistance == 0){
            System.out.println("Нет пройденной дистанции");
        }
        else {
            System.out.println("Пройдено: "+totalDistance);
        }
        return totalDistance;
    }

}
