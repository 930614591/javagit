package homework.work3;

import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        Poker poker = new Poker();
        poker.init();
        poker.show();
        poker.shuffle();
        poker.show();
        poker.dispath();
        poker.look();
        Comparator<Integer> comparator = new Comparator<>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            };
        };
       // TreeSet

    }
}
