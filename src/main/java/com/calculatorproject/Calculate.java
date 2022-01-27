package com.calculatorproject;

public class Calculate {
    double result, value, scale;

    public double addition (double firstNumber,double secondNumber){
        value = firstNumber+secondNumber;
        scale = Math.pow(10,2);
        result = Math.floor(value*scale)/scale;
        return result;
    }
    public double subtraction (double firstNumber,double secondNumber){
        value = firstNumber-secondNumber;
        scale = Math.pow(10,2);
        result = Math.floor(value*scale)/scale;
        return result;
    }
    public double multiplication (double firstNumber, double secondNumber){
        value = firstNumber*secondNumber;
        scale = Math.pow(10,2);
        result = Math.floor(value*scale)/scale;
        return result;
    }
    public double division (double firstNumber, double secondNumber){
        if(secondNumber==0){
            System.out.println("Ошибка! В арифметических операция нельзя делить на 0");
            System.exit(0);

        }
        else
            value = firstNumber/secondNumber;
             scale = Math.pow(10,2);
             result = Math.floor(value*scale)/scale;

        return result;
    }
}
