package genericsexample;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class GenericsExample {

    public static void main(String[] args) {

        oldWay();
        newWay();

    }

    private static void oldWay()
    {
        List shapes = new ArrayList();
        shapes.add("Circle");
        System.out.println(shapes.get(0));

        //get compile error need to be cast
        //String circle = shapes.get(0);

        String circle =(String) shapes.get(0);

        //it accept all type of Objects
        shapes.add(new Rectangle());

        //casting Rectangle to Integer , here no compile exception but you will runtime exception
        Integer rectangle = (Integer) shapes.get(1);

    }

    //correct way to use generics, to make code cleaner and readable
    private static void newWay()
    {
        List<String > shapes = new ArrayList<>();
        shapes.add("Circle");
        System.out.println(shapes.get(0));
        String circle = shapes.get(0);
        shapes.add("Rectangle");
        String rectangle = shapes.get(1);

    }
}
