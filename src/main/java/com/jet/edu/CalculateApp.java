package com.jet.edu;

/**
 * Created by ЛЕВ on 26.06.2017.
 */
public class CalculateApp {
    public static void main(String[] args) {
        //int operation=1;
        int a=5,b=4,per=0,vto=0,tre=0,chet=0, mem=0;

        for (int i=1; i<5; i++){
            if(i==1){
                per= Calculate.sum(a,b);
                System.out.println("Сумма чисел а и b:         " + per);
            }
            if (i==2){
                vto= Calculate.sub(a,b);
                System.out.println("Разность чисел а и b:      " + vto);
            }
            if (i==3){
                tre= Calculate.mul(a,b);
                System.out.println("Произведение чисел а и b:  " + tre);
            }
            if (i==4){
                chet= Calculate.div(a,b);
                System.out.println("Частное чисел а и b:       " + chet);
            }
            mem=Calculate.memory(per, vto, tre, chet, mem);
            System.out.println("Общая сумма операций:      " + mem);
            per=0; vto=0;tre=0;chet=0;
        }

        System.out.println("\n\n");

        //double - переменные.

        double c=.5, d=.4, per1=.0, vto1=.0, tre1=.0, chet1=.0, mem1=.0;

        for (int i=1; i<5; i++){
            if(i==1){
                per1= Calculate.sum(c,d);
                System.out.println("Сумма чисел c и d:         " + per1);
            }
            if (i==2){
                vto1= Calculate.sub(c,d);
                System.out.println("Разность чисел c и d:      " + vto1);
            }
            if (i==3){
                tre1= Calculate.mul(c,d);
                System.out.println("Произведение чисел c и d:  " + tre1);
            }
            if (i==4){
                chet1= Calculate.div(c,d);
                System.out.println("Частное чисел c и d:       " + chet1);
            }
            mem1=Calculate.memory(per1, vto1, tre1, chet1, mem1);
            System.out.println("Общая сумма операций:      " + mem1);
            per1=.0; vto1=.0; tre1=.0; chet1=.0;
        }
    }
}
