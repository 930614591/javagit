package demo1;

public class Work10 {
    public static void main(String[] args) {
        //9 编写一个应用程序 求一个字符串有多少种字符，每个字符的字数
        String str="asdadsdfdgfdgjcuihvdsuiyfwedsnvhkfhd";
        //char[] ch=new char[str.length()];
        //char[] ch =str.toCharArray();
        String s="";
        for(int i=0;i<str.length();i++){
            if(s.indexOf(str.charAt(i))==-1){
                s+=str.charAt(i);
            }
        }
        System.out.println("总共有"+s.length()+"种字符");
        texttt(str,s);
    }
    public static void texttt(String str,String s){
        for(int i=0;i<s.length();i++){
            int connt=0;
            for (int j=0;j<str.length();j++){
                if (s.charAt(i)==str.charAt(j)){
                    connt++;
                }

            }
            System.out.println("字符"+s.charAt(i)+"出现了"+connt+"次！");
        }
    }
}
