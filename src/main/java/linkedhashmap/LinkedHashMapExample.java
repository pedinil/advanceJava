package linkedhashmap;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {

  public static void main(String[] args) {

    // Hashmap is not ordered list
    // to have ordered Hashmap you should
    // Use linkedHashmap
    LinkedHashMap<String, Integer> basket = new LinkedHashMap<>();
    basket.put("banana", 1);
    basket.put("apple", 2);
    basket.put("orange", 3);

    basket.forEach((key, value) -> System.out.println(key + ": " + value));
  }
}
