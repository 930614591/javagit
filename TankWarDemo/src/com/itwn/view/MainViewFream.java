package com.itwn.view;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class MainViewFream extends JFrame {
	//设置屏幕的宽高
	private int width=656;
	private int height=675;
	//获取电脑屏幕的宽度高度
	private int sWidth=(int)Toolkit.getDefaultToolkit().getScreenSize().getWidth();
	private int sHeight=(int)Toolkit.getDefaultToolkit().getScreenSize().getHeight();
	//加载小图标资源
	private Image iocImgImage=Toolkit.getDefaultToolkit().getImage("image/1.png");
	
	public MainViewFream() {
		//设置标题
		this.setTitle("坦克大战");
		//设置界面剧中
		this.setBounds((sWidth-width)/2, (sHeight-height)/2, width, height);
		this.setIconImage(iocImgImage);//设置程序图标
		//创建画板。。。
		MainViewPan mainViewPan=new MainViewPan();
		
		//添加键盘监听
		addKeyListener(mainViewPan);
		
		//将画板添加到界面上。。。
		this.add(mainViewPan);
		
		this.setVisible(true);//界面可见
		//固定窗口额大小
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//关闭窗口时释放资源
		
		
	}
}
