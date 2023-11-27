package ui;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

import util.FrameUtil;

public class WaitFrame extends JFrame {

	public WaitFrame() {
		// ��������
		this.setTitle("MonopolyGame");
		// ����Ĭ�Ϲر����ԣ����������
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ���ô��ڴ�С
		this.setSize(1200, 800);
		// �����û��ı䴰�ڴ�С
		this.setResizable(true);
		// ����
		FrameUtil.setFrameCenter(this);
		add(new JLabel("loading...",JLabel.CENTER));
		setVisible(true);
	}

}