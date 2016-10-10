package ruychebnieYroki.com.ru.Interfeis.ru;

/**
 * Created by Администратор on 17.08.2016.
 */
public class ProductManager implements ProductManagement{

    public void infaOClasse (){
        System.out.println("Метод реализовывает наследование и интерфейсы");
    }

    private String name;

    public ProductManager(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void getPowerOverDevelopers() {
        System.out.println("Менеджер продукта отвечает за бонусы...");
    }

    @Override
    public void doJob() {
        System.out.println("Менеджер контролирует все...");
    }

    @Override
    public String toString() {
        return "Product Manager: " +
                "\nName: " + name + "\n";
    }

}
