package ui;

import java.awt.Graphics;
import java.awt.Image;
import java.util.List;

import javax.swing.ImageIcon;

import model.PlayerModel;
import model.buildings.Building;


/**
 * ����ˢ�²�
 * 
 * @author HCR
 * 
 */
public class Buildings extends Layer {
	//���ط�����Ϣ
	private model.BuildingsModel informationBuilding;
	//��������
	private List<Building> building;
	//house ͼƬ 1-5����
	private  Image HOUSE_01 = new ImageIcon("images/building/house01.png").getImage();
	//house ͼƬ 1-5����
	private  Image HOUSE_02 = new ImageIcon("images/building/house02.png").getImage();
	//α͸��ͼƬ
	public  Image TRANSPARENT = new ImageIcon("images/window/transparent.png").getImage();
	
	protected Buildings(int x, int y, int w, int h,
			model.BuildingsModel informationBuilding) {
		super(x, y, w, h);
		this.informationBuilding = informationBuilding;
	}

	public void paint(Graphics g) {
		// ���ƽ�����
		paintBuildings(g);
	}
	
	//���ƽ�����
	private void paintBuildings(Graphics g) {
		for(Building temp : this.building){
			// ���ݻ���
			paintBuilding(temp,g);
		}
	}
	private void paintBuilding(Building building, Graphics g) {
		int x = 0;
		int y = 0;
		if (building.getOwner() != null) {
			int level = building.getLevel();
			int i = building.getPosX();
			int j = building.getPosY();
			Image temp = building.getOwner().getNumber() == 1 ? this.HOUSE_01
					: this.HOUSE_02;
			if (level > 0) {
				g.drawImage(temp, x + j * 70+120+50+30,y + i * 70 - (temp.getHeight(null) - 70)-90+90,
						   x + (j + 1)* 70+120+50+27, y + (i + 1) * 70-90+90+5, 60 * (level - 1), 0,
						60 * level, temp.getHeight(null), null);
			}
			// ͸�����ǰ���
			g.drawImage(this.TRANSPARENT, x + j * 70, y + i * 70, x + (j + 1)
					* 70, y + (i + 1) * 70, 0, 0, 70, 70, null);
		}
	}


	@Override
	public void startPanel() {
		this.building = this.informationBuilding.getBuilding();
	}

}
