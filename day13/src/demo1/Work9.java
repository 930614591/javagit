package demo1;

public class Work9 {
    //8 从命令行字符串参数中提取数字，组成一个整数



    public static void main(String[] args) {
        String str="as1d231as321d3f23a2s1d23a";
        char[] chart=str.toCharArray();
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<chart.length;i++) {
            if(chart[i]>='0'&&chart[i]<='9'){
                sb.append(chart[i]);
            }
        }
        System.out.println(sb);
    }
}
