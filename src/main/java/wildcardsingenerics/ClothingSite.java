package wildcardsingenerics;

import java.util.ArrayList;
import java.util.List;

public class ClothingSite {

  public static void main(String[] args) {

    ShirtItem shirtItem = new ShirtItem();
    ShirtItem shirtItem1 = new ShirtItem();

    // Instead of using abstract method we used the class
    // List<ClothingItem> clothingItems=new ArrayList<>();
    List<ShirtItem> shirtItems = new ArrayList<>();
    shirtItems.add(shirtItem);
    shirtItems.add(shirtItem);

    // here we get error because method accepting clothingitem but we are
    // passing the shirtitems class
    checkoutAllItems(shirtItems);
  }

  static void checkoutItem(ClothingItem item) {
    System.out.println("Item purchased: " + item.getName() + ", price: " + item.getPrice());
  }

  // we can use ? extend clothingitem to solve thiss problem
  // static void checkoutAllItems(List<ClothingItem> clothingItems) {
  static void checkoutAllItems(List<? extends ClothingItem> clothingItems) {

    for (ClothingItem clothingItem : clothingItems) {
      checkoutItem(clothingItem);
    }
  }
}
