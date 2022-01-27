package com.calculatorproject;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputFromConsole {
    static double number;
    static int numberOfOperation;
    static double result1;



    public static double inputNumber() {
        Scanner in = new Scanner (System.in);
        try {
            number = in.nextDouble();
            return number;
        }
        catch (InputMismatchException e) {
            System.out.print("Вы ввели не число");
            return inputNumber();
        }
    }

    public static int inputOfOperation() {
        System.out.print("Введите номер операции, где 1 - сложение, 2 - вычитание, 3 - умножение, 4 - деление: ");
        Scanner in = new Scanner (System.in);
        numberOfOperation = in.nextInt();
        Calculate calculate = new Calculate();
        return numberOfOperation;

    }
    public static double resultOfCalculation(int operation, double num1, double num2) {
        Calculate calculate = new Calculate();
        switch (operation){
            case 1:
                result1= calculate.addition(num1, num2);

                break;
            case 2:
                result1 = calculate.subtraction(num1,num2);
                break;
            case 3:
                result1 = calculate.multiplication(num1,num2);

                break;

            case 4:
                result1 = calculate.division(num1, num2);

                break;
            default:
                System.out.println("Введен неправильный номер операции, попробуйте снова");
                break;
        }
        return result1;
    }
}
