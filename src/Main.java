import java.util.Scanner;

public class Main {

    Scanner reader = new Scanner(System.in);
    double firstNumber;
    double secondNumber;
    double total;
    String operator;

    public Main() {

        System.out.println("First number: ");
        firstNumber = reader.nextDouble();

        while (true) {
            calculate();
        }
    }

    public void calculate() {

        System.out.println("Operator: ");
        operator = reader.next();
        System.out.println("Second number: ");
        secondNumber = reader.nextDouble();

        if (operator.equalsIgnoreCase("+")) {
            total = firstNumber + secondNumber;
            System.out.println("Sum: " + total + "\n");
        } else if (operator.equalsIgnoreCase("-")) {
            total = firstNumber - secondNumber;
            System.out.println("Sum: " + total + "\n");
        } else if (operator.equalsIgnoreCase("/")) {
            total = firstNumber / secondNumber;
            System.out.println("Sum: " + total + "\n");
        } else if (operator.equalsIgnoreCase("x")) {
            total = firstNumber * secondNumber;
            System.out.println("Sum: " + total + "\n");
        } else System.out.println("Error input");
        firstNumber = total;
    }

    public static void main(String[] args) {
        Main m = new Main();
    }

}