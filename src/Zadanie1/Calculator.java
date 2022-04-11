package Zadanie1;

class Calculator {
    private static final String PLUS = "+";
    private static final String MINUS = "-";
    private static final String MULTIPLY = "*";
    private static final String DIVIDE = "/";

     static double calculate(double a, double b, String operator) throws UnknownOperatorException {
        double result = 0;
        switch (operator) {
            case PLUS:
                result = a + b;
                break;
            case MINUS:
                result = a - b;
                break;
            case MULTIPLY:
                result = a * b;
                break;
            case DIVIDE:
                if (a == 0 || b == 0) {
                    throw new ArithmeticException("Nie możesz dzielić przez 0. Wprowadź odpowiednią liczbę.");
                } else
                    result = a / b;
                break;
            default:
                throw new UnknownOperatorException("Błędny operator arytmetyczny. Proszę wprowadzić poprawny.");
        }
        return result;
    }
}
