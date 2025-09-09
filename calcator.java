import java.util.Scanner;

public class BasicCalculator {
  public static void main(String[] args) {
    double num1, num2;
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the numbers:");
    num1 = sc.nextDouble();
    num2 = sc.nextDouble();

    System.out.println("Enter the operator (+,-,*,/):");
    char op = sc.next().charAt(0);
    double result = 0;

    switch (op) {
      case '+':
        result = num1 + num2;
        break;
      case '-':
        result = num1 - num2;
        break;
      case '*':
        result = num1 * num2;
        break;
      case '/':
        result = num1 / num2;
        break;
      default:
        System.out.println("Wrong input");
    }
    System.out.println("Result: " + num1 + " " + op + " " + num2 + " = " + result);
  }
}


