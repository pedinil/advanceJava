package functionalinterface;

public class Main {
  public static void main(String[] args) {

    // If you dont use lambda you need to implement the interface for each class and define the
    // method
    HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
    helloWorldGreeting.printMessage();
    GoodMorningGreeting goodMorningGreeting = new GoodMorningGreeting();
    goodMorningGreeting.printMessage();

    // Using lambda Functiontal interface you dont need to implement interface for each class
    // you just define the methon in same line
    Greeting helloWorldGreetingNew = () -> System.out.println("Hello World");
    helloWorldGreetingNew.printMessage();

    Greeting goodMorningGreetingNew = () -> System.out.println("Good morning");
    goodMorningGreetingNew.printMessage();

    Greeting goodAfternoonGreeting = () -> System.out.println("Good afternoon");
    goodAfternoonGreeting.printMessage();
  }
}
