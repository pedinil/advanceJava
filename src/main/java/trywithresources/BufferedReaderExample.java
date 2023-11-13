package trywithresources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {

  public static void main(String[] args) {
    // if you dont close the Bufferedreader , you may get memory leak and your
    // resource will be open.
    // by using try with resources you make sure the resource is closed after usage
    try (BufferedReader reader =
        new BufferedReader(new FileReader("src/main/java/_06_03/example.txt"))) {
      System.out.println("First line:");
      String firstLine = reader.readLine();
      System.out.println(firstLine);
      System.out.println("Every other line:");
      StringBuilder stringBuilder = new StringBuilder();
      reader.lines().forEach(line -> stringBuilder.append(line + " "));
      System.out.println(stringBuilder);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
