package main;

import javax.swing.JFrame;
import javax.swing.UIManager;

import com.jtattoo.plaf.mint.MintLookAndFeel;

import ui.JFrameGame;
import ui.WaitFrame;
import ui.config.FrameConfig;
/**
 * @className Main
 * @author wly
 * @date  2023/11/3
 **/


public class Main {

	static {
		// ������ʽ
		try {
			JFrame.setDefaultLookAndFeelDecorated(true);
			UIManager.setLookAndFeel(new MintLookAndFeel());//��ɫ�߿�
			//UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");
			UIManager.put("OptionPane.okButtonText", "OK");
		} catch (Exception e1) {
			
		}
	}

	public static void main(String[] args) {
		// �����ȴ�����
		
		WaitFrame wFrame = new WaitFrame();
		// ������Ϸ������
		JFrameGame frame = new JFrameGame();
		// ������Ϸ���ô���
		new FrameConfig(wFrame,frame);
		
		try {
			Music.start();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
