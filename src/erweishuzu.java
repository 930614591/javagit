import java.util.Scanner;
//井字棋，二维数组
public class erweishuzu{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        final int size=3;
        int[][] a=new int[size][size];
        boolean jieguo=false;
        //读入矩阵
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                a[i][j]=scanner.nextInt();
            }
        }

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }


        //检查行
        for(int i=0;i<3;i++)
        {   int t=0;
            for(int j=0;j<3;j++)
            {
                if(a[i][j]!=a[i][0]){
                    break;
                }
                else t++;

            }
            if (t==a[i].length){
                System.out.println("赢了");
                return ;
            }
        }

        //检查列
        for(int j=0;j<3;j++)
        {   int t=0;
            for(int i=0;i<3;i++)
            {
                if(a[j][i]!=a[j][0]){
                    break;
                }
                else
                    t++;
            }

            if (t==a[j].length){
                System.out.println("赢了");
                return ;
            }
        }
        //检查斜对角

        System.out.println("输了");
        return ;
    }

}