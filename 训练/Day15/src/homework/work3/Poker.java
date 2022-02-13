package homework.work3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Poker {
    private final String[] color = {"♥", "♦", "♠", "♣"};
    private final String[] num = {"A", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

    private final LinkedList<String> list = new LinkedList<String>();//牌

    //玩家
    private final LinkedList<String> p1 = new LinkedList<String>();
    private final LinkedList<String> p2 = new LinkedList<String>();
    private final LinkedList<String> p3 = new LinkedList<String>();

    //底牌
    private final LinkedList<String> base = new LinkedList<String>();


    public void init() {
        for (String color : color) {
            for (String num : num) {
                list.add(color + num);
            }
        }
        list.add("小王");
        list.add("大王");
    }

    public void show() {
        for (int i = 0; i < list.size(); i++) {
            if ((i) % 5 == 0) System.out.println();
            System.out.print(list.get(i) + "\t");
        }
        System.out.println();
    }

    public void shuffle() {
        Collections.shuffle(list);
    }//集合工具类

    public void dispath() {
        //发牌
        for (int i = 0; i < list.size(); i++) {
            if (i < list.size() - 3) {
                if ((i + 1) % 3 == 0) {
                    p1.add(list.get(i));
                } else if ((i + 1) % 3 == 1) {
                    p2.add(list.get(i));
                } else
                    p3.add(list.get(i));
            } else {
                base.add(list.get(i));
            }
        }

    }

    public void look() {
        System.out.println("玩家1：" + p1);
        System.out.println("玩家2：" + p2);
        System.out.println("玩家3：" + p3);
        System.out.println("底牌：" + base);
    }


    public boolean isBoom(ArrayList<String> pai) {
        if (pai == null) return false;
        ArrayList<Character> li = new ArrayList<Character>();
        for (int i = 0; i < list.size(); i++) {
            li.add(list.get(i).charAt(1));
        }
        //pan判断手否有炸弹
        for (Character ch : li) {
            if (4 == count(ch, li)) {
                System.out.println(String.format("炸弹：♥%c♠%c♦%c♣%c", ch, ch, ch, ch));
                return true;
            }
        }

        return false;
    }

    private int count(char ch, ArrayList<Character> pai) {
        int count = 0;
        for (Character c : pai) {
            if (ch == c) {
                count++;
            }

        }
        return count;
    }

}
