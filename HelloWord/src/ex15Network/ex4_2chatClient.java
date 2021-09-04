package ex15Network;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ex4_2chatClient implements ActionListener,Runnable {
	
	
	JTextArea showArea;//定义显示区域变量
	JTextField msgTextField;
	JFrame mainFrame;
	JButton sentButton;
	JScrollPane jScrollPane;
	JPanel panel;
	Container container;
	Thread thread=null;
	Socket connectToServerSocket;
	DataInputStream inFromServerDataInputStream;
	DataOutputStream outToServerDataOutputStream;
	
	
	public ex4_2chatClient() {
		mainFrame=new JFrame("聊天--客户端");
		container=mainFrame.getContentPane();
		showArea=new JTextArea();
		showArea.setEditable(false);
		showArea.setLineWrap(true);
		jScrollPane=new JScrollPane(showArea);
		msgTextField=new JTextField();
		msgTextField.setColumns(30);
		msgTextField.addActionListener(this);
		sentButton=new JButton("发送");
		sentButton.addActionListener(this);
		panel=new JPanel();
		panel.setLayout(new FlowLayout());
		panel.add(msgTextField);
		panel.add(sentButton);
		container.add(jScrollPane, BorderLayout.CENTER);
		container.add(panel,BorderLayout.SOUTH);
		mainFrame.setSize(500,400);
		mainFrame.setVisible(true);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		try {
			connectToServerSocket=new Socket("127.0.0.1",5500);
			inFromServerDataInputStream=new DataInputStream(connectToServerSocket.getInputStream());
			outToServerDataOutputStream=new DataOutputStream(connectToServerSocket.getOutputStream());
			showArea.append("连接成功请说话！\n");
			thread=new Thread(this);
			thread.setPriority(Thread.MIN_PRIORITY);
			thread.start();
		} catch (IOException e) {
			// TODO: handle exception
			showArea.append("对不起不能连接到服务器！\n");
			msgTextField.setEditable(false);
			sentButton.setEnabled(false);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method st
		new ex4_2chatClient();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			while (true) {
				showArea.append("对方说:“"+inFromServerDataInputStream.readUTF()+"”\n");
				Thread.sleep(1000);//设置线程休眠1s
			}
		} catch (IOException e) {
			// TODO: handle exception
		}catch (InterruptedException e) {
			// TODO: handle exception
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String string=msgTextField.getText();
		if (string.length()>0) {
			try {
				outToServerDataOutputStream.writeUTF(string);
				outToServerDataOutputStream.flush();
				showArea.append("我说：“"+msgTextField.getText()+"”\n");
				msgTextField.setText(null);
			} catch (IOException e2) {
				// TODO: handle exception
				showArea.append("你的消息：“"+msgTextField.getText()+"”未能发送出去！\n");
			}
		}
		
	}

}
