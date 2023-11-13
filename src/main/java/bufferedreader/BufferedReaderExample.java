package bufferedreader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {
  public static void main(String[] args) {
    try {
      BufferedReader reader =
          new BufferedReader(new FileReader("src/main/java/bufferedreader/test.txt"));
      System.out.println("First line:");
      String firstLine = reader.readLine();
      System.out.println(firstLine);
      System.out.println("other line:");
      StringBuilder stringBuilder = new StringBuilder();
      reader.lines().forEach(line -> stringBuilder.append(line + "  "));
      System.out.println(stringBuilder);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
