package Demo3;

import java.util.Scanner;

public class MainUI {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        init();

    }
    public static void init(){
        System.out.println("欢迎进入登录界面");
        System.out.println("1.登录\n2.注册\n3.查看所有的用户\n4.退出\n");

        System.out.println("请输入：");
        char ch = sc.next().charAt(0);
        choose(ch);
    }
    public static void choose(char ch) {
        boolean flag;
        switch (ch) {
            case '1':
                System.out.println();

                User user = UserUI.loginUI();
                flag=UserUI.login(user);
                if (!flag)choose('1');
                else{
                    System.out.println("登陆成功，汽车页面正在开发。。。。转到首页");
                    init();
                }
                break;
            case '2':
                flag = UserUI.regist(UserUI.registUI());
                if (flag) {
                    System.out.println("注册成功");
                } else {
                    System.out.println("注册失败");
                    choose('2');
                }

                break;
            case '3':
                UserUI.lookUser();
                init();
                break;
            case '4':
                System.out.println("宁确定要退出码！(yes/no)");
                char c=sc.next().charAt(0);
                if (c=='y'){
                    System.out.println("欢迎下次光临");
                    System.exit(0);
                }
                if(c=='n'){
                    init();
                }
                init();
                break;
            default:
                break;
        }
    }
}
