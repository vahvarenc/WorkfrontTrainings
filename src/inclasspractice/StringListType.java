package inclasspractice;

import java.util.Arrays;

/**
 * Created by Aram on 3/31/17.
 */
public class StringListType implements StringList {

    // Constants for the default capacity and
    // the resizing factor.
    private final int DEFAULT_CAPACITY = 10;
    private final int RESIZE_FACTOR = 2;

    // Private Fields
    private String[] list;      // The list
    private int elements;    // Number of elements stored

    /**
     * This constructor creates an empty list of the
     * default capacity.
     */
    public StringListType() {
        list = new String[DEFAULT_CAPACITY];
        elements = 0;
    }


    public boolean isEmpty() {
        if (elements == 0) {
            return true;
        }
        return false;
    }

    ;

    public int size() {
        return elements;
    }

    ;

    /**
     * Add a string to the end of the list.
     */
    public void add(String str) {
        // If the list is full, resize it.
        if (elements == list.length)
            resize();

        // Add str to the end of the list.
        list[elements] = str;

        // Adjust the number of elements.
        elements++;
    }

    public void add(int index, String str) {
        if(index < 0 || index >= elements){
            throw new IndexOutOfBoundsException();
        }
        if (elements == list.length)
            resize();
        for (int i = elements; i > index; i++) {
            list[i] = list[i - 1];
        }
        list[index] = str;
    }


    /**
     * Resizes the list to twice its current length.
     */
    public void resize() {
        list = Arrays.copyOf(list, list.length * RESIZE_FACTOR);
    }

    public void clear() {
        for (int i = 0; i < list.length; i++) {
            list[i] = null;
        }
        elements = 0;
    }

    ;


    public boolean contains(String str) {
        for (int i = 0; i < elements; i++) {
            if(list[i] == str)
                return  true;
        }
        return false;
    }


    public String get(int index) {
        if(index < 0 || index >= elements){
            throw new IndexOutOfBoundsException();
        }
        return list[index];
    }

    public int indexOf(String str) {
        for (int i = 0; i < elements; i++) {
            if(list[i] == str)
                return i;
        }
        return -1;
    }


    public boolean remove(String str) {
        if(contains(str)){
            for (int i = indexOf(str); i < elements; i++) {
                list[i] = list[i+1];
            }
            elements--;
            return true;
        }
        return false;
    }

    public String remove(int index){
        if(index < 0 || index >= elements){
            throw new IndexOutOfBoundsException();
        }
        String tmp = list[index];
        for (int i = index; i < elements; i++) {
            list[i] = list[i+1];
        }
        return tmp;
    }

    ;

    public String set(int index, String str) {
        if(index < 0 || index >= elements){
            throw new IndexOutOfBoundsException();
        }
        String tmp = list[index];
        list[index] = str;
        return tmp;
    }


}
