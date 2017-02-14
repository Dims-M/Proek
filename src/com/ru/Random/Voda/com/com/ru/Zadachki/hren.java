package com.ru.Random.Voda.com.com.ru.Zadachki;

import java.util.Scanner;

/**
 * Created by Администратор on 14.02.2017.
 */
public class hren {

    public static void main(String[] args) {

        rabotaS_Isklycheniem ();

    }


    public static void soedinenieI_PoiskStrok (){
        // TODO Auto-generated method stub
        String s1;
        String s2;
        String s3;
        int n1 = 5;
        int n2 = 3;
        s1 = "hello java";
        s2 = "Welcome JRE";

        s3 = s1.substring(0, n1);
        s3 += s2.substring(n2, s2.length());
        System.out.println(s3 );

    }


    public static void rabotaS_Isklycheniem (){

        try{
            Scanner in = new Scanner(System.in);
            int x = in.nextInt();
            if(x>=30){
                throw new Exception("Число х должно быть меньше 30");
            }
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }
        System.out.println("Программа завершена");
    }
}


