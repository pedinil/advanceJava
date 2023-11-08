package functionalinterface;

public class HelloWorldGreeting implements Greeting {

    @Override
    public void printMessage() {
        System.out.println("Hello World");
    }
}
