public class list {
    /*_Bool InitList(SqList *l,int s=10){};//初始化顺序表
int ListLength(const SqList *l);//求线性表长度
int Locate(const SqList *l,const ElemType *e);//按值查找
_Bool GetData(const SqList *l,int i,ElenType *e);//获得第i个元素
_Bool InsList(SqList *l,int i,const ElemType e);//在第i个元素前插入一个元素
_Bool DelList(SqList *l,int i,ElemType &e);//删除第i个元素
void DestroyList(SqList *l);//销毁顺序表
void ClearList(SqList *l);//清空顺序表
_Bool EmptyList(const SqList *l);//判断是否为空表
void DispList(const SqList *l);//遍历顺序表即输出所有元素*/
    public static void main(String[] args) {
        SqList l=new SqList();
        System.out.println("初始化顺序表：");
        if(l.InitList(l,10)) System.out.println("顺序表初始化成功！");
        System.out.println("为线性表装载内容");
        for (int i=0;i<22;i++){
            l.InsList(l,1,i);
        }
        System.out.println("线性表的长度为："+l.ListLength(l)+",分配的空间为："+l.getSize());
        l.DispList(l);


    }

    class type {
        String ElemType;

        public String getElemType() {
            return ElemType;
        }

        public void setElemType(String elemType) {
            ElemType = elemType;
        }

        void ElemType(String i) {
            this.ElemType = i;
        }
    }//初始数据类型

    static class SqList {//自定义顺序表方法体
        //初始化
        private Integer[] data = new Integer[0];
        private int size;
        private int length;

        public Integer[] getData() {
            return data;
        }

        public void setData(Integer[] data) {
            this.data = data;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public int getLength() {
            return length;
        }

        public void setLength(int length) {
            this.length = length;
        }

        boolean data(Integer s) {
            this.data = new Integer[s];
            return true;
        }

        boolean InitList(SqList l, Integer s) { //初始化顺序表
            if (s <= 0) s = 10;//weidata分配空间
            if (!l.data(s)) return false;//检查是否存在
            l.size = s;//设定最大程度
            l.length = 0;//设定长度为零


            return true;
        }

        //求线性表长度
        int ListLength(SqList l){
            return l.length;
        }

        //按值查找
        int Locate(SqList l,int e){
            for (int i=0;i<l.length;i++){
                if (l.data[i]==e) return i+1;
            }
            return -1;
        }


        //获得第i个元素
        String GetData(SqList l, int i){
            if (i<=0||i>l.length) return "false/获取失败请检查！！！\n";
            return l.data[i-1].toString();
        }

        //在第i个元素前插入一个元素
        boolean InsList(SqList l,int i,int j){
            if (i-1>l.length||i<=0){
                System.out.println(1);
                return false;
            }
            if (l.size==l.length){
                //怕末端是否存满，执行扩容机制
                Integer[] temp=l.data;
                l.data=new Integer[2*l.size];
                l.setSize(2*l.size);
                for(int z=0;z<temp.length;z++){
                    l.data[z]=temp[z];
                }
            }
            //开始插入
            for (int z=l.length;z>i-1;z--){
                l.data[z]=l.data[z-1];
            }
            l.data[i-1]=j;
            //插入完成
            l.length++;
            return true;
        }

        //删除第i个元素
        boolean DelList(SqList l,int i){

            if (i<=0||i>l.length){
                return false;
            }
            for (int j=i-1;j<l.length;j++){
                l.data[j]=l.data[j+1];
            }
            l.length--;

            return true;
        }

        //销毁顺序表
        void DestroyList(SqList l){
            l.data=null;
            l.length=0;
            l.size=0;
        }

        //清空顺序表
        void ClearList(SqList l){
            l.length=0;
        }

        //判断是否为空表
        boolean EmptyList(SqList l){
            if(l.length==0) return true;
            return false;
        }

        //遍历顺序表即输出所有元素
        void DispList(SqList l){
            for (int i=0;i<l.length;i++){
                System.out.print(l.data[i]+"\t");
            }
            System.out.println();
        }

    }


}
