package ui;

import java.awt.Graphics;
import java.awt.Image;


import model.LandModel;

import javax.swing.*;


/**
 * ����ˢ�²�
 * 
 * @author HCR
 * 
 */
public class Lands extends Layer {

	//����ģ��
	private LandModel land = null;
	//����ͼƬ
	private  Image landsIMG = null;
	
	protected Lands(int x, int y, int w, int h,LandModel land) {
		super(x, y, w, h);
		this.land =land;
		this.landsIMG = this.land.getLandsIMG();
	}

	public void paint(Graphics g) {
		// ���ػ���
		this.paintLands(g);
	}
	
	//���ػ���
	private void paintLands(Graphics g) {
		int x = 0;
		int y = 0;
//		for (int i = 0; i < land.getLand().length; i++) {
//			for (int j = 0; j < land.getLand()[i].length; j++) {
//				if (land.getLand()[i][j] != 0) {
//					// ͼƬ������ʾ
//					g.drawImage(landsIMG, x + j * 60, y + i * 60, x
//							+ (j + 1) * 60, y + (i + 1) * 60,
//							(land.getLand()[i][j] - 1) * 60, 0, land.getLand()[i][j] * 60, 60, null);
//				}
//			}
//		}
		g.drawImage(landsIMG, 0, 0, landsIMG.getWidth(null),
				landsIMG.getHeight(null), 0, 0, landsIMG.getWidth(null),
				landsIMG.getHeight(null), null);
	}


	@Override
	public void startPanel() {
	}

}
