package ex16UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ex2CheckBoxDemo extends JPanel implements ActionListener {
	JCheckBox[] button;
	ImageIcon[] imageIcon;
	JTextField ftf;
	JPanel panel;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	
	//声明本类的构造方法
	public ex2CheckBoxDemo() {
		super();//调用父类的构造方法
		this.setLayout(new GridLayout(2,1));//设置窗口的布局管理器GridLayout
		button = new JCheckBox[3];//初始化数组button
		imageIcon=new ImageIcon[6];//初始化数组imageIcon
		ftf=new JTextField(20);//初始化单行文本区
		panel=new JPanel();//初始化panel
		add(ftf);//像窗口中添加ftf
		
		
		//初始化图标数组
		imageIcon[0]=new ImageIcon("");
		imageIcon[1]=new ImageIcon("");
		imageIcon[2]=new ImageIcon("");
		imageIcon[3]=new ImageIcon("");
		imageIcon[4]=new ImageIcon("");
		imageIcon[5]=new ImageIcon("");
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
