package hashmap;

import java.util.HashMap;

public class HashMapExample {

  public static void main(String[] args) {

    //Using HashMap makes sense only
    // when unique keys are available for the data we want to store
    //We should use it when searching for items
    // based on a key and quick access time is an important requiremen
    HashMap<String, Integer> basket = new HashMap<>();
    basket.put("banana", 1);
    System.out.println(basket.get("banana"));

    basket.put("banana", 2);
    System.out.println(basket.get("banana"));

    System.out.println(basket.containsKey("banana"));

    basket.merge("banana",1,Integer::sum);
    basket.merge("apple",1,Integer::sum);
    System.out.println(basket.get("banana"));
    System.out.println(basket.get("apple"));

  }
}
