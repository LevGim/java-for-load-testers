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
    }
}
