package com.calculatorproject;

public class Main {
    public static void main(String[] args) {

        System.out.print("Введите первое число: ");
        double firstNumber = InputFromConsole.inputNumber();
        System.out.print("Введите второе число: ");
        double secondNumber = InputFromConsole.inputNumber();
        int numberOfOperation = InputFromConsole.inputOfOperation();
        double result = InputFromConsole.resultOfCalculation(numberOfOperation,firstNumber,secondNumber);
        System.out.printf("Результат: %.2f",result );


    }
}
