package homework.work2;

import java.util.LinkedList;

/*
* 模拟一个栈的内存结构
* FILO
* */
public class MyStack<T> {

    private LinkedList<T> list=new LinkedList<>();

    /*
    * 压栈：从头插入
    * */
    public void push(T i){
        list.addFirst(i);
    }
    /*
    * 弹栈：从头取出
    * */
    public T pop(){
        return list.removeFirst();
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
}
