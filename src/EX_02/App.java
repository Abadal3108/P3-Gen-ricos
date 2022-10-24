package EX_02;

import java.util.LinkedList;

public class App {
    public static void main(String[] args) {
        StackArray<Integer> array = new StackArray<>();

        array.add(10);
        array.add(10);
        array.add(10);
        array.add(1);
        array.isEmpty();
        array.toString();
        array.removeFirst();
        array.toString();
        array.add(1);
        array.toString();
        array.getFirst();

    }
}