package ex16UI;

import javax.swing.*;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ex2_3Swing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//设置窗口风格
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		JFrame frame=new JFrame("我的第一个Swing程序！");//创建并初始化顶层容器
		Container container=frame.getContentPane();//获取面板容器
		JPanel panel=new JPanel();//创建并初始化面板panel
		
		container.add(panel);//将面板添加到窗口
		panel.setLayout(new FlowLayout());//设置布局管理器FlowLayout
		final JLabel label=new JLabel();//创建并初始化标签lable
		JButton button=new JButton("Press me!");//
		panel.add(label);
		panel.add(button);
		//添加事假处理
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				label.setText("监听事件响应成功！");
				
				
			}
		});
		//窗口设置结束，开始显示
		frame.addWindowListener(new WindowAdapter() {
			//匿名类用于注册监视器
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		frame.setSize(400,280);
		frame.setVisible(true);
		

	}

}
