package homework.work2;

public class Test {
    public static void main(String[] args) {
        MyStack myStack=new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        //先进后出，后进先出
        myStack.toString();
        myStack.pop();
        myStack.toString();
        myStack.pop();
        myStack.toString();
        myStack.pop();
        myStack.toString();
    }

}
