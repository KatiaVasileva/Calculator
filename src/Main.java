import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double number1 = getNumber();
        double number2 = getNumber();
        char operation = getOperation();
        double result = calculate(number1, number2, operation);
        System.out.println("Результат операции: " + result);
    }

    public static double getNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");
        if (scan.hasNextDouble()) {
            return scan.nextDouble();
        } else {
            System.out.println("Число не введено. Введите число!");
            return getNumber();
        }
    }

    public static char getOperation() {
        Scanner scan = new Scanner(System.in);
        int operationNumber;
        System.out.println("Введите номер операции:\n 1 - сложение\n 2 - вычитание\n 3 - умножение\n 4 - деление");
        if (scan.hasNextInt()) {
            operationNumber = scan.nextInt();
        } else {
            System.out.println("Номер операции не введен. Введите номер операции!");
            return getOperation();
        }
        switch (operationNumber) {
            case 1:
                return '+';
            case 2:
                return '-';
            case 3:
                return '*';
            case 4:
                return '/';
            default:
                System.out.println("Номер операции введен неверно. Введите номер операции!");
                return getOperation();
        }
    }

    public static double add(double number1, double number2) {
        return number1 + number2;
    }

    public static double subtract(double number1, double number2){
        return number1 - number2;
    }

    public static double multiply(double number1, double number2) {
        return number1 * number2;
    }

    public static double divide(double number1, double number2) {
        if (number2 == 0) {
            System.out.println("На ноль делить нельзя!");
            return Double.NaN;
        }
        return number1 / number2;
    }

    public static double calculate(double number1, double number2, char operation) {
        switch (operation) {
            case '+':
                return add(number1, number2);
            case '-':
                return subtract(number1, number2);
            case '*':
                return multiply(number1, number2);
            case '/':
               return divide(number1, number2);
            default:
                return Double.NaN;
        }
    }
}