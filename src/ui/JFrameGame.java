package ui;

import javax.swing.*;

import util.FrameUtil;

import java.awt.*;

@SuppressWarnings("serial")
/**
 * @className JFrameGame
 * @author wly
 * @date  2023/11/27
 **/

public class JFrameGame extends JFrame {


	//Ĭ����panel
	private JPanelGame panelGame = null;
	
	public JFrameGame() {

		// ��������
		this.setTitle("MonopolyGame");
		// ����Ĭ�Ϲر����ԣ����������
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// ���ô��ڴ�С
		this.setSize(1000, 800);
		// �������û��ı䴰�ڴ�С
		this.setResizable(true);
		// ����
		FrameUtil.setFrameCenter(this);
		// ����Ĭ��Panel
		this.panelGame = new JPanelGame();
		add(this.panelGame);
		
		// ���ñ߿���ʾ
		this.setUndecorated(false);
	}

	public JPanelGame getPanelGame() {
		return panelGame;
	}
}
