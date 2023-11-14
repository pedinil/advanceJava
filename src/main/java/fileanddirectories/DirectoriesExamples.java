package fileanddirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DirectoriesExamples {
  public static void main(String[] args) {

    try {
      Files.list(Paths.get("."))
          .filter(file -> !Files.isDirectory(file))
          .forEach(System.out::println);

      if (Files.notExists(Paths.get("src/main/java/fileanddirectories"))) {
        Files.createDirectory(Paths.get("src/main/java/fileanddirectories"));
      }

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
