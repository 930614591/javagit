package Demo3;

import java.util.ArrayList;
import java.util.Scanner;

public class UserUI {
    static  Scanner sc=new Scanner(System.in);
    public static User loginUI(){
        System.out.println("欢迎进入登陆界面：");
        System.out.println("请输入用户名：");
        String username=sc.next();
        System.out.println("请输入密码：");
        String pwd=sc.next();
        if(username!=null &&pwd!=null && !("".equals(username))&& !("".equals(pwd))){
            return new User(username,pwd);
        }
        return null;
    }
    public static boolean login(User user){
        //在此处进行数据验证
        if (user==null){
            return false;
        }
        for(User u:DB.list){
            if(u.getUname().equals(user.getUname())&&u.getPwd().equals(user.getPwd())){
                return true;
            }else{
                System.out.println("登陆失败！用户名或者密码错误");
            }
        }
        return false;

    }

    public static User registUI(){
        System.out.println("欢迎进入注册界面：");
        System.out.println("请输入用户名：");
        String username=sc.next();
        String pwd;

        for(;;){
            System.out.println("请输入密码：");
             pwd=sc.next();
            System.out.println("请输入确认密码：");
            String repwd=sc.next();
            if((repwd.equals(pwd) && "".equals(pwd))){
                System.out.println("两次输入密码不相同");
                continue;
            }
            break;
        }

        if(username!=null  && !("".equals(username))){
            return new User( User.num,username,pwd);//模拟出来id自动增长
        }
        return null;
    }

    public  static boolean regist(User user){
        if (user==null){
            return false;
        }
        //1.判断集合中是否存在此用户
        boolean flag=contatainsUsername(user.getUname());
        //2.若不存在就注册
        if (flag){
            //用户名已经存在
            System.out.println("对不起，用户名已存在");
            User.num--;
        }else{
            return DB.list.add(user);
        }
        return false;
    }

    private static boolean contatainsUsername(String Uname){
        ArrayList<User> list=DB.list;//注册用户的集合
        for(User u:list){
            if (Uname.equals(u.getUname())){
                return true;
            }
        }
        return false;
    }
    public static void lookUser(){
        int num=0;
        for (User u:DB.list){
            System.out.println(u);
            num++;
        }
        System.out.println("共有"+num+"个用户");
    }
}
