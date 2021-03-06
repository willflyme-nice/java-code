package MyTools;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import clockparts.ClockPanel;


public class ClockFrame extends JFrame{
	
	private final int frameWidth = 350;
	private final int frameHeight = 400;
	
	private ClockPanel clockPanel = new ClockPanel(); //时钟面板
	
	public ClockFrame() {
		setSize(frameWidth,frameHeight);
		setResizable(false);
		setLocation(460,20);
		setTitle("时钟");
		add(clockPanel); //添加时钟面板
		addWindowListener(new WindowAdapter() {
			public void windowOpened(WindowEvent e) {
				clockPanel.run();  //窗口打开时 时钟启动
			}
		});
	}
	
	public static void main(String[] args) {
		ClockFrame that = new ClockFrame();
		that.setVisible(true);
		that.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

























