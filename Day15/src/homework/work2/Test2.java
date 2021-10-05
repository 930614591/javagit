package homework.work2;

public class Test2 {
    public static void main(String[] args) {
        MyQueue<Integer> queue=new MyQueue<>();
        /*
        * 先进先出，后进后出
        * */
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.toString();
        int len=queue.siae();
        for (int i = 1; i <= len; i++) {
            System.out.println("第"+i+"出列的是："+queue.pop());
            
        }

    }
}
