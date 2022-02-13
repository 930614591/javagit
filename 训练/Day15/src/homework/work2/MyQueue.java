package homework.work2;

import java.util.LinkedList;

public class MyQueue<T> {
    private LinkedList<T> list=new LinkedList<>();

    /*
    * 模拟入队列（左队列后插入）
    * */
    public  void push(T t){
        list.addLast(t);
    }

    /*
    * mo模拟出队列，从头删除
    * */
    public  T pop(){
        return  list.removeFirst();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder= new StringBuilder();
        stringBuilder.append("{");
        for (int i = 0; i < list.size(); i++) {
            stringBuilder.append(list.get(i));
            if (i!= list.size()-1){
                stringBuilder.append(",").append(" ");
            }
        }
        stringBuilder.append("}");
        System.out.println(stringBuilder);
        return "MyStack{" +
                "list=" + list +
                '}';
    }

    public int siae() {
        return list.size();
    }
}
