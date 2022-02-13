package array;

public class Student {

    public static void main(String[] args) {
       String s= reverseWords("qqs wwd eef rrrg");
        System.out.println(s);
    }
    public static String reverseWords(String s) {
        
        String[] s2=s.split(" ");
        s="";
        for (int i = 0; i < s2.length; i++) {
            char[] s3=s2[i].toCharArray();
 
            for (int k = 0; k < s3.length/2; k++) {
                char temp=s3[k];
                s3[k]=s3[s3.length-1-k];
                s3[s3.length-1-k]=temp;                
             }
            s2[i]="";
            for (int j = 0; j < s3.length; j++) {
                s2[i]+=s3[j];
            }
            //System.out.println(s2[i]);
            if (i==s2.length-1)s+=s2[i];
            else s+=s2[i]+" ";


        }
       // s+=1;
        //System.out.println(s);
        
        return s;
    }
}
