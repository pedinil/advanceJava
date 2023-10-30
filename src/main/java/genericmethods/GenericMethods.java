package genericmethods;

import java.util.Arrays;
import java.util.List;

public class GenericMethods {

  public static void main(String[] args) {
    String[] counties = {"Netherlands", "Germany", "USA"};
    Integer[] numbers = {1, 5, 6};

    List<String> countiesList = covertArrayToList(counties);
    List<Integer> numbersList = covertArrayToList(numbers);

    System.out.println(countiesList);
    System.out.println(numbersList);
  }

  private static <T> List<T> covertArrayToList(T[] arrays) {
    return Arrays.stream(arrays).toList();
  }
}
