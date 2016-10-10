package ruychebnieYroki.ru.CarYchebnai.ru.mySwingProekt;
import javax.swing.* ;
import javafx.embed.swing.JFXPanel;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Администратор on 28.05.2016.
 */
class Lablels extends JFrame{ // Наследуем квсе данные класса JFrame

    int x = 100;
    int y = 250;

    // Создаем контейнер главного окна программы JPanel
    JPanel pln = new JPanel();

    // Затем добавьте конструктор с указанием параметров окна и добав-
    // лением объекта JPanel к классу JFrame

    // Создаем обьект для хранения изображения

    ImageIcon tick = new ImageIcon("E:\\IdeaProjects\\1\\out\\production\\Test\\ruychebnieYroki\\ru\\CarYchebnai\\ru\\mySwingProekt\\tick.png");
    //  ImageIcon tick = new ImageIcon();
    // ImageIcon cross = new ImageIcon();

    ImageIcon cross= new ImageIcon("E:\\IdeaProjects\\1\\out\\production\\Test\\ruychebnieYroki\\ru\\CarYchebnai\\ru\\mySwingProekt\\cross.png");
    // private ImageIcon cross;

    ImageIcon duce = new ImageIcon("E:\\IdeaProjects\\1\\out\\production\\Test\\ruychebnieYroki\\ru\\CarYchebnai\\ru\\mySwingProekt\\duke.jpg");

    //Создаем объекты Надписей
    JButton btn = new JButton("Нажми меня! Я обычная кнопка");
    JButton tickBtn = new JButton(tick);
    JButton crossBtn = new JButton("Стоп",cross);

    JLabel jl1 = new JLabel(duce); // Выводим картинку
    JLabel jl2 = new JLabel("Хорошая система" ); // Выводим текстовую надпись
    JLabel jl3 = new JLabel("Винда 10", duce,JLabel.CENTER); // Выводим текстовую надпись

    // Склас для создания и упаковки единственного (JAR файла
    //   ClassLoader ldr = this.getClass().getClassLoader();

    // java.net.URL tickURL = ldr.getResource( "E:\\IdeaProjects\\1\\out\\production\\Test\\ruychebnieYroki\\ru\\CarYchebnai\\ru\\mySwingProekt\\cross.png" ) ;
    // java.net.URL crossURL = ldr.getResource( "tick.png" ) ;

    // Конструктор панели
    Lablels (){

        super("Мое третье  Окно Swing :)"); // Название окна программы

        setSize(500,500); // указываем размер окна

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // Устанавливае константу отвечающию ъа выход из программыпри наажатии крестика

        add(pln); // Добавили основное окно программы со семи встроеными и удобными методами

        //setVisible(true);// DВидимость при запуске пограммв


        pln.add(btn);
        pln.add(tickBtn) ;
        pln.add( crossBtn ) ;

        jl1.setToolTipText("Самая продвинутая Винда"); // Gпосказка  ыходящия при наведении на на объект
        jl3.setHorizontalTextPosition(JLabel.CENTER);
        jl3.setVerticalTextPosition(JLabel.BOTTOM);

        pln.add(jl1);
        pln.add(jl2); // Добавляем на понель
        pln.add(jl3);
        //  j123();
        //  cross = new ImageIcon(crossURL);
        // tick = new ImageIcon(tickURL);

        setVisible(true);// DВидимость при запуске пограммв

    }


    public static void main ( String[] args ) {


        //myPanel gui = new myPanel(); // Создали экземпляр пограммв(окна)

        Lablels Lablels = new Lablels();





    } //Конец метода MAIN

    // Конец класса
}
