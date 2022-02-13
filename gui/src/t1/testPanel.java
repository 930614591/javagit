package t1;
import java.io.*;
import java.awt.*;
import java.io.FilenameFilter;

public class testPanel {
    public static void main(String[] args) {
        Frame frame=new Frame();
        Panel panel=new Panel();
        //设置布局
        frame.setLayout(null);

        //坐标
        frame.setBounds(300,300,500,500);
        frame.setVisible(true);
        //设置大小固定
        frame.setResizable(false);
        FilenameFilter filter = new FilenameFilter() {

            public boolean accept(File f, String name)
            {
                return name.endsWith("");
            }
        };
    }
}
