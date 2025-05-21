package org.example;

public class Calculatrice {
    private float input_x;
    private float input_y;
    private char operator;

    public Calculatrice (
            float input_x,
            float input_y,
            char operator

    ){
        this.input_x = input_x;
        this.input_y = input_y;
        this.operator = operator;
    }

    public static float calcul(float input_x, float input_y, char operator){
        return switch (operator) {
            case '+' -> addition(input_x, input_y);
            case '-' -> soustraction(input_x, input_y);
            case '*' -> multiplication(input_x, input_y);
            case '/' -> division(input_x, input_y);
            default -> throw new IllegalArgumentException();
        };
    }

    public static float addition(float input_x, float input_y){
        return input_x + input_y;
    }

    public static float soustraction(float input_x, float input_y){
        return input_x - input_y;
    }

    public static float multiplication(float input_x, float input_y){
        return input_x * input_y;
    }

    public static float division(float input_x, float input_y){
        if(input_y == 0){
            throw new ArithmeticException();
        }
        return input_x / input_y;
    }
}
