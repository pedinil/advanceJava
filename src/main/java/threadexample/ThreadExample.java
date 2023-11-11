package threadexample;

public class ThreadExample implements Runnable {
  @Override
  public void run() {
    System.out.println("The Thread from Runnable ");
  }
}
