package com.jet.edu;

/**
 * Created by ЛЕВ on 26.06.2017.
 */
class Calculate {


    public static boolean proverkaVvoda(int a, int b, boolean f){
        f=true;
        if (a<-10||a>10||b<-10||b>10){
            f=false;
        }
        return f;
    }

    public static boolean proverkaVvoda(double a, double b, boolean f){
        f=true;
        if (a<-10.00||a>10.00||b<-10.00||b>10.00){
            f=false;
        }
        return f;
    }

    public static int sum(int a, int b) { // ищем и возвращаем сумму переменных
        System.out.println("\nВыполнение операции сумма");
        return a + b;
    }

    public static int sub(int a, int b) { // ищем и возвращаем разность переменных
        System.out.println("\nВыполнение операции разность");
        return a - b;
    }

    public static int mul(int a, int b) { // ищем и возвращаем произведение переменных
        System.out.println("\nВыполнение операции произведение");
        return a * b;
    }

    public static int div(int a, int b) { // ищем и возвращаем частное переменных
        System.out.println("\nВыполнение операции частное");
        if(b==0){
            System.out.println("На ноль делить нельзя! Операция не выполнена!\n" +
                    "Проверьте введенные значения!\n");
            a=0;b=1;
        }
        return a / b;
    }


    // double- переменные

    public static double sum(double a, double b) { // ищем и возвращаем сумму переменных
        System.out.println("\nВыполнение операции сумма");
        return a + b;
    }

    public static double sub(double a, double b) { // ищем и возвращаем разность переменных
        System.out.println("\nВыполнение операции разность");
        return a - b;
    }

    public static double mul(double a, double b) { // ищем и возвращаем произведение переменных
        System.out.println("\nВыполнение операции произведение");
        return a * b;
    }

    public static double div(double a, double b) { // ищем и возвращаем частное переменных
        System.out.println("\nВыполнение операции частное");
        if(b==0){
            System.out.println("На ноль делить нельзя! Операция не выполнена!\n" +
                    "Проверьте введенные значения!\n");
            a=0;b=1.0;
        }
        return a / b;
    }

    public static int memory(int number1, int number2, int number3, int number4, int mem) {

            mem=mem+number1 +number2+number3+number4; // Суммируем все 4 результата операций
        // разность, сумма, произведение, частное и возвращаем
        return mem;
    }

    public static double memory(double number1, double number2, double number3, double number4, double mem) {

        mem=mem+number1 +number2+number3+number4; // Суммируем все 4 результата операций
        // разность, сумма, произведение, частное и возвращаем.
        return mem;
    }

    public static int memory(int number1, int mem) {

        mem=mem+number1; // Суммируем все 4 результата операций
        // разность, сумма, произведение, частное и возвращаем.
        return mem;
    }
    public static double memory(double number1, double mem) {

        mem=mem+number1; // Суммируем все 4 результата операций
        // разность, сумма, произведение, частное и возвращаем.
        return mem;
    }

    public static int proverkaResult(int result, int i){

        if(result<-10||result>10){
            System.out.println("Результат операции превышает установленные пределы [-10:10]\n" +
                    "Установите другие значения вычисляемых переменных!\n"+ "Результат: " + result + "\n");
            result=0;
        }
        else {
            if (i==1) System.out.println("Сумма чисел а и b:         " + result);
            if (i==2) System.out.println("Разность чисел a и b:      " + result);
            if (i==3) System.out.println("Произведение чисел a и b:  " + result);
            if (i==4) System.out.println("Частное чисел a и b:       " + result);
            if (i==5) System.out.println("Значение числа по модулю:  " + result);
        }
        return result;
    }
// Проверка для doubble


    public static double proverkaResult(double result, int i){

        if(result<-10||result>10){
            System.out.println("Результат операции превышает установленные пределы [-10:10]\n" +
                    "Установите другие значения вычисляемых переменных!\n"+ "Результат: " + result + "\n");
            result=0;
        }
        else {
            if (i==1) System.out.println("Сумма чисел c и d:         " + result);
            if (i==2) System.out.println("Разность чисел c и d:      " + result);
            if (i==3) System.out.println("Произведение чисел c и d:  " + result);
            if (i==4) System.out.println("Частное чисел c и d:       " + result);
            if (i==5) System.out.println("Значение числа по модулю:  " + result);
        }
        return result;
    }
   }
