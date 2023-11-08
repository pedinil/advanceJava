package functionalinterface;

public class GoodMorningGreeting implements Greeting {
    @Override
    public void printMessage() {
        System.out.println("Good morning");
    }
}
