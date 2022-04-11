package Zadanie1;

import java.util.InputMismatchException;
import java.util.Scanner;

class Calculation {

     void calculation(Scanner input, Calculator calculator) {
        boolean readComplete = false;
        while (!readComplete) {
            try {
                System.out.println("Podaj pierwszą liczbę: ");
                double a = input.nextDouble();
                input.nextLine();
                System.out.println("Podaj drugą liczbę: ");
                double b = input.nextDouble();
                input.nextLine();
                System.out.println("Podaj operator arytmetyczny (+, -, * lub /):");
                String operator = input.nextLine();
                System.out.println("Wynik: " + Calculator.calculate(a, b, operator));
                readComplete = true;
            } catch (ArithmeticException | UnknownOperatorException ex) {
                System.err.println(ex.getMessage());
            } catch (InputMismatchException e) {
                System.err.println("Nie podałeś liczby, spróbuj jeszcze raz: ");
                input.nextLine();
            }
        }
    }
}
