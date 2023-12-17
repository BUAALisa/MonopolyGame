package ui;

import java.awt.Graphics;
import java.awt.Image;

import util.FileUtil;

import model.BackgroundModel;
import java.awt.Color;



/**
 * 
 * �������²�
 *
 * 
 */
public class Background extends Layer {
	//����ͼƬ
	private Image bg = null;
	//����ģ��
	private BackgroundModel background = null;
	private JPanelGame panel;

	public Background(int x, int y, int w, int h,
			BackgroundModel background,JPanelGame panel) {
		super(x, y, w, h);
		this.background = background;
		this.panel = panel;
	}

	public void paint(Graphics g) {
		// ���Ʊ���
		this.paintBg(g);
	}
	//����������
	public void moveToBack() {
		this.panel.getLayeredPane().moveToBack(this);
	}

	//����������
	public void moveToFront() {
		this.panel.getLayeredPane().moveToFront(this);
	}
	
	//�������Ʒ���
	public void paintBg(Graphics g){
		// ���Ʊ���ͼ��
		g.drawImage(this.bg, 0, 0, getWidth(), getHeight(), null);

		// ���Ʊ߿�
		int borderWidth = 5; // ����Ը�����Ҫ�����߿�Ŀ��
		g.setColor(new Color(0,0,0)); // ���ñ߿���ɫΪ��ɫ
		g.fillRect(0, 0, getWidth(), borderWidth); // �ϱ߿�
		g.fillRect(0, 0, borderWidth, getHeight()); // ��߿�
		g.fillRect(getWidth() - borderWidth, 0, borderWidth, getHeight()); // �ұ߿�
		g.fillRect(0, getHeight() - borderWidth, getWidth(), borderWidth); // �±߿�

	}
	

	@Override
	public void startPanel() {
		this.bg = background.getBg();
	}

}
