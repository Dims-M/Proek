package ruychebnieYroki.ru.CarYchebnai.ru.mySwingProekt;
import javax.swing.* ;
import javafx.embed.swing.JFXPanel;

import javax.swing.*;

/**
 * Created by Администратор on 28.05.2016.
 */
public class myPanel  extends JFrame{ // Наследуем квсе данные класса JFrame

    // Создаем контейнер главного окна программы JPanel
    JPanel pln = new JPanel();

   // Затем добавьте конструктор с указанием параметров окна и добав-
   // лением объекта JPanel к классу JFrame

    // Конструктор панели
    myPanel (){

        super("Мое первое  Окно Swing :)"); // Название окна программы

        setSize(500,500); // указываем размер окна

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // Устанавливае константу отвечающию ъа выход из программыпри наажатии крестика

        add(pln); // Добавили основное окно программы со семи встроеными и удобными методами

        setVisible(true);// DВидимость при запуске пограммв

    }
/*
    // Создаем обьект для хранения изображения
    ImageIcon tick = new ImageIcon("tick.pnp");
    ImageIcon cross= new ImageIcon("cross.pnp");

    //Создаем объекты кнопок
    JButton btn = new JButton("Нажми меня! Я обычная кнопка");
    JButton tickBtn = new JButton(tick);
    JButton crossBtn = new JButton("Стоп",cross);

   */




    public static void main ( String[] args ) {


        myPanel gui = new myPanel(); // Создали экземпляр пограммв(окна)



    } //Конец метода MAIN

    // Конец класса
}
