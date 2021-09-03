package array;
/*
* 通用的数组工具：增删改查
* @authon long
* @version 1.0.0
* */
public class MyArray {
    private  static  final int DEFSULT_CAPACITY=10;//数组的默认容量10 默认长度
    private  int capacity;//初始容量，自定义容量
    private  String[] array;//自定义数组///new String[DEFSULT_CAPACITY];
    private  int index;//记录已经存到那个位置了

    public MyArray(){
        super();
        capacity=DEFSULT_CAPACITY;
        array=new String[capacity];//无参默认创建的数组长度就是10
    }

    public MyArray(int capacity){
        super();
        this.capacity=capacity;
        array=new String[capacity];//无参默认创建的数组长度就是10
    }
    /*
    * 1.数组中添加元素
    * */
    public boolean add(String str){
        //1 判断容量并扩容
        ensureCapacity(index+1);//表示先判断在存放下个元素前，是否需要先扩容 保证先扩容再存放
        //将元素存入数组中
        array[index++]=str;
        return  false;
    }

    /*
    * 扩容的判断
    * index当前要存放的的元素个数
    * */
    private void  ensureCapacity(int index){
        //System.out.println("数组长度为:"+capacity);
        if(index>=capacity*0.75){
            grow();
            System.out.println("扩容数组长度为:"+capacity);
        }
    }

    /*
    * 真正的扩容
    * */
    private void grow() {
        capacity=capacity+(capacity>>1);//新数组的容量 扩容1.5倍
        //2.创建新数组
        String [] newArray=new String[capacity];
        //3.将以前旧数组的全部数据依次放到新数组中
        for (int i=0; i<index; i++){    //index实际上就是真正的元素个数，有几个元素就复制几个元素
            newArray[i]=array[i];
        }
        //4.j将新的数组对象指向array变量  将地址赋给array，旧的地址会被回收
        array=newArray;
    }

    /*
    * 展示数组中已存在的元素
    * */
    public StringBuilder display(){
        StringBuilder builder=new StringBuilder();
        builder.append("[");
        for (int i=0;i<index;i++){
            builder.append(array[i]);
            if (i+1==index){
                continue;
            }
            builder.append(",");
        }
        builder.append("]");

        return builder;
    }

    /*
    * 查询元素
    * 通过指定的索引类获取这个索引处的值
    * */
    public  String get(int index){
        if(rangeCheck(index)){//检查是否越界
            return array[index];
        }else {
            throw new ArrayIndexOutOfBoundsException();
        }
        //return "警告：数组越界或者不存在此索引【"+index+"】";
    }


    //专用于判断索引是否越界，越界则抛出异常
    private boolean rangeCheck(int index) {
        if(index<0||index>=capacity){
            return false;
            //throw new ArrayIndexOutOfBoundsException();//数组索引越界异常 手动抛出
        }
        return  true;
    }


}
