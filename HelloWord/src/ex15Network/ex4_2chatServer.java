package ex15Network;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ex4_2chatServer implements ActionListener,Runnable {
	
	
	JTextArea showArea;
	JFrame mainJframe;
	Container con;
	JScrollPane JSPane;
	JTextField msgText;
	JButton sentBth;
	JPanel pane;
	ServerSocket serverSocket;
	Socket connectToClient;
	DataInputStream inFromClient;
	DataOutputStream outToClient;
	Thread thread;
	
	public ex4_2chatServer() {
														//本类的构造方法
		mainJframe=new JFrame("聊天--服务器端");		//设置界面
		con = mainJframe.getContentPane();
		showArea=new JTextArea();						//创建文本域
		showArea.setEditable(false);
		showArea.setLineWrap(true);
		JSPane=new JScrollPane(showArea);	//创建滚动面板
		msgText=new JTextField();						//创建文本框
		msgText.setColumns(30);
		msgText.addActionListener(this);
		sentBth=new JButton("发送");				//创建发送按钮
		sentBth.addActionListener(this);
		pane=new JPanel();
		pane.setLayout(new FlowLayout());//进行组件布局管理
		pane.add(msgText);
		pane.add(sentBth);
		con.add(JSPane, BorderLayout.CENTER);
		con.add(pane, BorderLayout.SOUTH);
		mainJframe.setSize(500, 400);//设置用户界面大小
		mainJframe.setVisible(true);//设置用户界面可见
		mainJframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		try {
			serverSocket=new ServerSocket(5500);//创建服务套接字
			showArea.append("正在等待对话请求！\n");
			connectToClient = serverSocket.accept();//监听客户端的链接
			inFromClient=new DataInputStream(connectToClient.getInputStream());
			outToClient=new DataOutputStream(connectToClient.getOutputStream());
			thread=new Thread(this);					//启动线程在后台接收对方的消息
			thread.setPriority(Thread.MIN_PRIORITY);		//设置线程优先级
			thread.start(); 								//启动线程
			
			
		} catch (IOException e) {
			// TODO: handle exception
			showArea.append("对不起不能创建服务器！\n");
			msgText.setEditable(false);
			sentBth.setEnabled(false);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ex4_2chatServer();
	}
	

	@Override
	public void run() {//本线程负责将客户端产来的信息显示在对话区域
		// TODO Auto-generated method stub
		try {
			while (true) {
				showArea.append("对方说:“"+inFromClient.readUTF()+"”\n");
				Thread.sleep(1000);//设置线程休眠1s
			}
		} catch (IOException e) {
			// TODO: handle exception
		}catch (InterruptedException e) {
			// TODO: handle exception
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {		//响应按钮事件，发送消息给对方
		// TODO Auto-generated method stub
		String string=msgText.getText();//获取用户输入的文本
		if (string.length()>0) {
			try {
				outToClient.writeUTF(string);			//向客户端发送信息
				outToClient.flush(); 					//清空outToClient
				showArea.append("我说：“"+msgText.getText()+"”\n");
				msgText.setText(null);//设置msgText为null
				
			} catch (IOException e2) {
				// TODO: handle exception
				showArea.append("你的消息：“"+msgText.getText()+"”未能发送出去！\n");
			}
		}
		
	}

}
