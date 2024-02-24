import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("Welcome to the calculator!");
    var scanner = new Scanner(System.in);
    System.out.println("Enter a command:");

    var calc = new Calculator();

    while (true) {
      String command = scanner.next();

      if (command.equals("exit")) break;

      var inputs = new String[2];

      if (command.equals("fibonacci")) {
        inputs[0] = scanner.next();
      } else {
        inputs[0] = scanner.next();
        inputs[1] = scanner.next();
      }

      int toPrint = switch (command) {
        case "add" -> calc.add(Integer.parseInt(inputs[0]), Integer.parseInt(inputs[1]));
        case "subtract" -> calc.subtract(Integer.parseInt(inputs[0]), Integer.parseInt(inputs[1]));
        case "multiply" -> calc.multiply(Integer.parseInt(inputs[0]), Integer.parseInt(inputs[1]));
        case "divide" -> calc.divide(Integer.parseInt(inputs[0]), Integer.parseInt(inputs[1]));
        case "fibonacci" -> calc.fibonacciNumberFinder(Integer.parseInt(inputs[0]));
        default -> -1;
      };

      System.out.println(toPrint);
    }
  }
}
