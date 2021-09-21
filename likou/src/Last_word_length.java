public class Last_word_length {
    public static void main(String[] args) {

    }
    public int lengthOfLastWord(String s) {
        char[] temp=s.toCharArray();
        int temp2=temp.length-1;
        for(;temp2>=0;temp2--){
            if (temp[temp2]!=' ') break;
        }

        int n=0;
        for (int i=temp2;i>=0;i--){
            if(temp[i]==' '){
                break;
            }
            n++;
        }
        return  n;
    }
}
