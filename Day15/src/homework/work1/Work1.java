package homework.work1;

import java.util.ArrayList;

public class Work1 {
    public static void main(String[] args) {
        Customer c1=new Customer(1L,"jack","小广告","重金属","深圳");
        Customer c2=new Customer(2L,"jerry","tv","传媒","北京");
        Customer c3=new Customer(3L,"tom","电话","互联网","上海");
        Customer c4=new Customer(1L,"jack","小广告","重金属","深圳");
        //我们需要将所有的客户存放到集合里
        ArrayList<Customer> list=new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(c4);
        System.out.println(list);
        //ArrayList去重
        ArrayList<Customer> list1= new ArrayList<Customer>();
        for(Customer customer:list){
            if (list1.contains(customer)){
                continue;
            }
            list1.add(customer);

        }
        System.out.println(list1);

        //解法：ahshCode（）和equals（），创建集合来判断存储元素来实现去重contains


    }
}
