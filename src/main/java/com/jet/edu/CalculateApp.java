package com.jet.edu;

/**
 * Created by ЛЕВ on 26.06.2017.
 */
public class CalculateApp {

    private static int a=2, b=-10;
    private static double c=.5, d=.4;


    public static void main(String[] args) {
        int first=0,second=0,third=0,fourth=0, fifth=0, mem=0;
        boolean pro=true;

        System.out.println("Числа a и b соотвественно:  " + a + "  " + b);

        pro=Calculate.proverkaVvoda(a, b, pro);
        if (pro==true) {

            for (int i = 1; i < 6; i++) {
                if (i == 1) {
                    first = Calculate.sum(a, b);
                    first = Calculate.proverkaResult(first,i);
                }
                if (i == 2) {
                    second = Calculate.sub(a, b);
                    second = Calculate.proverkaResult(second,i);
                }
                if (i == 3) {
                    third = Calculate.mul(a, b);
                    third = Calculate.proverkaResult(third,i);
                }
                if (i == 4) {
                    fourth = Calculate.div(a, b);
                    fourth = Calculate.proverkaResult(fourth,i);
                }
                if (i == 5) {  // исходные числа по модулю
                    if(a<0){
                        fifth = Math.abs(a);
                        fifth = Calculate.proverkaResult(fifth,i);
                        mem=Calculate.memory(fifth,mem);
                    }
                     else{
                        if(b<0) {
                            fifth = Math.abs(b);
                            fifth = Calculate.proverkaResult(fifth,i);
                            mem = Calculate.memory(fifth, mem);
                        }
                        else System.out.println("\nВычислять модуль не требуется!");
                     }
                }


                mem = Calculate.memory(first, second, third, fourth, mem);
                System.out.println("Общая сумма операций:      " + mem);
                first = 0;
                second = 0;
                third = 0;
                fourth = 0;
            }

            System.out.println("\n\n");
        }
        else {
            System.out.println("Вводимые числа не удовлетворяют условиям.\n" +
                    "Они должны принадлежать промежутку от -10 до 10\n\n");
        }

        //double - переменные.


        double first1 = .0, second1 = .0, third1 = .0, fourth1 = .0, fifth1=.0, mem1 = .0;

        System.out.println("Числа c и d соотвественно:  " + c + "  " + d);

        pro=Calculate.proverkaVvoda(c, d, pro);
        if (pro==true) {

            for (int i = 1; i < 6; i++) {
                if (i == 1) {
                    first1 = Calculate.sum(c, d);
                    first1 = Calculate.proverkaResult(first1,i);
                }
                if (i == 2) {
                    second1 = Calculate.sub(c, d);
                    second1 = Calculate.proverkaResult(second1,i);
                }
                if (i == 3) {
                    third1 = Calculate.mul(c, d);
                    third1 = Calculate.proverkaResult(third1,i);
                }
                if (i == 4) {
                    fourth1 = Calculate.div(c, d);
                    fourth1 = Calculate.proverkaResult(fourth1,i);
                }
                if (i == 5) {
                    if(c<0){
                        fifth1 = Math.abs(c);
                        fifth1 = Calculate.proverkaResult(fifth1,i);
                        mem1=Calculate.memory(fifth1,mem1);
                    }
                    else{
                        if(d<0) {
                            fifth1 = Math.abs(d);
                            fifth1 = Calculate.proverkaResult(fifth1,i);
                            mem1 = Calculate.memory(fifth1, mem1);
                        }
                        else System.out.println("\nВычислять модуль не требуется!");
                    }

                }
                mem1 = Calculate.memory(first1, second1, third1, fourth1, mem1);
                System.out.println("Общая сумма операций:      " + mem1);
                first1 = .0;
                second1 = .0;
                third1 = .0;
                fourth1 = .0;
            }
        }
        else {
            System.out.println("Вводимые числа не удовлетворяют условиям.\n" +
                    "Они должны принадлежать промежутку от -10.00 до 10.00\n\n");
        }
    }
}
