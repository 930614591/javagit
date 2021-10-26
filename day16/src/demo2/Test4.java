package demo2;

public class Test4 {
    public static void main(String[] args) {
        try{
            int i=10/0;
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }finally {
            System.out.println("不管怎么样都会执行到这里");
            //再执行return前必须要执行finally
        }
    }
}
