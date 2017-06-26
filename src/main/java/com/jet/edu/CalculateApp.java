package com.jet.edu;

/**
 * Created by ЛЕВ on 26.06.2017.
 */
public class CalculateApp {
    public static void main(String[] args) {
        //int operation=1;
        int a=5,b=4,per=0,vto=0,tre=0,chet=0, mem=0;

        per= Calculate.sum(a,b);
        System.out.println("Сумма чисел а и b:         " + Calculate.sum(a,b));
        mem=Calculate.memory(per, mem);
        System.out.println("Общая сумма операций:      " + mem);

        //operation=2;
        vto= Calculate.sub(a,b);
        System.out.println("Разность чисел а и b:      " + Calculate.sub(a,b));
        mem=Calculate.memory(vto, mem);
        System.out.println("Общая сумма операций:      " + mem);

        //operation=3;
        tre= Calculate.mul(a,b);
        System.out.println("Произведение чисел а и b:  " + Calculate.mul(a,b));
        mem=Calculate.memory(tre, mem);
        System.out.println("Общая сумма операций:      " + mem);


        chet= Calculate.div(a,b);
        System.out.println("Частное чисел а и b:       " + Calculate.div(a,b));
        mem=Calculate.memory(chet, mem);
        System.out.println("Общая сумма операций:      " + mem);
    }
}
