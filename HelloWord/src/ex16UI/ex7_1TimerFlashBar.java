package ex16UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class ex7_1TimerFlashBar extends JFrame{
	
	private static final long serialVersionUID=-6085533292514353436L;
	private JPanel applicationJPanel;
	JPanel contentPane;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					ex7_1TimerFlashBar frBar=new ex7_1TimerFlashBar();
					frBar.setVisible(true);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		});

	}
	
	public ex7_1TimerFlashBar() {
		addWindowListener(new WindowAdapter() {//添加窗口监视器
			@Override
			public void windowOpened(WindowEvent e) {
				do_this_windowOpened(e);
			}	
		});
		setTitle("警告⚠");//窗口标题？
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置默认的关闭操作
		setBounds(100,100,273,130);//设置大小
		contentPane=new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));//设置边界
		contentPane.setLayout(new BorderLayout(0,0));//设置边界布局
		setContentPane(contentPane);//将contentPane设为frame的内容面板
		JLabel jLabel=new JLabel("系统内存紧缺，请立刻保存数据！");
		jLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(jLabel, BorderLayout.CENTER);//将label加入contentPane
		
	}
	protected void do_this_windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
		Timer timer =new Timer(500,new ActionListener() {
			String title=getTitle();
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(getTitle().isEmpty()) {
					setTitle(title);
				}else {
					setTitle("");
				}
				
				
			}
		});
		timer.start();
				
	}

}
