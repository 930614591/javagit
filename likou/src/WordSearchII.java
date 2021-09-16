/*
import java.util.List;
*/
/*给定一个 m x n 二维字符网格 board 和一个单词（字符串）列表 words，找出所有同时在二维网格和字典中出现的单词。

单词必须按照字母顺序，通过 相邻的单元格 内的字母构成，其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。同一个单元格内的字母在一个单词中不允许被重复使用。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/word-search-ii
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*//*

public class WordSearchII {
    public List<String> findWords(char[][] board, String[] words) {
        int temp1=board.length;
        int temp2=board[0].length;
        for(int i=0;i<temp1;i++){
            for(int j=0;j<temp2;j++){//起始位置

                for(int t=0;t<words.length;t++) {//需要查找的单词遍历
                    char[] arr=words[t].toCharArray();//将本次循环到的单词转化成字符数组用以比对
                    if(board[i][j]!=arr[0])continue;//判断当前位置与首字母是否相同
                    char[][] tempboard=board;//将图表复制一份进行操作
                    int itemp=i;//临时坐标，用于循环内表的定位
                    int jtemp=j;
                    for(int y=0;y<4;y++) {//遍历本单词，发现后置null相应位置

                        //向上，上面没有就不向上

                        //向下，下面没有就不向下
                        //向左，左面没有就不向左
                        //向右，右面没有就不向右
                    }

                }
            }
        }
        return [];
    }
}
*/
