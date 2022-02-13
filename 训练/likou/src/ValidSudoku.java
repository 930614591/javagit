public class ValidSudoku {
    public static void main(String[] args) {
        String[][] z=
                {{"5","3",".",".","7",".",".",".","."},{"6",".",".","1","9","5",".",".","."},{".","9","8",".",".",".",".","6","."},{"8",".",".",".","6",".",".",".","3"},{"4",".",".","8",".","3",".",".","1"},{"7",".",".",".","2",".",".",".","6"},{".","6",".",".",".",".","2","8","."},{".",".",".","4","1","9",".",".","5"},{".",".",".",".","8",".",".","7","9"}};
        System.out.println(isValidSudoku(z));
    }
    public static boolean isValidSudoku(String[][] board) {
        int n1=board.length;//高度
        int n2=board[0].length;//宽度

        for (int t = 0; t <n1; t++) {//每一行
            for (int i = 0; i < n2 - 1; i++) {
                for (int j = i + 1; j < n2; j++) {
                    if(board[t][i]=="."||board[t][j]==".")continue;
                    if (board[t][i]==board[t][j]){
                        /*System.out.println("1.board[t][i]="+t+","+i+","+board[t][i]+",board[t][j]="+t+","+j+","+board[t][j]);*/return false;}
                }
            }
        }
        for (int i = 0; i <n2; i++) {//每一列
            for (int j = 0; j <n1-1; j++) {
                for (int k = j+1; k <n1 ; k++) {
                    if(board[j][i]=="."||board[k][i]==".")continue;
                    if(board[j][i]==board[k][i]){/*System.out.println("2.board[i][j]="+i+","+j+","+board[i][j]+",board[i][k]="+i+","+k+","+board[i][k]);*/return false;}
                }
            }
        }

        for (int i = 0; i <n1; i+=3) {
            for(int z=0;z<n2;z+=3) {//每九个一循环，每次跳过九个小方块

                String[] temp = new String[9];
                int temp2=0;
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        temp[temp2]= board[i+k][z+l];
                        temp2++;
                        //System.out.print(temp[temp2]);
                    }
                }

                for (int j = 0; j <8; j++) {
                    for (int k = j+1; k <9; k++) {
                        if(temp[j]=="."||temp[k]==".")continue;
                        if (temp[j] ==temp[k]) {

                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
/*
*
请你判断一个 9x9 的数独是否有效。只需要 根据以下规则 ，验证已经填入的数字是否有效即可。

数字 1-9 在每一行只能出现一次。
数字 1-9 在每一列只能出现一次。
数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次。（请参考示例图）
数独部分空格内已填入了数字，空白格用 '.' 表示。

注意：

一个有效的数独（部分已被填充）不一定是可解的。
只需要根据以上规则，验证已经填入的数字是否有效即可
*  */
