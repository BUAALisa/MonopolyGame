package model;

import java.awt.*;


import javax.swing.*;

import control.GameRunning;

import ui.JPanelGame;
import util.FileUtil;

//��������
public class BackgroundModel extends Tick implements Port{
	//����ͼ��
	private Image bg = null;
	public BackgroundModel (){
	}

	public Image getBg() {
		return bg;
	}

	public void setBg(Image bg) {
		this.bg = bg;
	}


	//��ʼ��Ϸ����
	public void startGameInit (){

		this.bg = new ImageIcon("images/background/bg_0"+GameRunning.MAP+".png").getImage();

	}

	@Override
	public void updata(long tick) {
		this.nowTick = tick;
	}


}
