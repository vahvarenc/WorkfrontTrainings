package draft;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Karen on 4/2/2017.
 */
public class Test2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        foo(list);

        for (Integer i : list) {
            System.out.println(i);
        }
    }

    public static void foo(List list) {
        list.add("A");
    }
}
