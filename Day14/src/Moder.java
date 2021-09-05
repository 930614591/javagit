package array;

//public class Moder<T,E> {
public class Moder<T> { //泛型的替换原则，一改全改
    private T obj;
    private  T[] array;
    public void test(T obj){
        System.out.println(obj);
    }
    public T getObj(){
        return obj;
    }
    public  T[] getArrat(){
       return  array;
    }

    //最特殊的情况  <?> 泛型的声明
    public <E> E info(E obj){  //<E>声明新的泛型   <E> E方法的返回类型
        return  obj;
    }
}
