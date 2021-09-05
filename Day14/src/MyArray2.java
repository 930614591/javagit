package array;

import java.util.Random;

/*
 * 通用的数组工具：增删改查
 * @authon long
 * @version 1.0.0
 * */
public class MyArray2 {
    private  static  final int DEFSULT_CAPACITY=10;//数组的默认容量10 默认长度
    private  int capacity;//初始容量，自定义容量
    private  Object[] array;//自定义数组///new String[DEFSULT_CAPACITY];
    private  int size;//记录已经存到那个位置了

    public MyArray2(){
        super();
        capacity=DEFSULT_CAPACITY;
        array=new Object[capacity];//无参默认创建的数组长度就是10
    }

    public MyArray2(int capacity){
        super();
        this.capacity=capacity;
        array=new Object[capacity];//无参默认创建的数组长度就是10
    }
    /*
     * 1.数组中添加元素
     * */
    public boolean add(Object obj){
        //1 判断容量并扩容
        ensureCapacity(size +1);//表示先判断在存放下个元素前，是否需要先扩容 保证先扩容再存放
        //将元素存入数组中
        array[size++]=obj;
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
        Object [] newArray=new String[capacity];
        //3.将以前旧数组的全部数据依次放到新数组中
        for (int i = 0; i< size; i++){    //index实际上就是真正的元素个数，有几个元素就复制几个元素
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
        for (int i = 0; i< size; i++){
            builder.append(array[i]);
            if (i+1== size){
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
    public  Object get(int index){
        rangeCheck(index);//检查是否越界
        return array[index];
        //return "警告：数组越界或者不存在此索引【"+index+"】";
    }

    /*
     * 3.根据指定的索引。来更新此处元素的值
     * index 索引
     * value 待更新的值
     * */
    public void update(int index,String value){
        rangeCheck(index);//检查是否越界
        array[index]=value;//用新值覆盖旧数据

    }

    /*
     * 4.删除指定的索引位置
     * */
    public Object remmov(int index){
        rangeCheck(index);//检查是否越界
        Object temp=array[index];
        if(index==size){//如果是最后一个，置null并结束
            array[index]=null;
            return  temp;
        }
        for(int i=index;i<size;i++){
            array[i]=array[i+1];//被删除后的元素整体向前移动
        }
        if(index<size)size--;else return "";//保障size准确
        return temp;
    }

    /*
     * 5.返回数组中真实的元素个数
     * */
    public  int size(){
        return  size;
    }

    /*
     * 6.返回元素在数组中第一次出新的索引
     * */
    public  int indexOf(String str){
        if (str==null)
            return -1;
        for(int i=0;i<size;i++){
            if (str.equals(array[i])){
                return  i;
            }
        }
        return -1;
    }

    /*
     * 7.判断数组中是否真实存在元素
     * */
    public boolean isEmpty(){

        return size==0;
    }


    /*
     *8. 判断此元素是否在数组中存在
     * */
    public  boolean contains(String value){
        return indexOf(value)!=-1;
    }

    /*
     * 9. 统计当前元素在数组中元素出现的次数
     *
     * */
    public int count(String str){
        if (str==null) return 0;
        int count=0;
        for(int i=0;i<size;i++){
            if (str.equals(array[i])){
                count++;
            }
        }
        return  count;
    }

    /*
     *10. 随机打乱数组中的元素
     * */
    public void shuffle(){
        Random random=new Random();
        int randomeIndex=random.nextInt(size);//生成真是长度内随机数
        swap(randomeIndex);
    }

    private void swap(int index){
        for (int i=0;i<size;i++){
            Object temp=array[i];
            array[i]=array[index];
            array[index]=temp;
        }
    }

    /*
     * 11.反转：数组元素倒序
     *
     * */
    public  void reverse(){
        for (int left=0,right=size-1;left<right;left++,right--){
            Object temp=array[left];
            array[left]=array[right];
            array[right]=temp;
        }
    }


    //专用于判断索引是否越界，越界则抛出异常
    private boolean rangeCheck(int index) {
        if(index<0||index>=capacity){
            // return false;
            throw new ArrayIndexOutOfBoundsException();//数组索引越界异常 手动抛出
        }
        return  true;
    }




}
