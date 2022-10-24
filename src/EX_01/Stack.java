package EX_01;

import java.util.LinkedList;

public class Stack<T> {
    LinkedList<T> ll = new LinkedList<T>();
    public Stack() {
    }
    public void isEmpty() {
        if (ll.isEmpty()) {
            System.out.println("empty");
        } else {
            System.out.println("full");
        }
    }
    public T removeFirst() {
        return ll.removeFirst();
    }
    public T getFirst() {
        return ll.getFirst();
    }

    public T add(T dato) {
        ll.add(dato);
        return dato;
    }

    @Override
    public String toString() {
        System.out.println(ll.toString());
        return null;
    }


}
