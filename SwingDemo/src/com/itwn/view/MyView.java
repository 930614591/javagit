package com.itwn.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Label;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.management.loading.PrivateClassLoader;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyView extends JFrame{
	private int height=600;
	private int width=600;
	//设置界面的高度和宽度
	private int sWidth=(int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
	private int sHight=(int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();
	//获取屏幕的高度和宽度
	
	//获取图片资源
	private Image iocImg=Toolkit.getDefaultToolkit().getImage("image/1.png");
	
	
	public MyView() {
		this.setTitle("服务器端");
		
		//1、设置窗口的标题
		
		//2、设置窗口显示的位置
		//显示的大小
		//00点在左上角
		//x 横坐标 y纵坐标 width宽度 height高度
		int x=(sWidth-width)/2;
		int y=(sHight-height)/2;
		//设置界面的显示位置
		this.setBounds(x, y, width, height);
		//首先设置方位布局
		this.setLayout(new BorderLayout());
		
		//分块思想，分几块就创建几个JPanel   元素添加到JPanel里面
		JPanel jp1=new JPanel();
		JLabel jlTitleJLabel=new JLabel("服务器端");
		//设置字体 自定义字体
		Font font=new Font("楷体",Font.BOLD,25);
		jp1.add(jlTitleJLabel);
		
		
		//JPanel是一个固定面板
		//滚动面板JScrollPane
		//创建一个多行文本本输入框
		JTextArea jTextArea=new JTextArea(25,25);
		JScrollPane jp2=new JScrollPane(jTextArea);//创建滚动面板并将多行文本输入框添加到滚动面板
		//去掉垂直(底部)方向的滚动条
		jTextArea.setEditable(false);//设置多行文本输入框禁止编辑
		jTextArea.setFont(font);//设置字体 自定义字体
		jTextArea.setForeground(Color.GREEN);
		jp2.setHorizontalScrollBar(null);
		
		
		
		JPanel jp3=new JPanel();
		JTextField jField=new JTextField(18);//建立一个单行文本输入框长度18
		//设置字体
		jField.setFont(font);
		JButton jButton=new JButton("发送");//建立一个按钮
		jButton.setFont(font);
		//设置字体颜色
		jField.setForeground(Color.GREEN);
		jp3.add(jField);//添加到屏幕输入框
		jp3.add(jButton);//添加到屏幕按钮
		
		
		StringBuilder sBuilder=new StringBuilder();
		//按钮鼠标点击事件，
		jButton.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					//jf.getText();获取元素输入框的内容
					//System.out.println(jField.getText());
					String talkTextString="服务器："+jField.getText().trim()+"\n";
					sBuilder.append(talkTextString);
					jTextArea.setText(sBuilder.toString());//将输入框文本添加到聊天框
					//添加完毕后清空输入器内容
					jField.setText("");
				}
		});
		 
		//将画纸贴到画板上
		this.add(jp1,BorderLayout.NORTH);
		this.add(jp2,BorderLayout.CENTER);
		this.add(jp3,BorderLayout.SOUTH);
		
		
		/*
		 * JLabel jlTitle=new JLabel("服务端界面");//设置一条输出 this.add(jlTitle);//显示到屏幕上
		 */		
		//设施界面小图标
		this.setIconImage(iocImg);
		
		//3、设置窗口可见，默认flase
		this.setVisible(true);
		
		//4、关闭窗口时释放资源
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}
