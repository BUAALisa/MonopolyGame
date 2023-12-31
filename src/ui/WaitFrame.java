package ui;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

import util.FrameUtil;
/**
 * @className WaitFrame
 * @author xjy
 * @date  2023/12/13
 **/

public class WaitFrame extends JFrame {

	public WaitFrame() {
		// 设置名字
		this.setTitle("MonopolyGame");
		// 设置默认关闭属性（程序结束）
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 设置窗口大小
		this.setSize(600, 600);
		// 允许用户改变窗口大小
		this.setResizable(true);
		// 居中
		FrameUtil.setFrameCenter(this);
		add(new JLabel("loading...",JLabel.CENTER));
		setVisible(true);
	}

}
