package com.itwn.view;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyUser extends JFrame {
	private int height=600;
	private int width=600;
	//设置界面的高度和宽度
	private int sWidth=(int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
	private int sHight=(int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();
	//获取屏幕的高度和宽度
	private Image image=Toolkit.getDefaultToolkit().getImage("Image/1.png");
	public MyUser() {
		this.setTitle("客户端");
		int x=(sWidth-width)/2;
		int y=(sHight-height)/2;
		this.setBounds(x, y, width, height);
		this.setLayout(new BorderLayout());//创建布局
		
		//创建上中下三个快
		JPanel jp1=new JPanel();
		JLabel jpTitltJLabel=new JLabel("客户端");
		jp1.add(jpTitltJLabel);
		
		
		JTextArea jTextAreaJScrollPane=new JTextArea(25, 25);
		JScrollPane jp2=new JScrollPane(jTextAreaJScrollPane);
		jTextAreaJScrollPane.setEditable(false);//禁止写入
		jp2.setHorizontalScrollBar(null);//去掉滚动条
		
		JPanel jp3=new JPanel();
		JTextField jField=new JTextField(18);//建立一个单行文本输入框
		JButton jButton=new JButton("发送");
		jp3.add(jButton);
		jp3.add(jField);
		
		
		//对文本框内容累加
		StringBuilder stringBuilder=new StringBuilder();
		//添加鼠标点击事件
		jButton.addMouseListener(new MouseAdapter() {
				//jButton按钮点击事件
			public void mouseClicked(MouseEvent e) {
				//获取输入框内的数据
				String string="客户端："+jField.getText().trim()+"\n";
				stringBuilder.append(string);//将输入信息添加到显示区域
				jTextAreaJScrollPane.setText(stringBuilder.toString());//显示区域输出
				//输出后清空输入区域
				jField.setText("");
			}
		
		});
		
		
		
		//三个快排列显示
		this.add(jp1,BorderLayout.NORTH);
		this.add(jp2,BorderLayout.CENTER);
		this.add(jp3,BorderLayout.SOUTH);
		/*
		 * JLabel jlTitle=new JLabel("服务端界面");//设置一条输出 this.add(jlTitle);//显示到屏幕上
		 */		
		//设施界面小图标
		this.setIconImage(image);
		
		//3、设置窗口可见，默认flase
		this.setVisible(true);
		
		//4、关闭窗口时释放资源
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	
	}

}
