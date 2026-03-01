package p1;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class true_false {
    public static void main(String[] args) {
        List<String> lst = new ArrayList<String>();
        lst.add("e1");
        lst.add("e2");
        lst.add("e3");
        Deque<String> dq1 = new ArrayDeque<>(lst);
        System.out.println(dq1.offer("e4"));
        System.out.println(dq1.pollFirst());
        System.out.println(dq1.peekFirst());
        System.out.println(dq1.pop());
        System.out.println(dq1);
    }
}
