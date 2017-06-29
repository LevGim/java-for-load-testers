package com.jet.edu;

/**
 * Created by ЛЕВ on 26.06.2017.
 */
class Calculate {

    public static int sum(int a, int b) { // ищем и возвращаем сумму переменных
        return a + b;
    }

    public static int sub(int a, int b) { // ищем и возвращаем разность переменных
        return a - b;
    }

    public static int mul(int a, int b) { // ищем и возвращаем произведение переменных
        return a * b;
    }

    public static int div(int a, int b) { // ищем и возвращаем частное переменных
        return a / b;
    }


    // double- переменные

    public static double sum(double a, double b) { // ищем и возвращаем сумму переменных
        return a + b;
    }

    public static double sub(double a, double b) { // ищем и возвращаем разность переменных
        return a - b;
    }

    public static double mul(double a, double b) { // ищем и возвращаем произведение переменных
        return a * b;
    }

    public static double div(double a, double b) { // ищем и возвращаем частное переменных
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
   }
