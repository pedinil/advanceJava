package methodreferences;

public class NumberUtils {
  static void evenOrOdd(int number) {
    if (number % 2 == 0) {
      System.out.println(number + " is even");
    } else {
      System.out.println(number + " is odd");
    }
  }
}
