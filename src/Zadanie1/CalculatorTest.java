package Zadanie1;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

class CalculatorTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        Calculator calculator = new Calculator();
        Calculation calculation = new Calculation();
        calculation.calculation(input, calculator);
    }


}
