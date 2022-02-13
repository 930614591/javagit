package array;

public class SuperArrayTset {
    public static void main(String[] args) {
        SuperArray<String> list =new SuperArray<String>();

        list.add("123");
        SuperArray<Integer> list2 =new SuperArray<Integer>();
        list2.add(123);
        Integer i = list2.get(1);


    }
}
