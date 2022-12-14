import java.util.Random;
/*已知 rand_N() 可以等概率的生成[1, N]范围的随机数
那么：
(rand_X() - 1) × Y + rand_Y() ==> 可以等概率的生成[1, X * Y]范围的随机数
即实现了 rand_XY()

作者：kkbill
链接：https://leetcode-cn.com/problems/implement-rand10-using-rand7/solution/cong-zui-ji-chu-de-jiang-qi-ru-he-zuo-dao-jun-yun-/
来源：力扣（LeetCode）
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。*/
public class UniformRandomNumber_False {
    public static void main(String[] args) {
        for (int i = 0; i <100 ; i++) {
            int o=rand100();
            if(o==10){
                System.out.println("宁难道就是欧皇吗？居然抽到了10！");
            }//else
            //System.out.println(o+"加油，下次一定！");
        }
    }
    public static int rand8() {
        return (rand4()-1)*2+rand2();//rand4*2
    }
    private static int rand16(){
        return  (rand8()-1)*2+rand2();
    }
    //由rand16做到rand10
    private static int rand10(){
        while (true) {
            int num = rand16();
            if(num<=10){
                return num;
            }
        }
    }
    private static int rand128(){
        return (rand16()-1)*8+rand8();
    }
    private static int rand100(){

        while (true) {
            int num=rand128();
            if (num <= 100) {
                return num;
            }
        }

    }


    private static int rand2(){//均匀生成1，2
        Random df=new Random();
        return df.nextInt(2)+1;
    }
    private static int rand4(){//均匀生成1到4
        return (rand2()-1)*2+rand2();
    }
}
