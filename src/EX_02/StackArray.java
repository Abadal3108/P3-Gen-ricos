package EX_02;

import java.lang.reflect.Array;
import java.util.Arrays;


public class StackArray<T> {
    private int contador = 0;
    private T[] array;

    public StackArray() {
        array = (T[]) new Object[5];

    }

    public void removeFirst() {
        for (int i = 0; i < contador; i++) {
            this.array[i] = this.array[i + 1];
        }

    }

    public void isEmpty() {

        if (array[0] == null) {
            System.out.println("empty");
        } else {
            System.out.println("is not empty");
        }
    }
    public void getFirst(){
        System.out.println(array[0]);
    }

    public T add(T dato) {

        if (contador == array.length) {
            T[] newArray = (T[]) new Object[array.length + 10];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        } else {
            for (int j = array.length - 1; j > 0; j--) {
                array[j] = array[j - 1];

            }
        }
        contador++;
        array[0] = dato;
        return dato;
    }

    @Override
    public String toString() {
        System.out.println(Arrays.toString(array));
        return null;
    }


}

