package com.karelys.karelysspringdemo;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServ {
    public String hello() {
        return "hello";
    }

    public String calculator() {
        return "Добро пожаловать в калькулятор";
    }

    public String sumCalculator(int num1, int num2) {
        if (num1 == 0 || num2 == 0) {
            return "Введите оба значения";
        }
        return num1 + " + " + num2 + " = " + (num1 + num2);
    }

    public String minusCalculator(int num1, int num2) {
        return num1 + " - " + num2 + " = " + (num1 - num2);
    }

    public String multiplyCalculator(int num1, int num2) {
        return num1 + " * " + num2 + " = " + (num1 * num2);
    }

    public String divideCalculator(int num1, int num2) {
        if (num1 == 0 || num2 == 0) {
            return "На ноль делить нельзя";
        }
        return num1 + " / " + num2 + " = " + (num1 / num2);
    }
}

